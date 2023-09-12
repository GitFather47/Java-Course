import javax.swing.*;
import java.awt.*;
import java.awt.event.*;   
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
import java.awt.Color;  
import java.awt.Graphics;  
import java.text.*;  
import java.util.*;    
import static javax.swing.JOptionPane.showMessageDialog;
  
public class LogIn extends JFrame implements /*ItemListener,*/ActionListener {  
 
	//JLabel header;
	//private static JDialog d;  
	Font myFont;
	JButton b;
	JButton b1;
	JComboBox c1;
	//boolean matched = false;
    ///private JToggleButton button;
    ImageIcon img;
	//Image icon;
    JPasswordField value;
	JTextField text1;
	JLabel ml,l4,l5,bg,l2,l1,l3,cm;
	//HashMap<String, String>li = new HashMap<String, String>();
	//main constructor
	LogIn(/*HashMap<String,String> LIOriginal*/) 
	{ 

    super("Log In");
	
	
     //li = LIOriginal;

        this.setLayout(null); 
		this.setResizable(false);
		
		myFont = new Font("Arial", Font.PLAIN, 28);
		
		bg = new JLabel();//(new ImageIcon("bgs.jpg"));
		bg.setBackground(new Color(51,153,255));
	    bg.setBounds(00,00,800,800);
	    this.add(bg);
		
		l2 = new JLabel(new ImageIcon("School Small.png"));
	    l2.setBounds(0,0,786,763);
		bg.add(l2);
			
		l5=new JLabel(new ImageIcon("Pass1.png"));    
		l5.setBounds(308,231,30, 30); 
		l2.add(l5);
		
		l4=new JLabel(new ImageIcon("pic1.png"));    
		l4.setBounds(308,186,30, 30); 
		l2.add(l4);
		
		l1 = new JLabel(new ImageIcon("logo2.png"));
		l1.setBounds(333,60,120,106);
		l2.add(l1);
		
		img = new ImageIcon("MAA1.png");
		this.setIconImage(img.getImage());
		
		cm=new JLabel("Login as:");    
		cm.setBounds(600,50,80, 30);
		cm.setFont(new Font("Arial", Font.PLAIN, 15));
		l2.add(cm);
		String []s1 = {"Admin","Student","Teacher"};
		c1 = new JComboBox(s1);
		c1.setBounds(680,50,80,30);
		l2.add(c1);
		
		/*Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);*/
	
		value = new JPasswordField();   
		value.setBounds(348,231, 130,30);
		value.setEchoChar('*');
		value.addActionListener(this);
		l2.add(value);
		
		text1 = new JTextField();  
        text1.setBounds(348,186, 130,30);
		text1.addActionListener(this);
		l2.add(text1);
	
		//Pending
		  b = new JButton();  
		  b.setText("Log in");
	      b.setBounds(308,276, 170,30);
		  b.setFont(myFont);
		  b.setForeground(Color.BLACK);
		  b.setBackground(Color.WHITE);
		  b.addActionListener(this);
		  b.setFocusable(false);
		  l2.add(b);


          ml = new JLabel();
	      ml.setBounds(308,305,250,30);
	      ml.setFont(myFont);
	      l2.add(ml);
		//forgot button
		    l3 = new JLabel();
			l3.setText("Forgot Password?");
			l3.setBounds(270,340, 110,20);
			//l3.setFont(new Font("Viking Squad", Font.PLAIN, 15));
		    l2.add(l3);
            b1 = new JButton();
			b1.setText("Click Here");
			b1.setBounds(380,340,135,20);
			b1.setFont(new Font("Arial", Font.PLAIN, 18));
			b1.setForeground(Color.BLACK);
			b1.setBackground(Color.WHITE);
		    l2.add(b1);
		
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);		
        this.setVisible(true);  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
	}  

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b && text1.getText().isEmpty()== false && value.getText().isEmpty()== false && c1.getSelectedItem()== "Admin")
		{
			/*String uid = text1.getText();
			String pass = String.valueOf(value.getPassword());
			
			if(li.containsKey(uid))
			{
				if(li.get(uid).equals(pass))
				{
					//ml.setForeground(Color.GREEN);
					//ml.setText("Successful");
					JOptionPane.showMessageDialog(null,"Successfully Logged In.");
					Admin a = new Admin();
					this.setVisible(false);
				}
				else
				{
					ml.setForeground(new Color(204, 0, 0));
					ml.setFont(new Font(null,Font.BOLD,25));
					ml.setText("Wrong Password");
				}
			}			
			else
			{
				ml.setForeground(new Color(204, 0, 0));
					ml.setFont(new Font(null,Font.BOLD,25));
					ml.setText("No Matching");
			}*/
			boolean matched = false;
			try {
				File fl = new File("login.txt");
                FileReader fr = new FileReader(fl);
                BufferedReader br = new BufferedReader(fr);
                String line;
				
                while ((line = br.readLine()) != null) {
                    if (line.equals(text1.getText().toString()+" "+value.getText().toString())) {
                        matched = true;
                        break;
                    }
                }
                fr.close();
            } catch (Exception a) {
				a.printStackTrace();
            }
            if (matched) {

                // ------------------- Disabling previous frame so that new frame can emerge
                JOptionPane.showMessageDialog(null,"Successfully Logged In.");
				this.setVisible(false);

                // ------------------------- Sample() contains new JFrame
				
                Admin a = new Admin();
				a.setVisible(true);
            } else
			{
                showMessageDialog(null, "Invalid Username or password! Try Again");

            }
			
			/*this.setVisible(false);
			Admin a = new Admin();
			a.setVisible(true);*/
			
		}
	}
}	
	/*public void actionPerformed(ActionEvent me)
	{
		
	}*/
	
  