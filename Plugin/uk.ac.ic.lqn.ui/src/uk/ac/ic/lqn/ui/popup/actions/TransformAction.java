package uk.ac.ic.lqn.ui.popup.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.net.URI;
//import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
//import org.eclipse.core.runtime.Platform;
//import org.eclipse.debug.ui.console.IConsole;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfModelFactory;
//import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
//import org.eclipse.epsilon.etl.IEtlModule;
import org.eclipse.epsilon.etl.EtlModule;
//import org.eclipse.epsilon.etl.execute.context.*;
//import org.eclipse.epsilon.etl.execute.operations.*;
import org.eclipse.epsilon.eol.EolModule;
//import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.execute.context.Variable;
//import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
//import org.eclipse.ui.console.ConsolePlugin;
//import org.eclipse.ui.console.IConsoleManager;
//import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.uml2.uml.UMLPackage;
//import org.osgi.framework.Bundle;
//import org.eclipse.emf.ecore.impl.*;
//import org.eclipse.ui.console.*;

//import uk.ac.ic.lqn.Lqn2umlTrace.Lqn2umlTracePackage;
//import uk.ac.ic.lqn.lqnmodel.LqnmodelPackage;
//import uk.ac.ic.lqn.lqnmodel.impl.LqnmodelPackageImpl;

import com.mathworks.toolbox.javabuilder.*;
import APDR.*;

public class TransformAction implements IObjectActionDelegate {

	private Shell shell;
	private IFile file;
	protected Object result;
	protected List<Variable> parameters = new ArrayList<Variable>();
	public DiceAPDR maninAPDR =null;
	
