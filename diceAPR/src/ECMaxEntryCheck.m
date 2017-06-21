function [ECProcessor,ECEntry,ECNumEntry] = ECMaxEntryCheck(inputLQNFileName,ThMaxEntry)
% ECMaxEntryCheck() checks if there is the number of entry is greater than threshold
%
% Parameters: 
% inputLQNFileName:     path of the XML file to parse
% 
% Output: 
% ECProcessor:   list of processors which contain entry are greater than call thresholds
% ECTask:        list of tasks which contain too many entries
% ECNumEntry:    list of number of syn-calls which greater than call thresholds 
%
% Copyright (c) 2012-2017, Imperial College London 
% All rights reserved.


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

dbFactory = DocumentBuilderFactory.newInstance();
dBuilder = dbFactory.newDocumentBuilder();
try
    doc = dBuilder.parse(inputLQNFileName);
catch exception %java.io.FileNotFoundException
    if ~exist(inputLQNFileName, 'file')
        disp(['Error: Input XML file ', inputLQNFileName, ' not found']);
        return;
    else 
        rethrow(exception);
    end
end
 
doc.getDocumentElement().normalize();
disp('AP2: Excessive Calculation.');
disp(['AP2 (EC): Entry Checking - file: ', inputLQNFileName] );
 
%NodeList 
procList = doc.getElementsByTagName('processor');

indexT = 0;           % index for the return processors and calls 
ECProcessor = cell(0); % list of the processors which contain syn-call greater than threshold
ECEntry = cell(0);      % list of the tasks which have too many syn-calls
ECNumEntry = cell(0);      % list of the number of syn-calls which greater than threshold
temCountEntry = 0;
temEntry ='';

for i = 0:procList.getLength()-1
    %Node - Processor
    procNode = procList.item(i);
       
    if procNode.getNodeType() == Node.ELEMENT_NODE
        
        %Element 
        procElement = procNode;
        procName = char(procElement.getAttribute('name')); 
        taskList = procNode.getElementsByTagName('task');
        % obtain the entries which are deployed on a processor & the number of the entry is greater than the threshold 
        for j = 0:taskList.getLength()-1
            %Node - Task
            taskNode = taskList.item(j);
            if taskNode.getNodeType() == Node.ELEMENT_NODE
                %Element 
                taskElement = taskNode;
                taskName = char(taskElement.getAttribute('name'));

                entryList = taskNode.getElementsByTagName('entry');
                temCountEntry = entryList.getLength();
                if temCountEntry > ThMaxEntry
                   for k = 0:temCountEntry-1
                    %Node - Task
                    entryNode = entryList.item(k);
                    if entryNode.getNodeType() == Node.ELEMENT_NODE
                    %Element 
                        entryElement = entryNode;
                        name = char(entryElement.getAttribute('name'));
                        temEntry = [temEntry,' ',name];
                    end
                   end
                   indexT = indexT + 1;
                   ECProcessor{indexT} = procName;
                   ECEntry{indexT} = temEntry;
                   ECNumEntry{indexT} = temCountEntry;
                end 
            end
        end
        temCountEntry = 0;
        temEntry = '';
    end
end
if ~isempty(ECProcessor)
    disp(['The following processor has too many entries.']);
    for j = 1:indexT
        disp (['processors: ', ECProcessor{j},'; number of components: ', num2str(ECNumEntry{j})]);
    end
else
    disp ('Number of Entry is smaller than thresholds.')
    disp('-----------------------------------------------------------------------');
    disp ('AP2 (EC) is not found in LQN model.');
    disp('=======================================================================');
    disp('-----------------------------------------------------------------------');
end    
end