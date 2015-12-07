import java.util.*;
import javax.swing.*;
import java.awt.*;

//WRITE A PROGRAM THE WILL RECIEVE CELSIUS VALUES AND CONVERT TO FAHRENHEIT
//F=9/5C + 32

public class Question1 
{
	JFrame frame = new JFrame("Temperature Converter");
	frame.setSize(100, 200);
	frame.setVisible(true);
	
		//JPANEL AND COMPONENTS
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JLabel enter = new JLabel("Enter temperature.");
		JLabel celsius = new JLabel("Celsius: ");
		JTextField c = new JTextField(" ");
		JLabel fahrenheit = new JLabel("Fahrenheit: ");
		JTextField f = new JTextField(" ");
		JButton convert = new JButton("Convert");
		
		f = 9/5*c +32;
		
		
		//ADD COMPONENTS TO PANEL
		panel.add(enter);
		panel.add(celsius);
		panel.add(fahrenheit);
		panel.add(convert);
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

}
