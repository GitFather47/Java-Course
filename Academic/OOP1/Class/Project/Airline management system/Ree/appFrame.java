import javax.swing.JFrame;
class appFrame extends JFrame{
	appFrame(){
		this.add(new appPanel());
		this.setTitle("SAY MY NAME");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLocationRelativeTo(null);

	}
	



}