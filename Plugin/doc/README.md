# Introduction
=====================

DICE Enhancement tool main goals is to provide feedback to DICE developers on the DIAs (e.g., Apache Storm) behaviour at runtime, leveraging the monitoring data from the DICE Monitoring Platform, in order to help them iteratively enhance the application design.


DICE Enhancement tool is made up of two components (i.e., DICE FG and DICE APR). In the initial version, DICE FG and DICE APR are developed as standalone tools which can be externally integrated with DICE IDE. Currently, they are build as plug-ins and can be invoked within the IDE as popup menu. DICE APR also includes two sub-modules, Tulsa and APDR. In IDE, first DICE FG consumes JSON file, which is obtained from DMON, to parameterize UML models annotated with the DICE profile by using estimation and fitting algorithms. Second, by clicking the APR menu, Tulsa will be invoked to perform a series of transformation tasks which supported by Epsilon Framework to generate a LQN model. Then, APDR starts to call the AP detection algorithm to check the model and anti-patterns boundaries to see if there exists the AP.  Finally, the refactoring suggestions will show to user if AP is detected.


# Prerequisites
=====================

The following are prerequisites of setting environment for running DICE Enhancement tool:

- Install [Matlab Compiler Runtime (MCR) R2015a](https://cn.mathworks.com/products/compiler/mcr.html). This is a royalty-free runtime that does not require owning a Matlab license.
- Configure the Matlab Runtime Environment. After installed the MCR, user needs to ensure that  Java environment, Classpath, system path are properly configured. For example, if user installed R2015a(8.5)-64bit in the Windows Operating System under path “C:\MATLAB\MATLAB Runtime”
  - Configure CLASSPATH: to use the compiled classes, user needs to include a file called javabuilder.jar on the Java class path. User needs to add “C:\MATLAB\MATLAB Runtime\v85\toolbox\javabuilder\jar” to CLASSPATH.
  - Configure system PATH: user needs to add the MCR runtime path “C:\MATLAB\MATLAB Runtime\v85\runtime\win64” to the system PATH.

More details of how to configure the environment can be found on [Matlab website](https://uk.mathworks.com/help/compiler_sdk/java/configure-your-java-environment.html#bultjp6-4) 
