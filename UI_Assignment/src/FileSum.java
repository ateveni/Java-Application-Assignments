/*question 1*
 * Asks the user to enter numbers and -1 to end
 * write the numbers to a file. 
 * Separate them with a space character.
 * Read the numbers from the file and print the sum to the console.
 * */

import java.io.*;
import java.util.*;

public class FileSum {
	public static void main(String [] args)
	{
		try
		{
		PrintWriter file = new PrintWriter("Numbers.txt");
		int num = 0;
		
		while(num != -1)
			{
				Scanner input = new Scanner(System.in);
		
				System.out.println("Enter numbers and -1 to end");
				num = input.nextInt();
				
				file.println(num + " ");
			}
			
			file.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		Scanner numFile = new Scanner(new File("Numbers.txt"));
		filereader(numFile);
		
		int x = 0;
		int sum = 0;
		
		while(x != -1)
		{
			System.out.println(numFile.nextInt());
			sum = sum + numFile.nextInt();
		
		}
	}
}

