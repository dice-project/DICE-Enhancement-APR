function [AP2Processor,AP2Util] = ECMaxUtilCheck(outputLQNSolvedFileName,ECProcessor,ECEntry,ECNumEntry,ThMaxUtil)
% ECMaxUtilCheck() checks if the utilizaion of obtained processors is greater than threshold
%
% Parameters: 
% outputLQNSolvedFileName:   path of the XML file to parse
% ECProcessor:               obtained processors from the ECMaxEntryCheck() 
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

% EC Processors and the corresponding utilization
AP2Processor = cell(0); % list of the processors whose respons time higer than thresholds 
AP2Util = cell(0);   % list of the response time
AP2NumOfTask = cell(0);   % list of the number of tasks (component) 
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
disp(['AP2 (EC): Utilization Checking - file: ', outputLQNSolvedFileName] );
 
%Processor List
procList = doc.getElementsByTagName('processor');

for i = 0:procList.getLength()-1
    %Node - Processor
    procNode = procList.item(i);
       
    if procNode.getNodeType() == Node.ELEMENT_NODE
        
        %Element 
        procElement = procNode;
        procName = char(procElement.getAttribute('name'));
        [boolFind,inx] = ismember(procName,ECProcessor); 
        if boolFind == 1
            procUtil = str2double(char(procElement.getAttribute('util')));
            if procUtil > ThMaxUtil
                indexT = indexT + 1;
                AP2Processor{indexT} = ECProcessor{inx};
                AP2NumOfTask{indexT} = round(ECNumEntry{inx}/2);
                AP2Util{indexT} = procUtil;
            end
        end
    end
end
if ~isempty(AP2Processor)
    disp('-----------------------------------------------------------------------');
    disp ('AP2 (EC) is found in LQN model.');
    disp('-----------------------------------------------------------------------');
    disp('Utilization of the following processor is higher than thresholds.');
    for j = 1:indexT
        disp (['processors: ', AP2Processor{j},', utilization: ', num2str(AP2Util{j},'%.15f')]);
    end
    disp('-----------------------------------------------------------------------');
    disp ('Refactoring suggestions for AP2 (EC) ');
    disp('-----------------------------------------------------------------------');
    for k = 1:indexT
        disp (['Migrating ',num2str(AP2NumOfTask{k}),' components from ',AP2Processor{k},' to a new server.']);
    end
else
    disp ('Utilization is smaller than thresholds.');
    disp('-----------------------------------------------------------------------');
    disp ('AP2 (EC) is not found in LQN model');
end
    disp('=======================================================================');
    disp('Anti-Pattern Detection End.');
    disp('-----------------------------------------------------------------------');
end