import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Toolkit; 
import java.awt.event.*;  
 
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener;  
import javax.swing.*;
import java.awt.Color;  
import java.awt.Graphics;  

import java.text.*;  
import java.util.*; 
 

public class Student extends JFrame
{
    ImageIcon img;
	JLabel labell,sLabel,nLabel,iLabel;
	JPanel panel;
	JButton viewBtn,resultBtn,noticeBtn,sBtn,paymentBtn,s2Btn,lBtn,bBtn; 
	JLabel background;
		Font myFont;
		
	
	
	public Student()
	{
		super("Student");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		
		
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		
		img = new ImageIcon("MAA1.png");
		this.setIconImage(img.getImage());
		
		nLabel = new JLabel("Student Name : ");
		nLabel.setBounds(230, 60, 160, 80);
		nLabel.setOpaque(true);
		myFont = new Font("Arial",Font.PLAIN,16);
		nLabel.setFont(myFont);
		panel.add(nLabel);
		iLabel = new JLabel("  ID: ");
		iLabel.setBounds(230, 110, 160, 80);
		iLabel.setOpaque(true);
		myFont = new Font("Arial",Font.PLAIN,16);
		iLabel.setFont(myFont);
		panel.add(iLabel);
		
		
		viewBtn = new JButton("View Profile");
		viewBtn.setBounds(300, 250, 220, 30);
		viewBtn.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		viewBtn.setForeground(Color.BLUE);
		panel.add(viewBtn);
		
		
		viewBtn.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				ViewProfile v = new ViewProfile();
				v.setVisible(true);
				}
		});
		
		
		resultBtn = new JButton("Result");
		resultBtn.setBounds(300, 300, 220, 30);
		resultBtn.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		resultBtn.setForeground(Color.BLUE);
		
		panel.add(resultBtn);
		
		resultBtn.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				Result f=new Result();
				f.setVisible(true);
				}
		});
		
		
		
		noticeBtn = new JButton("Notice");
		noticeBtn.setBounds(300, 350, 220, 30);
		noticeBtn.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		noticeBtn.setForeground(Color.BLUE);
		panel.add(noticeBtn);
		
		noticeBtn.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				Notice n =new Notice();
				n.setVisible(true);
				}
		});
		
		
		sBtn = new JButton("Class Schedule");
		sBtn.setBounds(300, 400, 220, 30);
		sBtn.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		sBtn.setForeground(Color.BLUE);
		panel.add(sBtn);
		
		paymentBtn = new JButton("Payment");
		paymentBtn.setBounds(300, 450, 220, 30);
		paymentBtn.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		paymentBtn.setForeground(Color.BLUE);
		
		panel.add(paymentBtn);
		
		paymentBtn.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				 EventQueue.invokeLater(new Runnable()
		        {
			        public void run()
			        {
				     try
					    {
					     Payment win = new Payment();
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
		});
		
		
		lBtn = new JButton("Logout");
		lBtn.setBounds(650, 30, 100, 30);
		lBtn.setFont(new Font("Viking Squad", Font.PLAIN, 15));
		lBtn.setForeground(Color.BLUE);
		panel.add(lBtn);
		
		
		
		bBtn = new JButton("Back");
		bBtn.setBounds(30, 700, 80, 30);
		bBtn.setFont(new Font("Viking Squad", Font.PLAIN, 15));
		bBtn.setForeground(Color.BLUE);
		panel.add(bBtn);
		
		
		
		
	
		
	JLabel sLabel=new JLabel(new ImageIcon("p.PNG"));    
		sLabel.setBounds(30,20,170, 230); 
		panel.add(sLabel);
		
	
	this.add(panel);
	}
	
}
		
		
		
	