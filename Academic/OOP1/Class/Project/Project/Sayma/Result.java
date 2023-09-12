import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;
 
  public class Result extends JFrame
  { 
      ImageIcon img;
	 JLabel m,n,i,c,s;
	 JButton bBtn, lBtn;
	 Font myFont;
	 JTable table;
	 JScrollPane scroll;
	 DefaultTableModel model;
	 JPanel panel;
	 
	 
	 String [] colums={"EXAM","SUBJECT","MARKS","GRADE"};
	 String [] rows=new String[4];
	 
	 
	 
	 public Result()
	 {
		 super("Result");
		 this.setSize(800, 800);
		 
		 this.getContentPane().setLayout(null);
		
		 this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		 
		 panel=new JPanel();
		 panel.setLayout(null);
		 
		 Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		img = new ImageIcon("MAA1.png");
		this.setIconImage(img.getImage());
	    n = new JLabel("Student Name :  ");
		n.setBounds(20, 20, 220, 80);
		//pLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		n.setFont(myFont);
		this.add(n);
		
		i = new JLabel("ID :  ");
		i.setBounds(20, 50, 220, 80);
		//pLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		i.setFont(myFont);
		this.add(i);
		
		
		
		c = new JLabel("Class : ");
		c.setBounds(20, 80, 220, 80);
		c.setFont(new Font("Viking Squad", Font.BOLD, 16));
		//s1.setForeground(Color.BLUE);
		this.add(c);
	
		
		s = new JLabel("Section : ");
		s.setBounds(20, 110, 220, 80);
		s.setFont(new Font("Viking Squad", Font.BOLD, 16));
		//s1.setForeground(Color.BLUE);
		this.add(s);
		
		
		
		
		m = new JLabel(" Marksheet ");
		m.setBounds(290, 130, 200,130);
		//m.setBackground(Color.GRAY);
		m.setOpaque(true);
		
		myFont = new Font("Arial",Font.BOLD,24);
		
		m.setFont(myFont);
		this.add(m);
		
		
		 
		 bBtn = new JButton("Back");
		bBtn.setBounds(30, 700, 80, 30);
		bBtn.setForeground(Color.BLUE);
		bBtn.setFont(new Font("Viking Squad", Font.PLAIN, 15));
		
		this.add(bBtn);
		 
		 lBtn = new JButton("Logout");
		lBtn.setBounds(650, 30, 80, 30);
		lBtn.setFont(new Font("Viking Squad", Font.PLAIN, 15));
		lBtn.setForeground(Color.BLUE);
		this.add(lBtn);
		
		
		
		
		
		
		
		table=new JTable();
		 model=new DefaultTableModel();
		 model.setColumnIdentifiers(colums);
		 table.setModel(model);
		 table.setFont(myFont);
		 table.setSelectionBackground(Color.PINK);
		 table.setRowHeight(20);
		 scroll=new JScrollPane(table);
		 scroll.setBounds(50,300,740,265);
		 this.add(scroll);
		 
		 }
		 
		 
		
		
			
		
		public static void main(String[]args)
		{
        Result r=new Result();
		r.setVisible(true);
	}
	
  }