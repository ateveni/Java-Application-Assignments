/*ask your name using an input dialog.
 * 
 * uses a confirm dialog to confirm "is <name> your name?"
 * with a yes/no buttons.
 * 
 * clicking yes should proceed to the next step.
 * 
 * clicking no should bring the input dialog again. 
 * 
 * uses a message dialog to respond "nice to meet you <name>" 
 * 
 * USE JOPTIONPANE
 */
import javax.swing.*;
import java.util.*;

public class MeetingDialog 
{
	public static void main(String [] args)
	{
		
		  String name = JOptionPane.showInputDialog(null, "What is your name?",
		            "Input Name", JOptionPane.PLAIN_MESSAGE);
		  		      
		  int yesNo = JOptionPane.showConfirmDialog(null, "Is " + name + " your name?",
		            "Confirm Name", JOptionPane.YES_NO_CANCEL_OPTION);
		  
		  
		      switch (yesNo) 
		      {
		         case JOptionPane.YES_OPTION:
		            System.out.println("You clicked yes"); break;
		         case JOptionPane.NO_OPTION:
		            System.out.println(JOptionPane.showInputDialog(null, "What is your name?",
		            		"No input option", JOptionPane.PLAIN_MESSAGE));break;
		         case JOptionPane.CANCEL_OPTION:
		            System.out.println("You clicked Cancel"); break;
		      }
	}

}