	/**
	 * Constructor for Action1.
	 */
	public TransformAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	public static void printToConsole(String message, boolean activate) {  
	    MessageConsoleStream printer = ConsoleFactory.getConsole()  
	            .newMessageStream();  
	    printer.setActivateOnWrite(activate);  
	    printer.println(message);  
	}  
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		try {
			EolModule eolModule = new EolModule();
			
			//Pre-Treansformation for adding inpartition
			eolModule.parse(URI.create("platform:/plugin/uk.ac.ic.lqn.ui/resources/PreTrans.eol"));
			EmfModel eolModel = EmfModelFactory.getInstance().loadEmfModel("UML", new File(file.getLocationURI()), UMLPackage.eINSTANCE,EmfModelFactory.AccessMode.READ_WRITE);
			
			eolModule.getContext().getModelRepository().addModel(eolModel);
			for (Variable parameter : parameters) {
				eolModule.getContext().getFrameStack().put(parameter);
			}
			
			//printToConsole("The APR is statr...",true);
			result = eolModule.execute();
			eolModule.getContext().getModelRepository().dispose();
			
			//Post-Treansformation for adding inpartition
			EtlModule etlModule = new EtlModule();
			etlModule.parse(URI.create("platform:/plugin/uk.ac.ic.lqn.ui/resources/MainTransForReview.etl"));
			
			String tempLocationOfUMLModel = file.getLocationURI().toString();			
			String tempLocationOfLqnModel = tempLocationOfUMLModel.substring(0,tempLocationOfUMLModel.lastIndexOf("/")+1) + "LqnModel.model";
			String tempLocationOfLqnFile = tempLocationOfUMLModel.substring(0,tempLocationOfUMLModel.lastIndexOf("/")+1) + "LqnFile.lqnx";
			String tempLocationOfLqnTraceModel = tempLocationOfUMLModel.substring(0,tempLocationOfUMLModel.lastIndexOf("/")+1) + "LqnTraceModel.model";
			String tempLogFileForAPR = tempLocationOfUMLModel.substring(0,tempLocationOfUMLModel.lastIndexOf("/")+1) + "logForAPR.txt";
			String tempLocationOfConFile = tempLocationOfUMLModel.substring(0,tempLocationOfUMLModel.lastIndexOf("/")+1) + "DICE-APR-Configuration.xml";
			
			String tempLocationOfLINEFile = tempLocationOfUMLModel.substring(0,tempLocationOfUMLModel.lastIndexOf("/")+1) + "LqnFile.xml";
			String tempLocationOfSolvedLINEFile = tempLocationOfUMLModel.substring(0,tempLocationOfUMLModel.lastIndexOf("/")+1) + "LqnFile_line.xml";
			
			//Create a log file
		    URI tempLogFileForAPRURI = new URI(tempLogFileForAPR);
			File LogFileForAPR = new File(tempLogFileForAPRURI);
			FileWriter fileWriter = null;
		    try{
		    	if (!LogFileForAPR.exists()){
		    		LogFileForAPR.createNewFile() ;        
		    	}
		    	 fileWriter =new FileWriter(LogFileForAPR);
		         fileWriter.write("");
		         fileWriter.flush();
		    }catch (IOException e) {
	            e.printStackTrace();
	        }finally{
		        fileWriter.close();
		        LogFileForAPR.deleteOnExit();
	        }		    
		    
		    //Obtain the ecore files for the LQN and LQNTrace models
			File LqnMetaFile = new File(FileLocator.toFileURL(URI.create("platform:/plugin/uk.ac.ic.lqn.ui/resources/lqnmodel.ecore").toURL()).getPath());
			File TraceMetaFile = new File(FileLocator.toFileURL(URI.create("platform:/plugin/uk.ac.ic.lqn.ui/resources/Lqn2umlTrace.ecore").toURL()).getPath());
			
			//Create the LQN model
			URI lqnModelURI = new URI(tempLocationOfLqnModel);
			File lqnModel = new File(lqnModelURI);        
		    try{
				if (!lqnModel.exists()){
			    	lqnModel.createNewFile() ;       
			    }
				 fileWriter =new FileWriter(lqnModel);
		         fileWriter.write("");
		         fileWriter.flush();
		    }catch (IOException e) {
	            e.printStackTrace();
	        }finally{
	        	fileWriter.close();
	        	lqnModel.deleteOnExit();
	        }
		    
		    //create LQN file according to the LQN model
		    URI lqnFileURI = new URI(tempLocationOfLqnFile);
			File lqnFile = new File(lqnFileURI) ;        
		    try{
		    	if (!lqnFile.exists()){
		    		lqnFile.createNewFile() ;        
		    	}
		    	 fileWriter =new FileWriter(lqnFile);
		         fileWriter.write("");
		         fileWriter.flush();
		    }catch (IOException e) {
	            e.printStackTrace();
	        }finally{
	        	fileWriter.close();
	        	lqnFile.deleteOnExit();
	        }
		    		    
		    //create LQN trace model
		    URI lqnTraceModelURI = new URI(tempLocationOfLqnTraceModel);
			File lqnTraceModel = new File(lqnTraceModelURI) ;        
		    try{
		    	if (!lqnTraceModel.exists()){
		    		lqnTraceModel.createNewFile() ;        
		    	}
		    	 fileWriter =new FileWriter(lqnTraceModel);
		         fileWriter.write("");
		         fileWriter.flush();
		    }catch (IOException e) {
	            e.printStackTrace();
	        }finally{
	        	fileWriter.close();
	        	lqnTraceModel.deleteOnExit();
	        }		    
		    
		    //Create a Configuration File for APR 
		    URI ConFileURI = new URI(tempLocationOfConFile);
			File ConFile = new File(ConFileURI) ;        
		    if (!ConFile.exists()){
		    	ConFile.createNewFile() ;        
		    }
		 
		    //Load source model, target model and trace model
			EmfModel etlModelUML = EmfModelFactory.getInstance().loadEmfModel("UML", new File(file.getLocationURI()), UMLPackage.eINSTANCE,EmfModelFactory.AccessMode.READ_ONLY);
			//Not working when using eInstance
			//EmfModel etlModelLQN = EmfModelFactory.getInstance().loadEmfModel("lqnmodel", lqnModel, LqnmodelPackage.eINSTANCE,EmfModelFactory.AccessMode.WRITE_ONLY);
			//EmfModel etlModelLQNTrace = EmfModelFactory.getInstance().loadEmfModel("Trace", lqnTraceModel,Lqn2umlTracePackage.eINSTANCE,EmfModelFactory.AccessMode.WRITE_ONLY);
			//Using ecore instead
			EmfModel etlModelLQN = EmfModelFactory.getInstance().loadEmfModel("lqnmodel", lqnModel, LqnMetaFile,EmfModelFactory.AccessMode.WRITE_ONLY);
			EmfModel etlModelLQNTrace = EmfModelFactory.getInstance().loadEmfModel("Trace", lqnTraceModel,TraceMetaFile,EmfModelFactory.AccessMode.WRITE_ONLY);
			
			etlModule.getContext().getModelRepository().addModel(etlModelUML);
			etlModule.getContext().getModelRepository().addModel(etlModelLQN);
			etlModule.getContext().getModelRepository().addModel(etlModelLQNTrace);
			
			for (Variable parameter : parameters) {
				etlModule.getContext().getFrameStack().put(parameter);
			}
			
			result = etlModule.execute();
			etlModule.getContext().getModelRepository().dispose();			
			
			//Replacing the tags to confirm the LQN XML Schema
			System.setOut(new PrintStream(new FileOutputStream(LogFileForAPR)));
			String[] value = {lqnModel.getAbsolutePath(),lqnFile.getAbsolutePath()};
			LabelRep.replace(value);
			
			//Start APDR
			if (MessageDialog.openConfirm(shell, "Enhancement-APR", "Performance model is generated. Click button to perform Anti-Patterns Detection and Refactoring(APDR)."))
			{
				MessageDialog.openInformation(shell, "Confirm", "The APDR process starts...");
				try{
					maninAPDR = new DiceAPDR();
					//tempLocationOfConFile = tempLocationOfConFile.replace("file:/", "");
					//tempLocationOfLqnFile = tempLocationOfLqnFile.replace("file:/", "");
					maninAPDR.APDR(ConFile.getPath(),lqnFile.getPath());
					//delete tem LINE and Solved LINE file
					URI LINEFileURI = new URI(tempLocationOfLINEFile);
					File LINEFile = new File(LINEFileURI.getPath());
					if (LINEFile.exists()){
						LINEFile.deleteOnExit();
					}
					URI SolvedLINEFileURI = new URI(tempLocationOfSolvedLINEFile);
					File SolvedLINEFile = new File(SolvedLINEFileURI.getPath());
					if (SolvedLINEFile.exists()){
						SolvedLINEFile.deleteOnExit();
					}					
					//read information from logfile
					Reader reader = null;
					BufferedReader br = null;
					StringBuffer sb = new StringBuffer();
					String data = null;
					try {
						reader = new FileReader(LogFileForAPR);
						br = new BufferedReader(reader);
						String nextLine= System.getProperty("line.separator");
						while ((data = br.readLine()) != null) 
						{
							sb.append(data+nextLine);
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							reader.close();
							br.close();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					printToConsole(sb.toString(),true);
					//MessageDialog.openInformation(shell, "APR Result", sb.toString());
				}catch(MWException e){
					System.out.println("The anti-patterns detection and refactoring is not executed due to execeptions.");
				}
				
			}else
			{
				MessageDialog.openInformation(shell, "Cancellation", "The APDR process is terminated.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<Variable> getParameters() {
		return parameters;
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof IFile) {
				file = (IFile) structuredSelection.getFirstElement();
			}
		}

	}

}
