import java.util.*;
import javax.swing.JOptionPane;

public class Division 
{
	public static void main(String [] args)
	{
		String num1, num2;
		int numOne, numTwo, ans;
		Scanner input = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "Enter two numbers to be divided.\n");
		//SURROUND INPUT WITH EXCEPTION SO IT DOESN'T PASS
		num1 = JOptionPane.showInputDialog("Enter the first number.");
		num2 = JOptionPane.showInputDialog("Enter the second number.");
		
		numOne = Integer.parseInt(num1);
		numTwo = Integer.parseInt(num2);
		
		try
		{
		}	
		//arithmetic exception
		
		ans = numOne/numTwo;
	
		JOptionPane.showMessageDialog(null, num1 + " divided by " + num2 + " equals " + ans);
	
		System.exit(0);
	}

}
