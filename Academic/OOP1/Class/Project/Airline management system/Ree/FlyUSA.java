class FlyUSA extends appPanel implements actionListener{
	String name, flightNo,pilotName,departureTime, boardingPointFrom,boardingPointTo;
	int seat[8][4];
	FlyUSA(){
		
	}
	FlyUSA(){//Parameters will be placed

	}
	//buttons and methods
	public void passengerInstall(){//Passenger info will be taken
		userLabel= new JLabel("Passenger name:");//This acts like print method
		userField = new JTextField();//This will take input
		flightLabel= new JLabel("Flight no:");
		flightField = new JTextField();
		pilotLabel= new JLabel("Pilot name:");
		pilotField = new JTextField();
		departureLabel = new JLabel("Departure time:");
		departureField= new JTextField();
		fromLabel = new JLabel("From:");
		fromField = new JTextField();
		toLabel = new JLabel("To:");
		toField = new JTextField();



	}
	public void allotment(){//Allot the seats

	}
	public void empty(){//This will remove any seats if needed

	}
	public void show(){//This will show info


	}
	public void avail(){//This will check available seats

	}
	public void position(int p){//This will help to locate the postion of any seat.

	}

	public void actionPerformed(actionEvent e){
			name= userTextField.getText();
			flightNo =flightField.getText();
			departureTime=departureField.getText();
			pilotName=pilotField.getText(); 
			departTureTime=departureField.getText();
			boardingPointFrom=fromField.getText();
			boardingPointTo=toField.getText();

		}


}