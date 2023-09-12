import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent.*;
import java.text.*;
import java.util.*;
import java.beans.*;
import java.io.*;
import java.nio.file.*;

public class UpdateProfile implements ActionListener  
{
	public JFrame frame1;
	
	JRadioButton button2;
	JRadioButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button9;
	
	JTextField text;
	JTextField text1;
	JTextField text2;
	JTextField text3;
	JTextField text4;
	JTextField text5;
	JTextField text6;
	//JTextField text7;
	
	JComboBox button8;
	
	File f_path;
	String icon_path = new String();
	
	String MF =  new String();
	String combo =  new String();
	
	String path = "C:/Users/mmras/Desktop/JavaProject/files/user.txt";
	String content;
	String [] line = new String [1000];
	String [][] data = new String [1000][100];
	String [] temp = new String [1000];
	
	String [] nLine = new String [100];

	String pk3 = new String();
	int  a;
	
	public void ComboBox1()
	{    
		String Bloodgrp[]= new String[] {"Select One","A+","A-","B+","B-","O+","O-","AB+","AB-"};
		button8 = new JComboBox(Bloodgrp);
		button8.setBounds(269,405,200,30);
		button8.setSelectedItem(data[a][9]);
		button8.setFont(new Font("Viking Squad", Font.PLAIN, 25));
		button8.setForeground(new Color(132, 210, 252));
		button8.setBackground(Color.WHITE);
			this.button8.addActionListener(this);
	}
	
	public UpdateProfile (String pk)
	{
		pk3 = pk;
		frame1 = new JFrame("Update Profile");
		frame1.setLayout(null);
		
		try 
		{
			content = new String(Files.readString(Paths.get(path)));
			line = content.split(",");  
			int n = line.length;
		
			for(int i = 0; i < n; i++)
			{	
				temp = line[i].split("  "); 
				int t = temp.length;
				
				for(int j = 0; j < t; j++)
				{
					data[i][j] = temp[j];
					if (data[i][0].equals(pk3))
					{
						a = i;
					}
				}	
			}	
        } 
		catch (Exception ex) 
		{
            ex.printStackTrace();
        }
		/*********** setting labels ***********/
			JLabel label = new JLabel("Name :");
				label.setBounds(200,100,59,40);
				label.setFont(new Font("Viking Squad", Font.PLAIN, 25));
			
			JLabel label1 = new JLabel("Phone :");
				label1.setBounds(191,150,68,40);
				label1.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label2 = new JLabel("Email :");
				label2.setBounds(199,200,60,40);
				label2.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label3 = new JLabel("Address :");
				label3.setBounds(168,250,91,40);
				label3.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label4 = new JLabel("Date of Birth :");
				label4.setBounds(117,300,142,40);
				label4.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label5 = new JLabel("Gender :");
				label5.setBounds(180,350,79,40);
				label5.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label6 = new JLabel("Blood Group :");
				label6.setBounds(125,400,134,40);
				label6.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label7 = new JLabel("Religion :");
				label7.setBounds(173,450,86,40);
				label7.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label8 = new JLabel("Nationality :");
				label8.setBounds(140,500,119,40);
				label8.setFont(new Font("Viking Squad", Font.PLAIN, 25));
				
			JLabel label9 = new JLabel("Upload Photo :");
				label9.setBounds(113,550,146,40);
				label9.setFont(new Font("Viking Squad", Font.PLAIN, 25));
		/***********************************/
		
			/*********** setting Textfield *************/
				text = new JTextField (data[a][3]);
					text.setBounds(269,105,200,30);
					
				text1 = new JTextField (data[a][4]);
					text1.setBounds(269,155,200,30);
					
				text2 = new JTextField (data[a][5]);
					text2.setBounds(269,205,200,30);
					
				text3 = new JTextField (data[a][6]);
					text3.setBounds(269,255,200,30);
					
				text4 = new JTextField (data[a][7]);
					text4.setBounds(269,305,200,30);
					
				text5 = new JTextField (data[a][10]);
					text5.setBounds(269,455,200,30);
					
				text6 = new JTextField (data[a][11]);
					text6.setBounds(269,505,200,30);
					
				//text7 = new JTextField ();
					//text6.setBounds(269,505,200,30);
			/******************************************/
			
					ComboBox1();
					
					//dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
					//dateFormat1.format(text6.getDate());
			
				/*********** setting buttons *************/
					button2 = new JRadioButton("Male");
						button2.setBounds(269,355,80,30);
						button2.setFont(new Font("Viking Squad", Font.PLAIN, 25));
						button2.setForeground(new Color(132, 210, 252));
						button2.setBackground(Color.WHITE);
							this.button2.addActionListener(this);
							
					button3 = new JRadioButton("Female");
						button3.setBounds(350,355,100,30);
						button3.setFont(new Font("Viking Squad", Font.PLAIN, 25));
						button3.setForeground(new Color(132, 210, 252));
						button3.setBackground(Color.WHITE);
							this.button3.addActionListener(this);
							
					button4 = new JButton();
							button4.setText("Upload Photo");
							button4.setBounds(269,555,200,30);
							button4.setFont(new Font("Viking Squad", Font.PLAIN, 25));
							button4.setForeground(new Color(132, 210, 252));
							button4.setBackground(Color.WHITE);
							button4.setFocusable(false);
								this.button4.addActionListener(this);
					
					button5 = new JButton();
						button5.setText("Back");
						button5.setBounds(20,711,80,30);
						button5.setFont(new Font("Viking Squad", Font.PLAIN, 25));
						button5.setForeground(new Color(132, 210, 252));
						button5.setBackground(Color.WHITE);
							this.button5.addActionListener(this);
					
					button6 = new JButton();
						button6.setText("LogOut");
						button6.setBounds(664,20,100,30);
						button6.setFont(new Font("Viking Squad", Font.PLAIN, 20));
						button6.setForeground(new Color(132, 210, 252));
						button6.setBackground(Color.WHITE);
							this.button6.addActionListener(this);
							
					button9 = new JButton("Update");
						button9.setBounds(300,605,100,30);
						button9.setFont(new Font("Viking Squad", Font.PLAIN, 20));
						button9.setForeground(new Color(132, 210, 252));
						button9.setBackground(Color.WHITE);
							this.button9.addActionListener(this);
							
								if(data[a][8].equals("Male"))
								{
									button2.setSelected(true);
								}
								else if(data[a][8].equals("Female"))
								{
									button3.setSelected(true);
								}
				/*************************************/
				
					/****************** setting icon *****************/
						ImageIcon icon = new ImageIcon("C:/Users/mmras/Desktop/JavaProject/Image/icon.png");
						frame1.setIconImage(icon.getImage());
					/******************************************/
						
		
		/********* adding to frame1 ********/
		frame1.add(label);
		frame1.add(label1);
		frame1.add(label2);
		frame1.add(label3);
		frame1.add(label4);
		frame1.add(label5);
		frame1.add(label6);
		frame1.add(label7);
		frame1.add(label8);
		frame1.add(label9);
		
		frame1.add(button2);
		frame1.add(button3);
		frame1.add(button4);
		frame1.add(button5);
		frame1.add(button6);
		frame1.add(button8);
		frame1.add(button9);
		
		frame1.add(text);
		frame1.add(text1);
		frame1.add(text2);
		frame1.add(text3);
		frame1.add(text4);
		frame1.add(text5);
		frame1.add(text6);
		//frame1.add(text7);
		

		//frame1.add(dc);
		/*********************************/
		
		frame1.setSize(800, 800);
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setBackground(Color.WHITE);
		frame1.setVisible(true);
	}
	
