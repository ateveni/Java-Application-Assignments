import java.util.Scanner;

public class Test
{
	public static void main(String [] args)
	{
		String test = "";
		double t;
		Scanner ask = new Scanner(System.in);
		
		System.out.println("What is your call rate?");
		getCallRate(ask.nextDouble());
		
		System.out.println("What is your monthly rate?");
		getMonthlyRate(ask.nextDouble());
		
		System.out.println("What was your talk time?");
		getTime(ask.nextDouble());
		
		System.out.println("What was your long distance talk time?");
		getLongDistanceTime(ask.nextDouble());
		
		System.out.println(toString());
		
		
	}

}
