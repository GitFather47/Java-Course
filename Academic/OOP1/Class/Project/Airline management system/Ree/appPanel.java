import java.awt.*;
class appPanel extends JPanel implements ActionListener {
	JButton buttons[] = new JButton[5];
	JButton register;
	JPanel buttonField = new JPanel();
	JLabel userLabel,flightLabel,pilotLabel,departureLabel,fromLabel,toLabel;//Syste.out.println
	JTextField userTextField,flightField,pilotField,departureField,fromField,toField;//Input
	JLabel welcome= new JLabel("Welcome to Walter H. White International Airport");
	for(int i = 0; i<buttons.length; i++){
		buttons[i] = new JButton();
		buttonField.add(buttons[i]);

		button[i].addActionListener(this);

	}
	public void actionPerformed(actionEvent e){


	}


}