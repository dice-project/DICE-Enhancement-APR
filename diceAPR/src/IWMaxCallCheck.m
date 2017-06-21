function [processors,tasks,calls] = IWMaxCallCheck(inputLQNFileName,ThMaxCall)
% IWMaxCallCheck() checks if there is processor containing Syn-calls greater than threshold
%
% Parameters: 
% inputLQNFileName:     path of the XML file to parse
% 
% Output: 
% processors:   list of processors which contain Syn-calls greater than call thresholds  
% calls:   list of number of syn-calls which greater than call thresholds 
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
disp('Anti-Pattern Detection Start : ');
disp('=======================================================================');
disp('AP1: Infinite Wait.');
disp(['AP1 (IW): Syncall Call Checking - file: ', inputLQNFileName] );
 
%NodeList 
procList = doc.getElementsByTagName('processor');

indexT = 0;           % index for the return processors and calls 
processors = cell(0); % list of the processors which contain syn-call greater than threshold
tasks = cell(0);      % list of the tasks which have too many syn-calls
calls = cell(0);      % list of the number of syn-calls which greater than threshold
temCountCalls = 0;

for i = 0:procList.getLength()-1
    %Node - Processor
    procNode = procList.item(i);
       
    if procNode.getNodeType() == Node.ELEMENT_NODE
        
        %Element 
        procElement = procNode;
        procName = char(procElement.getAttribute('name')); 
        taskList = procNode.getElementsByTagName('task');
        for j = 0:taskList.getLength()-1
            %Node - Task
            taskNode = taskList.item(j);
            if taskNode.getNodeType() == Node.ELEMENT_NODE
            %Element 
            taskElement = taskNode;
            taskName = char(taskElement.getAttribute('name')); 
            
            %% task-activities
            if taskElement.getElementsByTagName('task-activities').getLength > 0
                actList = taskElement.getElementsByTagName('task-activities').item(0).getElementsByTagName('activity');
                for l = 0:actList.getLength()-1
                    %Node - Task
                    actNode = actList.item(l);
                  if actNode.getNodeType() == Node.ELEMENT_NODE && strcmp(char(actNode.getParentNode().getNodeName()),'task-activities')
                    %Element 
                    actElement = actNode;
                    name = char(actElement.getAttribute('name')); 
                    synchCalls = actElement.getElementsByTagName('synch-call');
                    %asynchCalls = actElement.getElementsByTagName('asynch-call');
                    %add synch calls if any
                    if synchCalls.getLength() > 0
                       temCountCalls = temCountCalls+1;
                    end
%               
                  end
                end
            end
            end
        end
        if temCountCalls > ThMaxCall
            indexT = indexT + 1;
            processors{indexT} = procName;
            tasks{indexT} = taskName;
            calls{indexT} = temCountCalls;
        end
        temCountCalls = 0;
    end
end
if ~isempty(processors)
    disp(['Component of following processor has too many Syn-Calls.']);
    for j = 1:indexT
        disp (['processors: ', processors{j},'; component: ', tasks{j},'; number of Syn-calls: ', num2str(calls{j})]);
    end
else
    disp ('Number of Syn-calls is smaller than thresholds.');
    disp('-----------------------------------------------------------------------');
    disp ('AP1 (IW) is not found in LQN model.');
    disp('-----------------------------------------------------------------------');
end    
end