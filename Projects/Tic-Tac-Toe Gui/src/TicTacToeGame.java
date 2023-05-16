import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class TicTacToeGame implements ActionListener{

JFrame frame = new JFrame();
JPanel title_box= new JPanel();
JPanel button_box = new JPanel();
JButton[] button = new JButton[9];
JLabel textField= new JLabel();
Random random = new Random();
boolean player_turn;
	TicTacToeGame(){
		frame.setSize(1024,768);
		frame.getContentPane().setBackground(new Color(176,196,222));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		frame.setTitle("Arnob's Tic-Tac-Toe");
	
		
		textField.setBackground(new Color(112,128,144));
		textField.setForeground(new Color(192,192,192));
		textField.setFont(new Font("Roboto",Font.BOLD,75));
		textField.setText("Tic-Tac-Deez-Nuts");
		textField.setHorizontalAlignment(JLabel.CENTER);
		textField.setOpaque(true);
		
		title_box.setLayout (new BorderLayout());
		title_box.setBounds(0,0,800,100);
		title_box.add(textField);
		
		button_box.setLayout (new GridLayout(3,3));
		button_box.setBackground(new Color(25,25,25));
		frame.add(title_box,BorderLayout.NORTH);
		frame.add(button_box);
		for (int i=0;i<9;i++) {
			button[i]=new JButton();
			button_box.add(button[i]);
			 
			button[i].setFont(new Font("Segoe UI",Font.BOLD,120));
			button[i].addActionListener(this);
			button[i].setFocusable(false);//CHECK
			button[i].setBackground(new Color(176,196,222));
			 button[i].setForeground(Color.BLACK);
			 Turn();
		}
}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<9;i++) {
			if(e.getSource()==button[i]) {
				if(player_turn) {
					if(button[i].getText()=="") {
						button[i].setForeground(Color.black);
						button[i].setText("X");
						player_turn=false;
						textField.setText("O move");
						check();
					}
				}
				else {
					if(button[i].getText()=="") {
						button[i].setForeground(Color.white);
						button[i].setText("O");
						player_turn=true;
						textField.setText("X move");
						check();
					}
				}
			}			
		}
	}
public void Turn() {
	try {
		textField.setText("...Being Ready...");
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if (random.nextInt(2)==0) {
		player_turn=true;
		textField.setText("Player X Turn");
	}
	else {
		player_turn=false;
		textField.setText("Player O Turn");
	}
}
public void check() {
	//x win conditions
	if(
			(button[0].getText()=="X") &&
			(button[1].getText()=="X") &&
			(button[2].getText()=="X")
			) {
		xWins(0,1,2);
	}
	if(
			(button[3].getText()=="X") &&
			(button[4].getText()=="X") &&
			(button[5].getText()=="X")
			) {
		xWins(3,4,5);
	}
	if(
			(button[6].getText()=="X") &&
			(button[7].getText()=="X") &&
			(button[8].getText()=="X")
			) {
		xWins(6,7,8);
	}
	if(
			(button[0].getText()=="X") &&
			(button[3].getText()=="X") &&
			(button[6].getText()=="X")
			) {
		xWins(0,3,6);
	}
	if(
			(button[1].getText()=="X") &&
			(button[4].getText()=="X") &&
			(button[7].getText()=="X")
			) {
		xWins(1,4,7);
	}
	if(
			(button[2].getText()=="X") &&
			(button[5].getText()=="X") &&
			(button[8].getText()=="X")
			) {
		xWins(2,5,8);
	}
	if(
			(button[0].getText()=="X") &&
			(button[4].getText()=="X") &&
			(button[8].getText()=="X")
			) {
		xWins(0,4,8);
	}
	if(
			(button[2].getText()=="X") &&
			(button[4].getText()=="X") &&
			(button[6].getText()=="X")
			) {
		xWins(2,4,6);
	}
	
	//O win conditions
	if(
			(button[0].getText()=="O") &&
			(button[1].getText()=="O") &&
			(button[2].getText()=="O")
			) {
		oWins(0,1,2);
	}
	if(
			(button[3].getText()=="O") &&
			(button[4].getText()=="O") &&
			(button[5].getText()=="O")
			) {
		oWins(3,4,5);
	}
	if(
			(button[6].getText()=="O") &&
			(button[7].getText()=="O") &&
			(button[8].getText()=="O")
			) {
		oWins(6,7,8);
	}
	if(
			(button[0].getText()=="O") &&
			(button[3].getText()=="O") &&
			(button[6].getText()=="O")
			) {
		oWins(0,3,6);
	}
	if(
			(button[1].getText()=="O") &&
			(button[4].getText()=="O") &&
			(button[7].getText()=="O")
			) {
		oWins(1,4,7);
	}
	if(
			(button[2].getText()=="O") &&
			(button[5].getText()=="O") &&
			(button[8].getText()=="O")
			) {
		oWins(2,5,8);
	}
	if(
			(button[0].getText()=="O") &&
			(button[4].getText()=="O") &&
			(button[8].getText()=="O")
			) {
		oWins(0,4,8);
	}
	if(
			(button[2].getText()=="O") &&
			(button[4].getText()=="O") &&
			(button[6].getText()=="O")
			) {
		oWins(2,4,6);
	}
}
public void xWins(int a,int b, int c) {
	button[a].setBackground(new Color(255,153,255));
	button[b].setBackground(new Color(255,153,255));
	button[c].setBackground(new Color(255,153,255));
	for(int i=0;i<9;i++) {
		button[i].setEnabled(false);
	}
	textField.setText("X Wins");
}
public void oWins(int e, int f, int g) {
	button[e].setBackground(new Color(255,153,255));
	button[f].setBackground(new Color(255,153,255));
	button[g].setBackground(new Color(255,153,255));
	for(int i=0;i<9;i++) {
		button[i].setEnabled(false);
	}
	textField.setText("O Wins");
}


		// TODO Auto-generated method stub
		
	

}

