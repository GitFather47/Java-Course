import java.awt.EventQueue;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent.*;
import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import java.text.*;
import java.util.*;
import javax.swing.JToggleButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.text.*;


public class Form  implements /*ItemListener,*/ActionListener
{
	
	JFrame f= new JFrame();
	JButton b1;
	private JToggleButton button;
	Color c2 = new Color(51,204,255);
	
	
	Form()
	{
		

		//Log  out Button
		JButton b = new JButton("Log out");  
        b.setBounds(664,20,110,30); 
		b.setBackground(Color.WHITE);
		f.add(b);

		//back button
		b1 = new JButton("Back");  
        b1.setBounds(20,700,110,30); 
		b1.setBackground(Color.WHITE);
		f.add(b1);
		this.b1.addActionListener(this);
		
		//header
		JLabel l1= new JLabel("School Admission  Form");
		l1.setBounds(200, 70,400,50);
		l1.setFont(new Font("Viking Squad", Font.PLAIN, 36));
		f.add(l1);
		
		//change icon
		Image icon = Toolkit.getDefaultToolkit().getImage("logo.png");
		f.setIconImage(icon);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//name
		JLabel nl= new JLabel(" Name");
		nl.setBounds(50,150,145,40);
		nl.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		nl.setOpaque(true);
		nl.setBackground(c2);
		f.add(nl);
		
		JTextField ntf = new JTextField();  
        ntf.setBounds(195,150, 500,40);
		ntf.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		f.add(ntf);
		
		//desired class
		JLabel cl = new JLabel(" Desired Class");
		cl.setBounds(50,210,145,40);
		cl.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		cl.setOpaque(true);
		cl.setBackground(c2);
		f.add(cl);
		
		String clas[]={"Nursury","One","Three","Six","Nine-Ten","Eleven-Twelve"};        
		JComboBox cb=new JComboBox(clas);   
		cb.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		cb.setBackground(Color.WHITE);
		cb.setBounds(195, 210,500,40);    
		f.add(cb);
		
		//DOB
		JLabel dl = new JLabel(" Date of Birth");
		dl.setBounds(50,270,145,40);
		dl.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		dl.setOpaque(true);
		dl.setBackground(c2);
		f.add(dl);
		
		JTextField dtf = new JTextField();  
        dtf.setBounds(195,270, 500,40);
		dtf.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		f.add(dtf);
		
		
		
		//Gardina
		JLabel gl = new JLabel(" Gardian Name");
		gl.setBounds(50,330,145,40);
		gl.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		gl.setOpaque(true);
		gl.setBackground(c2);
		f.add(gl);
		
		JTextField gn = new JTextField();  
        gn.setBounds(195,330, 500,40);
		gn.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		f.add(gn);
		
		//phone
		JLabel pl = new JLabel(" Phone No.");
		pl.setBounds(50,390,145,40);
		pl.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		pl.setOpaque(true);
		pl.setBackground(c2);
		f.add(pl);
		
		JTextField pn = new JTextField();  
        pn.setBounds(195,390, 500,40);
		pn.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		f.add(pn);
		
		//gender
		JLabel l2 = new JLabel(" Gender");
		l2.setBounds(50,450,145,40);
		l2.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		l2.setOpaque(true);
		l2.setBackground(c2);
		f.add(l2);
		
		JRadioButton r1=new JRadioButton("Male");    
		JRadioButton r2=new JRadioButton("Female");    
		r1.setBounds(220,450,100,30); 
		r1.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		r2.setBounds(330,450,100,30);
		r2.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		ButtonGroup bg=new ButtonGroup();    
		bg.add(r1);bg.add(r2);    
		f.add(r1);f.add(r2);  
		
		//email
		JLabel el = new JLabel(" Email");
		el.setBounds(50,510,145,40);
		el.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		el.setOpaque(true);
		el.setBackground(c2);
		f.add(el);
		
		JTextField em = new JTextField();  
        em.setBounds(195,510, 500,40);
		em.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		f.add(em);
		
		//submit button
		JButton sb = new JButton("Submit");  
        sb.setBounds(330,600, 100,40); 
		sb.setBackground(Color.WHITE);
		f.add(sb);
		
		
		//frame
		f.setTitle("Admission Form");  
        f.setLayout(null);
		f.setSize(800, 800);  
        f.setVisible(true); 
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b1)
		{
			f.setVisible(false);
			new LogIn1();
		}
	}
	
	
}

/*

//label Declear

JLabel = new JLabel(" ");
		.setBounds(50,110,125,30);
		.setFont(new Font("Viking Squad", Font.PLAIN, 18));
		.setOpaque(true);
		.setBackground(c2);
		f.add();



//text field
JTextField  = new JTextField();  
        .setBounds(195,150, 500,40);
		.setFont(new Font("Viking Squad", Font.PLAIN, 20));
		f.add();


//date Practise
int day=dat.getJCalendar().getDayChooser().getDay();
		int month=dat.getJCalendar().getMonthChooser().getMonth();
		int year=dat.getJCalendar().getYearChooser().getYear();
		String dateNow=year+"/"+month+"/"+day;
		System.out.println(dateNow);
	//***************************************************
	//For setting date of date picker:
		dat.setDateFormatString("dd-MM-yyyy");
		Calendar currentDate = Calendar.getInstance();
		dat.setDate(currentDate.getTime());
		
		//try 2
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		datePicker.setBounds(195,270,500,40);
		f.add(datePicker);
		
		
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFormattedTextField.AbstractFormatter;

import java.lang.Object;
import javax.swing.text.Utilities;
*/