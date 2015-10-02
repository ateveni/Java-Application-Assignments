import java.io.*;
import java.util.*;

public class FileSum
{
	public static void main(String [] arg)
	{
		/*write a FileSum class that asks the user to enter numbers
		 * and -1 to end
		 */
		
		try{
		
		File file = new File("Numbers.txt");
		Scanner scan = new Scanner(file);
		PrintWriter p = new PrintWriter(file);
		
		while(scan.nextInt() != -1){
		System.out.println("Enter numbers then enter -1 to end.");
		p.print(scan.nextInt());
		p.print(" ");
		
		}
		
		p.close();
		scan.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		
	}

}
