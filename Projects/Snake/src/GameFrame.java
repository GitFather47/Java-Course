import javax.swing.JFrame;

public class GameFrame extends JFrame {
GameFrame(){
	this.add(new GamePanel());
	this.setTitle("SNAKE 2D");
	this.setResizable(false);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.pack();
	
	
	this.setVisible(true);
	this.setLocationRelativeTo(null);
}

}
