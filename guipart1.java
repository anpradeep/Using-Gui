import java.awt.BorderLayout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class guipart1 extends JFrame	
{
	static JFrame frame = new JFrame();
	public static void Frame()
	{
		Button A = new Button();
		
		frame.setSize(400,400);
		frame.setBackground(Color.cyan);
		frame.setVisible(true);
		frame.setTitle("Just a Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void textboxes()
	{
		Component a1 = frame; 
		frame.add(a1);		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CREATING THE WINDOW
		Frame();
		textboxes();
		
	
		
			
	}

}

