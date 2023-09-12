import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Toolkit; 
import java.awt.event.*;  
//import java.awt.Toolkit; 
import java.awt.event.ItemEvent;  
import java.awt.event.ItemListener;  
import javax.swing.*;
import java.awt.Color;  
import java.awt.Graphics;  
import java.text.*;  
import java.util.*; 
public class ViewProfile extends JFrame implements ItemListener
{
	ImageIcon img;
	JLabel iLabel, nLabel, cLabel, eLabel,aLabel,dLabel,gLabel,bLabel,rLabel,n2Label,pLabel;
	JTextField iTF,nTF,cTF,eTF,aTF,dTF,gTF,bTF,rTF,n2TF;
	JPanel panel;
	JButton bBtn,lBtn;
	Font myFont;
	private JToggleButton button; 
	public ViewProfile()
	{
		super("View Profile");
		this.setSize(800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		JLabel background;
		//setJToggleButton();  
        //setAction();
		setJToggleButton();  
        setAction();
		
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);

		img = new ImageIcon("MAA1.png");
		this.setIconImage(img.getImage());
		
		iLabel = new JLabel("Student Id: ");
		iLabel.setBounds(270, 80, 160, 80);
		iLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		iLabel.setFont(myFont);
		panel.add(iLabel);
		
		nLabel = new JLabel("Student Name : ");
		nLabel.setBounds(270, 130, 160, 80);
		nLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		nLabel.setFont(myFont);
		panel.add(nLabel);
		
		cLabel = new JLabel("Phone No : ");
		cLabel.setBounds(270, 180, 160, 80);
		cLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		cLabel.setFont(myFont);
		panel.add(cLabel);
		
		eLabel = new JLabel("Email : ");
		eLabel.setBounds(270, 230, 160, 80);
		eLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		eLabel.setFont(myFont);
		panel.add(eLabel);
		
		
		aLabel = new JLabel("Address : ");
		aLabel.setBounds(270, 280, 160, 80);
		aLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		aLabel.setFont(myFont);
		panel.add(aLabel);
		
		
		dLabel = new JLabel("Date of Birth :");
		dLabel.setBounds(60, 450, 160, 80);
		dLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		dLabel.setFont(myFont);
		panel.add(dLabel);
		
		gLabel = new JLabel("Gender : ");
		gLabel.setBounds(60, 500, 160, 80);
		gLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		gLabel.setFont(myFont);
		panel.add(gLabel);
		
		bLabel = new JLabel("Blood Group : ");
		bLabel.setBounds(60, 550, 160, 80);
		bLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		bLabel.setFont(myFont);
		panel.add(bLabel);
		
		rLabel = new JLabel("Religion : ");
		rLabel.setBounds(430, 450, 160, 80);
		rLabel.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		rLabel.setFont(myFont);
		panel.add(rLabel);
		
		n2Label = new JLabel("Nationality : ");
		n2Label.setBounds(430, 500, 160, 80);
		n2Label.setOpaque(true);
		myFont = new Font("Arial",Font.BOLD,16);
		n2Label.setFont(myFont);
		panel.add(n2Label);
		
		
		
		
		
		iTF = new JTextField();
		iTF.setBounds(450, 105, 180, 30);
	
		panel.add(iTF);
		
		nTF = new JTextField();
		nTF.setBounds(450, 155, 180, 30);
        panel.add(nTF);
		
		cTF = new JTextField();
		cTF.setBounds(450, 205, 180, 30);
		panel.add(cTF);
		
		eTF = new JTextField();
		eTF.setBounds(450, 255, 180, 30);
		panel.add(eTF);
		
		aTF = new JTextField();
		aTF.setBounds(450, 305, 180, 30);
		panel.add(aTF);
		
		dTF = new JTextField();
		dTF.setBounds(220, 480, 180, 30);
		panel.add(dTF);
		
		gTF = new JTextField();
		gTF.setBounds(220, 530, 180, 30);
		panel.add(gTF);
		
		bTF = new JTextField();
		bTF.setBounds(220, 580, 180, 30);
		panel.add(bTF);
		
		rTF = new JTextField();
		rTF.setBounds(600, 480, 120, 30);
		panel.add(rTF);
		
		n2TF = new JTextField();
		n2TF.setBounds(600, 530, 120, 30);
		panel.add(n2TF);
		
		//c4TF = new JTextField();
		//c4TF.setBounds(600, 580, 120, 30);
		//panel.add(c4TF);
		
		
		bBtn = new JButton("Back");
		bBtn.setBounds(30, 700, 80, 30);
		bBtn.setForeground(Color.BLUE);
		bBtn.setFont(new Font("Viking Squad", Font.PLAIN, 15));
		
		panel.add(bBtn);
		
		bBtn.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e)
			{
				
				Student s=new Student();
				s.setVisible(true);
				}
		});
		
		lBtn = new JButton("Logout");
		lBtn.setBounds(550, 30, 80, 30);
		lBtn.setFont(new Font("Viking Squad", Font.PLAIN, 15));
		lBtn.setForeground(Color.BLUE);
		panel.add(lBtn);
		
		
		
		JLabel pLabel=new JLabel(new ImageIcon("p.PNG"));    
		pLabel.setBounds(30,115,170, 230); 
		panel.add(pLabel);
		
		
		
		this.add(panel);
	}
	
	
private void setJToggleButton() 
{  
        button = new JToggleButton("evsjv"); 
		button.setBounds(680,20,100,40);
		button.setFont(new Font("SutonnyMJ", Font.PLAIN, 20));
        add(button);  
    }  
    private void setAction() 
	{  
        button.addItemListener(this);  
    }  
    public void itemStateChanged(ItemEvent eve)
	{  
        if (button.isSelected())
		{  
            button.setText("English");  
		button.setFont(new Font("Arial", Font.PLAIN, 14));
		}
        else 
			{
            button.setText("evsjv"); 
		button.setFont(new Font("SutonnyMJ", Font.PLAIN, 20));}			
    }  		
	
  	  
}	