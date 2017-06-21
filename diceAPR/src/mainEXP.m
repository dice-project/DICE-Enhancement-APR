function mainEXP(LQNModel, SolvedLQNModel,MaxCall,MaxResT,MaxEntry,MaxUtil)
% THIS SCRIPT RUNS THE APR EXPERIMENTS
% Copyright (c) 2012-2017, Imperial College London 
% All rights reserved.
%% input files
inputLQNFileName = fullfile(LQNModel);

%% output files
outputLQNSolvedFileName = fullfile(SolvedLQNModel);

%% Anti-Pattern boundaries 
global ThMaxCall;   % Global constraints of thresholds of the syn-call
ThMaxCall = MaxCall;      % default thresholds is 2

global ThMaxResT;   % Global constraints of thresholds of the response time
ThMaxResT = MaxResT;   % default thresholds is 10.0

global ThMaxEntry;  % Global constraints of thresholds of Entry
ThMaxEntry = MaxEntry;     % default thresholds is 3

global ThMaxUtil;   % Global constraints of thresholds of the response time
ThMaxUtil = MaxUtil;    % default thresholds is 0.9

%% Anti-Pattern Detection & Refactoring
%% AP 1: Infinite Wait (A large amount of Syn-call is required within one Processor)
%      Step 1: IWMaxCallCheck() checks if number of synch-call is greater than ThMaxCall
%      Step 2: IWMaxResTCheck() checks if the response time of the potential processor (obtained from Step 1) is greater than ThMaxResT
[IWProcessor,IWTask,IWNumSynCall] = IWMaxCallCheck(inputLQNFileName,ThMaxCall);
if ~isempty(IWProcessor)
    [AP1Processor,AP1ResTime]=IWMaxResTCheck(outputLQNSolvedFileName,IWProcessor,IWTask,ThMaxResT);
end
%% AP 2: Excessive Calculation (A Task, holding a large amount of Entry, is deployed on a single Processor)
%       Step 1: ECMaxEntryCheck() checks if number of entry is greater than ThMaxEntry
%       Step 2: ECMaxUtilCheck() checks if utilization of processor (obtained from Step 1) is greater than ThMaxUtil
[ECProcessor,ECEntry,ECNumEntry] = ECMaxEntryCheck(inputLQNFileName,ThMaxEntry);
if ~isempty(ECProcessor)
    [AP2Processor,AP2Util]= ECMaxUtilCheck(outputLQNSolvedFileName,ECProcessor,ECEntry,ECNumEntry,ThMaxUtil);
end
end