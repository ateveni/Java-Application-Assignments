import java.awt.*;
import javax.swing.*;

public class GraphicsChallenge extends JPanel 
{
	
	public GraphicsChallenge()
	{
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
				
		g.setColor(Color.BLACK);
		g.drawLine(50, 50, 250, 200);
		g.drawLine(250, 50, 50, 200);
		g.drawOval(50, 250, 200, 150);
		
		g.setColor(Color.BLUE);
		g.drawRect(300, 50, 200, 150);
		g.fillRect(300, 250, 200, 150);
		
		g.setColor(Color.RED);
		g.drawRoundRect(600, 50, 200, 150, 25, 25);
		g.fillRoundRect(600, 250, 200, 150, 25, 25);
		
	}
	
	public static void main(String [] args)
	{
		JFrame frame = new JFrame("Test Figure Challenge");
		
		frame.setSize(900, 500);
		frame.add(new GraphicsChallenge());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
