import java.awt.Point;
import java.util.Scanner;

public class TestPoint 
{
	public static void main(String[] args)
	{
		Point a = new Point();
		Point b = new Point(2,5);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the x value for the corrdinate.");
		a.setX(input.nextInt());
	
		System.out.println("Enter the y value for the corrdinate.");
		a.setY(input.nextInt());
		
		System.out.println("Enter the x value for the 2ND corrdinate.");
		b.setX2(input.nextInt());
		
		System.out.println("Enter the y value for the 2ND corrdinate.");
		b.setY2(input.nextInt());
		
		
		System.out.println("Corrdinate A: ");
		System.out.print(a);
		System.out.println("Corrdinate B: " + b.getX2() + " ," + b.getY2());
		System.out.print(b);
		//System.out.println("The distance between the two points is " + 
		//a.distance(a.getX(), a.getY(), b.getX2, b.getY2);
	}

}
