import javax.swing.*;

public class Frame 
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame("Title");
		JButton button = new JButton("Okay");
		
		frame.setSize(100, 100);
		frame.setVisible(true);
				
		frame.add(button);
		button.setLocation(25, 25);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
