import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.text.*;
import java.util.*;

public class Profile extends JFrame implements ActionListener //ItemListener,   
{
	//public JFrame frame1;
	Font myFont;
	JButton up;
	JButton ba;
	JButton lo;
	JLabel un;
	JLabel bg;
	ImageIcon img;
	//JToggleButton button4;
	
	public Profile ()
	{  
		//frame1 = new JFrame
		super("Profile");
		this.setLayout(null);
		this.setResizable(false);
		
		myFont = new Font("Arial", Font.PLAIN, 18);
		
		bg = new JLabel();//(new ImageIcon("bgs.jpg"));
		bg.setBackground(new Color(51,153,255));
	    bg.setBounds(00,00,800,800);
	    this.add(bg);
		
					up = new JButton();
						up.setText("Update");
						up.setBounds(327,680,130,40);
						up.setFont(myFont);
						up.setForeground(Color.BLUE);
						up.setBackground(Color.WHITE);
					
					ba = new JButton();
						ba.setText("Back");
						ba.setBounds(10, 690, 93,23);
						ba.addActionListener(this);
						ba.setFont(myFont);
						ba.setForeground(Color.BLUE);
						ba.setBackground(Color.WHITE);
					    
					
					lo = new JButton();
						lo.setText("LogOut");
						lo.setBounds(510, 20, 135, 30);
						lo.setFont(myFont);
						lo.addActionListener(this);
						lo.setForeground(Color.BLUE);
						lo.setBackground(Color.WHITE);
						
					un = new JLabel();
					un.setBounds(40,210,704,430);
					un.setOpaque(true);
					un.setBackground(Color.cyan);
					
					img = new ImageIcon("MAA1.png");
		            this.setIconImage(img.getImage());
					
		bg.add(up);
		bg.add(ba);
		bg.add(lo);
		bg.add(un);
		
		this.setSize(800, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame1.getContentPane().setBackground(Color.GRAY);
		this.setVisible(true);
	}
    
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == ba)
		{
			new Admin();
			this.setVisible(false);
		}
		else if (e.getSource() == lo)
			   {
				this.setVisible(false);
				 LogIn lp = new LogIn();
			   }
	}
	
	/*public static void main(String[] args)
	{  
		new Notice();
		
    }*/
}