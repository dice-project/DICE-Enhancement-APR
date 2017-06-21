function [AP1Processor,AP1ResTime] = IWMaxResTCheck(outputLQNSolvedFileName,IWProcessor,IWTask,ThMaxResT)
% IWMaxResTimeCheck() checks if the response time of obtained processors is greater than threshold
%
% Parameters: 
% outputLQNSolvedFileName:    path of the XML file to parse
% IWProcessor:                obtained processors from the IWMaxCallCheck() 
% 
% Output: 
% AP1Processor:   list of processors whose response time greater than thresholds  
% AP1ResTime:     list of response time which greater than thresholds 
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

format long;

% IW Processors and the corresponding response time
AP1Processor = cell(0); % list of the processors whose respons time higer than thresholds 
AP1ResTime = cell(0);   % list of the response time
AP1Task = cell(0); % list of the tasks
indexT = 0;

dbFactory = DocumentBuilderFactory.newInstance();
dBuilder = dbFactory.newDocumentBuilder();
try
    doc = dBuilder.parse(outputLQNSolvedFileName);
catch exception %java.io.FileNotFoundException
    if ~exist(outputLQNSolvedFileName, 'file')
        disp(['Error: Input XML file ', outputLQNSolvedFileName, ' not found']);
        return;
    else 
        rethrow(exception);
    end
end
 
doc.getDocumentElement().normalize();
disp(['AP1 (IW): Response Time Checking - file: ', outputLQNSolvedFileName] );
 
%Entry List (each processor has a corresponding Entry in solved file) 
entryList = doc.getElementsByTagName('Entry');

for i = 0:entryList.getLength()-1
    %Node - Entry
    entryNode = entryList.item(i);
       
    if entryNode.getNodeType() == Node.ELEMENT_NODE
        
        %Element 
        entryElement = entryNode;
        entryName = char(entryElement.getAttribute('name'));
        [boolFind,inx] = ismember(entryName,IWProcessor); 
        if boolFind == 1
            entryResTime = str2double(char(entryElement.getAttribute('responseTime')));
            if entryResTime > ThMaxResT
                indexT = indexT + 1;
                AP1Processor{indexT} = IWProcessor{inx};
                AP1Task{indexT} = IWTask{inx};
                AP1ResTime{indexT} = entryResTime;
            end
        end
    end
end
if ~isempty(AP1Processor)
    disp('-----------------------------------------------------------------------');
    disp ('AP1 (IW) is found in LQN model.');
    disp('-----------------------------------------------------------------------');
    disp('Response time of the following processor is higher than thresholds.');
    for j = 1:indexT
        disp (['processors: ', AP1Processor{j},', response time: ', num2str(AP1ResTime{j},'%.15f')]);
        disp (['Component: ', AP1Task{j},' might need to be redesign or duplicating.']);
    end
    disp('-----------------------------------------------------------------------');
    disp ('Refactoring suggestions for AP1 (IW) ');
    disp('-----------------------------------------------------------------------');
    disp('The following components might need to be redesigned or duplicated.');
    for j = 1:indexT
        disp (['Component: ', AP1Task{j}]);
    end
    disp('-----------------------------------------------------------------------');
else
    disp ('Response time is smaller than thresholds.')
    disp('-----------------------------------------------------------------------');
    disp ('AP1 (IW) is not found in LQN model.');
    disp('-----------------------------------------------------------------------');
end    
end