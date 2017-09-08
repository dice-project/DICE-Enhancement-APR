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
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.console.MessageConsoleStream;

import com.mathworks.toolbox.javabuilder.*;
import DICEFG.*;

public class FGAction implements IObjectActionDelegate {

	private Shell shell;
	private IFile file;
	protected Object result;
	protected List<Variable> parameters = new ArrayList<Variable>();
	public DiceFGRC maninFG =null;
	
	public static void printToConsole(String message, boolean activate) {  
	    MessageConsoleStream printer = ConsoleFactory.getConsole()  
	            .newMessageStream();  
	    printer.setActivateOnWrite(activate);  
	    printer.println(message);  
	}  
	/**
	 * Constructor for Action1.
	 */
	public FGAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		try {
						
			String tempLocationOfUMLModel = file.getLocationURI().toString();
			String tempLocationOfConFile = tempLocationOfUMLModel.substring(0,tempLocationOfUMLModel.lastIndexOf("/")+1) + "DICE-FG-Configuration.xml";
			String tempLogFileForFG = tempLocationOfUMLModel.substring(0,tempLocationOfUMLModel.lastIndexOf("/")+1) + "logForFG.txt";
			
			URI ConFileURI = new URI(tempLocationOfConFile);
			File ConFile = new File(ConFileURI) ;        
		    if (!ConFile.exists()){
		    	ConFile.createNewFile() ;        
		    }
		    
		    URI LogFileForFGURI = new URI(tempLogFileForFG);
			File logFileForFG = new File(LogFileForFGURI) ;        
		    try{
		    	if (logFileForFG.exists()){
		    		logFileForFG.delete();
		    	}
		    	 FileWriter fileWriter =new FileWriter(logFileForFG);
		         fileWriter.write("");
		         fileWriter.flush();
		         fileWriter.close();
		    }catch (IOException e) {
	            e.printStackTrace();
	        }finally{
	        	logFileForFG.deleteOnExit();
	        }
			
			//Start APDR
			MessageDialog.openConfirm(shell, "Enhancement-FG", "FG is going to run. Click buton to continue.");
			try{
				System.setOut(new PrintStream(new FileOutputStream(logFileForFG)));
				maninFG = new DiceFGRC();
				//tempLocationOfConFile = tempLocationOfConFile.replace("file:/", "");				
				maninFG.dicefg(ConFile.getPath());
				//read information from logfile
				Reader reader = null;
				BufferedReader br = null;
				StringBuffer sb = new StringBuffer();
				String data = null;
				try {
					reader = new FileReader(logFileForFG);
					br = new BufferedReader(reader);
					String nextLine= System.getProperty("line.separator");
					while ((data = br.readLine()) != null) 
					{
						sb.append(data + nextLine);
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
			}catch(MWException e){
				System.out.println("The FG is not executed due to execeptions.");
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