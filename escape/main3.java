//main part 2
//import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;



public class main3 extends JFrame
{
	public static void main(String[] args) throws InterruptedException
	{
		JFrame frame = new JFrame();
		frame.setSize(700, 700);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		frame.setLayout(new BorderLayout());
		frame.setContentPane(new JLabel(new ImageIcon("images\\Road.PNG"));
		frame.setLayout(new FlowLayout());

		frame.setSize(699,699);
		frame.setSize(700,700);


		frame.setTitle("Crossy Avenuez");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		new main3()
	}


}