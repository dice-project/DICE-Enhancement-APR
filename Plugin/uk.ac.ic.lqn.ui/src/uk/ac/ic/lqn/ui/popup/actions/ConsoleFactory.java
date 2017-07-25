package uk.ac.ic.lqn.ui.popup.actions;

import org.eclipse.ui.console.ConsolePlugin;  
import org.eclipse.ui.console.IConsole;  
import org.eclipse.ui.console.IConsoleFactory;  
import org.eclipse.ui.console.IConsoleManager;  
import org.eclipse.ui.console.MessageConsole;  
  
public class ConsoleFactory implements IConsoleFactory {  
  
    private static MessageConsole console = new MessageConsole("", null);  
    static boolean exists = false;  
  
    /** 
     * Open Console
     * */  
    public void openConsole() {  
        showConsole();  
    }  
  
    /** */  
    /** 
     * Display Console
     * */  
    private static void showConsole() {  
        if (console != null) {  

            IConsoleManager manager = ConsolePlugin.getDefault()  
                    .getConsoleManager();  
            IConsole[] existing = manager.getConsoles();  
            exists = false;  
            for (int i = 0; i < existing.length; i++) {  
                if (console == existing[i])  
                    exists = true;  
            }  
            if (!exists) {  
                manager.addConsoles(new IConsole[] { console });  
            }    
        }  
    }  
  
    /** */  
    /** 
     * Close Console 
     * */  
    public static void closeConsole() {  
        IConsoleManager manager = ConsolePlugin.getDefault()  
                .getConsoleManager();  
        if (console != null) {  
            manager.removeConsoles(new IConsole[] { console });  
        }  
    }  
  
    /** 
     * Obtain Console 
     *  
     * @return 
     */  
    public static MessageConsole getConsole() {  
  
        showConsole();  
  
        return console;  
    }  
}