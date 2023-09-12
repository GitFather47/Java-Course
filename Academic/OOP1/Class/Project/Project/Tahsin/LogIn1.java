import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener;  
import javax.swing.*;
import java.awt.Color;  
import java.awt.Graphics;  
import java.text.*;  
import java.util.*;    
  
public class LogIn1 extends JFrame implements /*ItemListener,*/ActionListener {  
 
	JLabel header;
	private static JDialog d;  
	JButton b,b1;
    private JToggleButton button;  
    
	//main constructor
	LogIn1() {  
        setTitle("Log In");  
        setLayout(null); 

		
		//password field & login button
		JPasswordField value = new JPasswordField();   
		value.setBounds(348,231, 130,30);
		value.setEchoChar('&');
		
		JLabel l5=new JLabel(new ImageIcon("Pass1.png"));    
		l5.setBounds(308,231,30, 30); 
		add(l5);
		
		JTextField text1 = new JTextField();  
        text1.setBounds(348,186, 130,30);
		
		JLabel l4=new JLabel(new ImageIcon("pic1.png"));    
		l4.setBounds(308,186,30, 30); 
		add(l4);
		
		b = new JButton("Log in");  
			b.setBounds(308,276, 170,30);
			b.setFont(new Font("Viking Squad", Font.PLAIN, 25));
			b.setForeground(Color.BLACK);
			b.setBackground(Color.WHITE);
			this.b.addActionListener(this);
		

		add(b);
		add(text1);
		add(value);

		
		
		//forgot button
		JLabel l3=new JLabel("Forgot Password?");    
			l3.setBounds(287,345, 110,20);
			//l3.setFont(new Font("Viking Squad", Font.PLAIN, 15));
		
        b1 = new JButton("Click Here");  
			b1.setBounds(399,340, 110,30);
			b1.setFont(new Font("Viking Squad", Font.PLAIN, 16));
			b1.setForeground(Color.BLACK);
			b1.setBackground(Color.WHITE);
			this.b1.addActionListener(this);
		add(l3);
		add(b1);
		
		
		//Adding logo
		JLabel label1 = new JLabel(new ImageIcon("logo2.png"));
			label1.setBounds(333,60,120,106);
			add(label1);
			
		
		/***** setting time *****
			SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			
			String time = new String();
			String date = new String();
			
			JLabel timeLabel = new JLabel();
			JLabel dateLabel = new JLabel();
			
			timeLabel.setBounds(660,695,110,30);
			timeLabel.setFont(new Font("Arial", Font.PLAIN, 18));
			timeLabel.setForeground(Color.BLACK);
			
			dateLabel.setBounds(667,715,105,30);
			dateLabel.setFont(new Font("Viking Squad", Font.PLAIN, 15));
			dateLabel.setForeground(Color.BLACK);
		
		/***********************/
		
		JLabel label = new JLabel(new ImageIcon("School Small.png"));
			label.setBounds(0,0,786,763);
			add(label);
		
		
		//frame
		//add(timeLabel);
		//add(dateLabel);
        setSize(800, 800);
		setLocationRelativeTo(null);		
        setVisible(true);  
		
		
		//change icon
		Image icon = Toolkit.getDefaultToolkit().getImage("logo.png");
		setIconImage(icon);
		
		
		
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		/******** setting time increasing ******
		/*while(true)
			{
				time = timeFormat.format(Calendar.getInstance().getTime());
				timeLabel.setText(time);
				
				date = dateFormat.format(Calendar.getInstance().getTime());
				dateLabel.setText(date);
				
				try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}*/
		/************************************/		
    }   


	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b)
		{
			JOptionPane.showMessageDialog(null,"Successfully Logged In.");
			setVisible(false);
			//new Teacher();
		}
		else if (e.getSource() == b1)
		{
			setVisible(false);
			new ForgotPass();
		}
	}
	
}  