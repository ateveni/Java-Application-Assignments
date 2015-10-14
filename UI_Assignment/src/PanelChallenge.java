import javax.swing.*;
import java.awt.*;

public class PanelChallenge extends JFrame
{
	public PanelChallenge()
	{
		setLayout(null);
		setSize(1250, 500);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setSize(1250, 500);
		panel.setBackground(Color.BLACK);
		
		
		add(panel);
				
		JPanel redPanel = new JPanel();
		redPanel.setLayout(null);
		redPanel.setSize(275, 275);
		redPanel.setLocation(50, 100);
		redPanel.setBackground(Color.RED);
		
		panel.add(redPanel);
				
		JPanel bluePanel = new JPanel();
		bluePanel.setLayout(null);
		bluePanel.setSize(275, 275);
		bluePanel.setLocation(400, 100);
		bluePanel.setBackground(Color.BLUE);
		
		panel.add(bluePanel);
		
		JPanel yellowPanel = new JPanel();
		yellowPanel.setLayout(null);
		yellowPanel.setSize(275, 275);
		yellowPanel.setLocation(750, 100);
		yellowPanel.setBackground(Color.YELLOW);
	
		panel.add(yellowPanel);
		
		/*Label*/
		JLabel red = new JLabel("Red");
		JLabel blue = new JLabel("Blue");
		JLabel yellow = new JLabel("Yellow");
		
		red.setForeground(Color.RED);
		blue.setForeground(Color.BLUE);
		yellow.setForeground(Color.YELLOW);
		
		red.setBounds(175, 5, 100, 150);
		blue.setBounds(525, 5, 100, 150);
		yellow.setBounds(860, 5, 100, 150);
		
		panel.add(red);
		panel.add(blue);
		panel.add(yellow);
		
		/*Buttons*/
		JButton redB = new JButton("red");
		JButton blueB = new JButton("blue");
		JButton yellowB = new JButton("yellow");
		
		redB.setBounds(120, 400, 150, 40);
		blueB.setBounds(470, 400, 150, 40);
		yellowB.setBounds(790, 400, 200, 40);
		
		panel.add(redB);
		panel.add(blueB);
		panel.add(yellowB);
		
		/*setDefaultColorOperation(JFrame.EXIT_ON_CLOSE);*/
		setVisible(true);
		
	}
	
	public static void main(String [] args)
	{
		new PanelChallenge();
	}

}
