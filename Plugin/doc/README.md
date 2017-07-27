# Introduction

DICE Enhancement tool main goals is to provide feedback to DICE developers on the DIAs (e.g., Apache Storm) behaviour at runtime, leveraging the monitoring data from the DICE Monitoring Platform, in order to help them iteratively enhance the application design.


DICE Enhancement tool is made up of two components (i.e., DICE FG and DICE APR). In the initial version, DICE FG and DICE APR are developed as standalone tools which can be externally integrated with DICE IDE. Currently, they are build as plug-ins and can be invoked within the IDE as popup menu. DICE APR also includes two sub-modules, Tulsa and APDR. In IDE, first DICE FG consumes JSON file, which is obtained from DMON, to parameterize UML models annotated with the DICE profile by using estimation and fitting algorithms. Second, by clicking the APR menu, Tulsa will be invoked to perform a series of transformation tasks which supported by Epsilon Framework to generate a LQN model. Then, APDR starts to call the AP detection algorithm to check the model and anti-patterns boundaries to see if there exists the AP.  Finally, the refactoring suggestions will show to user if AP is detected.


# Prerequisites

The following are prerequisites of setting environment for running DICE Enhancement tool:

- Install [Matlab Compiler Runtime (MCR) R2015a](https://cn.mathworks.com/products/compiler/mcr.html). This is a royalty-free runtime that does not require owning a Matlab license.
- Configure the Matlab Runtime Environment. After installed the MCR, user needs to ensure that  Java environment, Classpath, system path are properly configured. For example, if user installed R2015a(8.5)-64bit in the Windows Operating System under path “C:\MATLAB\MATLAB Runtime”
  - Configure CLASSPATH: to use the compiled classes, user needs to include a file called javabuilder.jar on the Java class path. User needs to add “C:\MATLAB\MATLAB Runtime\v85\toolbox\javabuilder\jar” to CLASSPATH.
  - Configure system PATH: user needs to add the MCR runtime path “C:\MATLAB\MATLAB Runtime\v85\runtime\win64” to the system PATH.

More details of how to configure the environment can be found on [Matlab website](https://uk.mathworks.com/help/compiler_sdk/java/configure-your-java-environment.html#bultjp6-4)


# Getting Started

The DICE Enhancement tool plug-in assumes that your system installed the MCR and your Eclipse project contains:

- a UML model (including deployment diagram and activity diagram) annotated with dice profile.
- DICE-FG-Configuration.xml and DICE-APR-Configuration.xml files. These resources need to be in the same path as UML model.


In the following tutorial we will use the Spark application as the example to show how to use the FG, and use Word count example to show how to use the APR.


To run the DICE FG, first users need to specify the DICE-FG-Configuration.xml,e.g., providing the location of the JSON file, output uml model and the metric.

![FG Configuration File](https://github.com/dice-project/DICE-Enhancement-APR/blob/master/Plugin/doc/Figures/ScreenshotofFGCon.png)

Then, right click the target uml model “netfdpim.uml” to invoke the FG menu.

![FG menu](https://github.com/dice-project/DICE-Enhancement-APR/blob/master/Plugin/doc/Figures/ScreenshotofEnhFG.png)

Click the FG menu, the FG starts to parameterize the target uml model “netfdpim.uml”, and a confirm message box will show and the results will display in the console if the users confirm to run.

![FG run](https://github.com/dice-project/DICE-Enhancement-APR/blob/master/Plugin/doc/Figures/ScreenShotFGRun.png)

![FG console](https://github.com/dice-project/DICE-Enhancement-APR/blob/master/Plugin/doc/Figures/ScreenShotFGConsole.png)

The UML parameter will be updated:

![FG Result](https://github.com/dice-project/DICE-Enhancement-APR/blob/master/Plugin/doc/Figures/ScreenShotFGRes.png)


To run the DICE APR, first users need to specify the DICE-APR-Configuration.xml, e.g., thresholds of CPU utilization.

![APR Configuration File](https://github.com/dice-project/DICE-Enhancement-APR/blob/master/Plugin/doc/Figures/ScreenShotAPRCon.png)

Then, right click the target UML model “WordCount.uml” to invoke the APR menu.

![APR menu](https://github.com/dice-project/DICE-Enhancement-APR/blob/master/Plugin/doc/Figures/ScreenShotEnhAPR.png)

Click the APR menu, the APR starts to transform the the UML model “WordCount.uml” to a LQN model, and two confirm message boxes will show.

![APR Tulsa](https://github.com/dice-project/DICE-Enhancement-APR/blob/master/Plugin/doc/Figures/ScreenShotTulsa.png)

![APR APDR](https://github.com/dice-project/DICE-Enhancement-APR/blob/master/Plugin/doc/Figures/ScreenShotAPRAPDR.png)

The results, i.e., anti-patterns detection and refactoring results, will display in the console if the users confirm to run.

![APR](https://github.com/dice-project/DICE-Enhancement-APR/blob/master/Plugin/doc/Figures/ScreenShotAPRres.png)

