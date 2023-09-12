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
import java.io.*;   
import java.nio.*;  
  
public class Schedule  implements ActionListener , MouseListener {  

	//declearing some
	JFrame f= new JFrame();	
	JLabel header;
	String s1= new String();
	String s2= new String();
	String s3= new String();
	String s4= new String();
	String s5= new String();
	String s6= new String();
	String s7= new String();
	private static JDialog d;
    private JToggleButton button;  
    
	
	
	//main constructor
	Schedule() {  
        f.setTitle("Schedule");  
        f.setLayout(null); 
		
		//giving header
		header =new JLabel("Class Schedule");  	
		header.setBounds(225,30,270,60);
		header.setFont(new Font("Arial", Font.PLAIN, 36));		
		f.add(header);
		
		//Log Out Button
		JButton b = new JButton("Log out");  
        b.setBounds(600,20, 80,40); 
		b.setBackground(Color.WHITE);
		f.add(b);
		
		//Update Button
		JButton  b1  = new  JButton("Update");
		b1.setBounds(340,715,100,30);
		b1.setBackground(Color.WHITE);
		f.add(b1);
		this.b1.addActionListener(this);
		
		//day Label
		Color c1 = new Color(51,153,255); 
		JLabel b2 = new JLabel("         Time");  
        b2.setBounds(25,140, 100,30);
		b2.setOpaque(true);
		b2.setBackground(c1);
		f.add(b2);
		
		JLabel b3 = new JLabel("         Sunday");  
        b3.setBounds(130,140, 100,30); 
		b3.setOpaque(true);
		b3.setBackground(c1);
		f.add(b3);
		
		JLabel b4 = new JLabel("        Monday");  
        b4.setBounds(235,140, 100,30); 
		b4.setOpaque(true);
		b4.setBackground(c1);
		f.add(b4);
		
		JLabel b5 = new JLabel("     Tuesday");  
        b5.setBounds(340,140, 100,30); 
		b5.setOpaque(true);
		b5.setBackground(c1);
		f.add(b5);
		
		JLabel b6 = new JLabel("      Wednesday");  
        b6.setBounds(445,140, 100,30); 
		b6.setOpaque(true);
		b6.setBackground(c1);
		f.add(b6);
		
		JLabel b7 = new JLabel("          Thursday");  
        b7.setBounds(550,140, 100,30); 
		b7.setOpaque(true);
		b7.setBackground(c1);
		f.add(b7);
		
		JLabel b8 = new JLabel("        Saturday");  
        b8.setBounds(655,140, 100,30); 
		b8.setOpaque(true);
		b8.setBackground(c1);
		f.add(b8);
		
		
		Color c2 = new Color(51,204,255); 
		
		
		try{
			File file = new File("hello.txt");
			Scanner s=new Scanner(file); 
			while(s.hasNext())
			{s1=s.next();
			s2=s.next();
			s3=s.next();
			s4=s.next();
			s5=s.next();
			s6=s.next();
			s7=s.next();
			}
		s.close();
		}
		
		
		
		catch(Exception e)
		{System.out.println(e);}
		
				
		
		JLabel b131 = new JLabel();
		b131.setText(s1);
		b131.setBounds(25,175,100,50);
		f.add(b131);
		
		JLabel b132 = new JLabel();
		b132.setText(s2);
		b132.setBounds(130,175,100,50);
		f.add(b132);
		
		JLabel b133 = new JLabel();
		b133.setText(s3);
		b133.setBounds(235,175,100,50);
		f.add(b133);
		
		JLabel b134 = new JLabel();
		b134.setText(s4);
		b134.setBounds(340,175,100,50);
		f.add(b134);
		
		JLabel b135 = new JLabel();
		b135.setText(s5);
		b135.setBounds(445,175,100,50);
		f.add(b135);
		
		JLabel b136 = new JLabel();
		b136.setText(s6);
		b136.setBounds(550,175,100,50);
		f.add(b136);
		
		JLabel b137 = new JLabel();
		b137.setText(s7);
		b137.setBounds(655,175,100,50);
		f.add(b137);
		
		JLabel b12 = new JLabel(); 
        b12.setBounds(25,170, 100,530);
		b12.setOpaque(true);
		b12.setBackground(c2);
		f.add(b12);
		
		JLabel b13 = new JLabel();
		b13.setBounds(130,170, 100,530); 
		b13.setOpaque(true);
		b13.setBackground(c2);
		f.add(b13);
		f.add(b13);
        
		
		JLabel b14 = new JLabel();  
        b14.setBounds(235,170, 100,530); 
		b14.setOpaque(true);
		b14.setBackground(c2);
		f.add(b14);
		
		JLabel b15 = new JLabel();  
        b15.setBounds(340,170, 100,530); 
		b15.setOpaque(true);
		b15.setBackground(c2);
		f.add(b15);
		
		JLabel b16 = new JLabel();  
        b16.setBounds(445,170, 100,530); 
		b16.setOpaque(true);
		b16.setBackground(c2);
		f.add(b16);
		
		JLabel b17 = new JLabel();  
        b17.setBounds(550,170, 100,530); 
		b17.setOpaque(true);
		b17.setBackground(c2);
		f.add(b17);
		
		JLabel b18 = new JLabel();  
        b18.setBounds(655,170, 100,530); 
		b18.setOpaque(true);
		b18.setBackground(c2);
		f.add(b18);
		
		
		
		//frame
        f.setSize(800, 800);
		f.setLocationRelativeTo(null);		
        f.setVisible(true);
		f.setBackground(Color.WHITE);
		
		
		
		//change icon
		Image icon = Toolkit.getDefaultToolkit().getImage("logo.png");
		f.setIconImage(icon);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	
    }  
    public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b1)
		{
			this.setVisible(false);
			EventQueue.invokeLater(new Runnable()
		        {
			        public void run()
			        {
				     try
					    {
					     Update win = new Update();
					     win.read();
					     win.setVisible(true);
			            } 
				     catch (Exception e)
					    {
				          e.printStackTrace();
			            }
		            }
	            });
		}
	}
	
	
}  