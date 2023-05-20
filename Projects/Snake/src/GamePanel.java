import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

import javax.swing.JPanel;

public class GamePanel extends JPanel  implements ActionListener {
	final int SCREEN_HEIGHT=800;
	final int SCREEN_WIDTH=800;
	final int UNIT_SIZE=32;//Object Size
	final int COMPONENT_SIZE=(SCREEN_HEIGHT*SCREEN_WIDTH)/UNIT_SIZE;//How many objects we can fit it the screens
	final int x[] = new int[COMPONENT_SIZE];
	final int y[] = new int[COMPONENT_SIZE];
	final int DELAY= 75;
	int PeachX;
	int PeachY;
	int PeachEaten;
	char direction ='R';
	boolean inGame=false;
	int bodyParts=7;
	Timer timer;
	Random random;
	
	
GamePanel(){
	random = new Random();
	this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
	this.setBackground(new Color(64,64,64));
	this.setFocusable(true);
	this.addKeyListener(new controller());
	startSnake();
	
	
}
private void startSnake() {
	newPeach();
	inGame=true;
	timer =new Timer(DELAY,this);
	timer.start();
	// TODO Auto-generated method stub
	
}
private void drawSnake(Graphics g) {
	if(inGame) {
		/*for (int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++) {
			g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE,SCREEN_HEIGHT);
			g.drawLine(0,i*UNIT_SIZE , SCREEN_WIDTH,i*UNIT_SIZE);
		}
		*/
		g.setColor(new Color(255,102,255));
		g.fillOval(PeachX, PeachY, UNIT_SIZE,UNIT_SIZE);
		for (int i=0;i<bodyParts;i++) {
			if (i==0) {
				g.setColor(Color.green);
				g.fillRect(x[i], y[i], UNIT_SIZE,UNIT_SIZE);
			}
			else {
				g.setColor(new Color(45,180,0));
				if(PeachEaten>=15) {//Ranibow Effect
						g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
					
				}
				g.fillRect(x[i], y[i], UNIT_SIZE,UNIT_SIZE);
			}
		}
		g.setColor(Color.red);
		g.setFont(new Font("OptimusPrinceps",Font.PLAIN,55));
		FontMetrics metrics1 = getFontMetrics(g.getFont());
		g.drawString("Points:"+PeachEaten, (SCREEN_WIDTH - metrics1.stringWidth("Points:"+PeachEaten))/2, g.getFont().getSize());
	}
		else{
			snakeOver(g);
		}
	 
	// TODO Auto-generated method stub
	
}
public void newPeach() {
	PeachX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
	PeachY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	// TODO Auto-generated method stub
	
}
public void paintComponent (Graphics g) {
	super.paintComponent(g);
	drawSnake(g);
}

private void moveSnake() {
	for (int i=bodyParts;i>0;i--) {
		x[i]=x[i-1];
		y[i]=y[i-1];
	}
	//Directions in array
	switch(direction){
	case 'U':
		y[0]-=UNIT_SIZE;
		break;
	case 'D':
		y[0]+=UNIT_SIZE;
		break;
	case 'L':
		x[0]-=UNIT_SIZE;
		break;
	case 'R':
		x[0]+=UNIT_SIZE;
		break;
	}
	// TODO Auto-generated method stub
	
}
private void checkPeach() {
	if((x[0]==PeachX) && (y[0]==PeachY)) {
		bodyParts++;
		PeachEaten++;
		newPeach();
	}
	// TODO Auto-generated method stub
	
}
private void checkCollisions() {
	
	//checks if head collides with body
			for(int i = bodyParts;i>0;i--) {
				if((x[0] == x[i])&& (y[0] == y[i])) {
					inGame = false;
				}
			}
			//check if head touches left border
			if(x[0] < 0) {
				inGame= false;
			}
			//check if head touches right border
			if(x[0] > SCREEN_WIDTH) {
				inGame = false;
			}
			//check if head touches top border
			if(y[0] < 0) {
				inGame = false;
			}
			//check if head touches bottom border
			if(y[0] > SCREEN_HEIGHT) {
				inGame = false;
			}
			
			if(!inGame) {
				timer.stop();
			}
}
	private void snakeOver(Graphics g) {
		g.setColor(Color.red);
		g.setFont(new Font("OptimusPrinceps",Font.PLAIN,55));
		FontMetrics metrics1 = getFontMetrics(g.getFont());
		g.drawString("Points:"+PeachEaten, (SCREEN_WIDTH - metrics1.stringWidth("Points:"+PeachEaten))/2, g.getFont().getSize());
		g.setColor(Color.red);
		g.setFont(new Font("Exquisite Corpse",Font.PLAIN,105));
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		g.drawString("YOU DIED", (SCREEN_WIDTH - metrics2.stringWidth("YOU DIED"))/2, SCREEN_HEIGHT/2);
		g.setColor(Color.red);
		g.setFont(new Font("MV Boli",Font.PLAIN,25));
		FontMetrics metrics3 = getFontMetrics(g.getFont());
		g.drawString("Press R to Reload", (SCREEN_WIDTH - metrics3.stringWidth("YOU DIED"))/2 -50, SCREEN_HEIGHT/2 +80);//Reload text Co-ordinate
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (inGame) {
			moveSnake();
			checkPeach();
			checkCollisions();
		}
		repaint();
		// TODO Auto-generated method stub
		
	}
	public void restartGame() {
        setVisible(false);
        new GameFrame();
    }
public class controller extends KeyAdapter{
	@Override 
	public void keyPressed(KeyEvent k) {
		switch(k.getKeyCode()) {
		//cannot turn 180 degree
		case KeyEvent.VK_A:
			if(direction != 'R') {
				direction = 'L';
			}
			break;
		case KeyEvent.VK_D:
			if(direction != 'L') {
				direction = 'R';
			}
			break;
		case KeyEvent.VK_W:
			if(direction != 'D') {
				direction = 'U';
			}
			break;
		case KeyEvent.VK_S:
			if(direction != 'U') {
				direction = 'D';
			}
			break;
		case KeyEvent.VK_R:
			restartGame();
		}
		
			
	}
}
}