	public  void write()
	{
		try 
		{
			File file = new File("C:/Users/mmras/Desktop/JavaProject/files/user.txt");
			if (!file.exists()) 
			{
				file.createNewFile();
			}
			FileWriter writer = new FileWriter(file);
			PrintWriter pw = new PrintWriter(writer);
			for (int i = 0; i < 100; i++) 
			{
				if(nLine [i] == null)
				{
					break;
				}
				else
				{
					pw.print(nLine [i] + ",");
				}
			}
			pw.close();
			writer.close();
		}  
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button9)
		{
			if (text.getText().equals("")||text1.getText().equals("")||text2.getText().equals("")||text3.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Please Fill Complete Information");
			}
			else
			{
				data[a][0] = data[a][0];
				data[a][1] = data[a][1];
				data[a][2] = data[a][2];
		    	data[a][3] = text.getText();
				data[a][4] = text1.getText();
				data[a][5] = text2.getText();
				data[a][6] = text3.getText();
				data[a][7] = text4.getText();
				data[a][8] = MF;
				data[a][9] = combo;
				data[a][10] = text5.getText();
				data[a][11] = text6.getText(); 
				data[a][12] = icon_path;
				data[a][13] = data[a][13];
				data[a][14] = data[a][14];
				
				
				for(int i = 0; i < 100; i++)
				{
					for(int j = 0; j < 100; j++)
					{
						if(data[i][j] == null)
						{
							break;
						}
						else if(j == 0)
						{
							nLine [i] = data[i][j];
						}
						else if(0<j)
						{
							nLine [i] = nLine [i] + "  " + data[i][j];
						}
					}
				}
				this.write();
				JOptionPane.showMessageDialog(null,"Saved Successfully");
		    }
		}
		
		else if (e.getSource() == button4)
		{
			JFileChooser f_upload = new JFileChooser();
			int i = f_upload.showOpenDialog(null);
			
			if (i == JFileChooser.APPROVE_OPTION)
			{
				f_path = new File(f_upload.getSelectedFile().getAbsolutePath());
				icon_path = f_path.toString();
			}	
		}
		
		else if (e.getSource()== button5)
		{
			frame1.setVisible(false);
			new ViewProfile(pk3);
		}
		
		else if (e.getSource()== button6)
		{
			ImageIcon a = new ImageIcon("C:/Users/mmras/Desktop/JavaProject/Image/Untitled-1.png");
			int x = JOptionPane.showOptionDialog(null,"Are you sure you want to Logout?","Confirm Logout",JOptionPane.YES_NO_OPTION,
																			JOptionPane.QUESTION_MESSAGE, a, null,0);
			if (x == 0)
			{
				frame1.setVisible(false);
				new LogIn();
			}
		}
		
		else if (e.getSource()== button2)
		{
			button3.setSelected(false);
			MF = "Male";
			
		}
		
		else if (e.getSource()== button3)
		{
			button2.setSelected(false);
			MF = "Female";
		}
		
		combo = button8.getSelectedItem().toString();
		
	}
}