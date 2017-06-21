function APDR(configFile)
% DICEAPDR(configFile)
% Run Anti-Patterns Detection and Refactoring (APDR) module using the specified configuration XML file.

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

dbFactory = DocumentBuilderFactory.newInstance();
dBuilder = dbFactory.newDocumentBuilder();
metric = struct;
version = '1.0.0';
disp(' ');
disp('-----------------------------------------------------------------------');
disp(['APR module - ', version,' - copyright 2012-2017 (c) - Imperial College London.']);
disp('-----------------------------------------------------------------------');
try
    doc = dBuilder.parse(configFile);
catch exception %java.io.FileNotFoundException
    if ~exist(configFile, 'file')
        disp(['Error: Input configuration file ', configFile, ' is not found']);
        return;
    else 
        rethrow(exception);
    end
end
doc.getDocumentElement().normalize();
metricList = doc.getElementsByTagName('metric');% get the <DICE-APDR> root
for i = 0:metricList.getLength()-1
     metricNode = metricList.item(i);       
    if metricNode.getNodeType() == Node.ELEMENT_NODE        
        %Element 
        parameterList = metricNode.getElementsByTagName('parameter');
        % obtain the entries which are deployed on a processor & the number of the entry is greater than the threshold 
        for j = 0:parameterList.getLength()-1
            parameterNode = parameterList.item(j);
            if parameterNode.getNodeType() == Node.ELEMENT_NODE
                %Element 
                parameterElement = parameterNode;
                metric.(char(parameterElement.getAttribute('name'))) = char(parameterElement.getAttribute('value'));
            end
        end
    end
end
mainEXP(metric.('inputLQNModel'),metric.('inputSolvedLQNModel'),str2num(metric.('ThMaxCall')),str2double(metric.('ThMaxResT')),str2num(metric.('ThMaxEntry')),str2double(metric.('ThMaxUtil')));
end