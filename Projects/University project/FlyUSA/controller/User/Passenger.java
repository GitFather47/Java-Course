package FlyUSA.controller.User;

import FlyUSA.controller.IFeature;
import FlyUSA.function.reservation.Reservation;
import FlyUSA.controller.Admin.Flight;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Passenger implements ActionListener {
    private Flight flight;
    private String passengerName;
    private String ticketNumber;
    private Reservation reservation;
    private int[] baggages;
    private int p;
    private JFrame framePassenger;
    private JPanel panelPassenger;
    private JTextField ticketNumberTextField, passengerNameTextField;
    private JLabel ticketNumberLabel, passengerNameLabel;
    private JRadioButton maleButton, femaleButton;
    private ButtonGroup genderGroup;
    private String gender;

    public void install() {
    }

    public void setP(int p) {
        this.p = p;
    }

    public void avail() {
        System.out.println("Ticket number : " + ticketNumber);
    }

    public void passengerInfo() {
        Scanner input = new Scanner(System.in);
        framePassenger = new JFrame();
        framePassenger.setTitle("Reserve deez nuts");
        framePassenger.setSize(350, 200);
        framePassenger.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePassenger.setLocationRelativeTo(null);
        panelPassenger = new JPanel();
        panelPassenger.setLayout(null);

        passengerNameLabel = new JLabel("Passenger name:");
        passengerNameLabel.setBounds(10, 20, 80, 25);
        panelPassenger.add(passengerNameLabel);

        passengerNameTextField = new JTextField(20);
        passengerNameTextField.setBounds(100, 20, 165, 25);
        panelPassenger.add(passengerNameTextField);

        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        ticketNumberLabel = new JLabel("Your ticket Number (13 digits):");
        ticketNumberLabel.setBounds(10, 50, 80, 25);
        panelPassenger.add(ticketNumberLabel);

        ticketNumberTextField = new JTextField(13);
        ticketNumberTextField.setBounds(100, 50, 165, 25);
        panelPassenger.add(ticketNumberTextField);

        if ((ticketNumberTextField.getText()).length() == 13) {
            JOptionPane.showMessageDialog(null, "INVALID TICKET NUMBER");
        }

        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gender = "Unknown";

                if (maleButton.isSelected()) {
                    gender = "Male";
                } else if (femaleButton.isSelected()) {
                    gender = "Female";
                }
                savePassengerInfoToFile();
                framePassenger.dispose();
            }
        });

        panelPassenger.add(maleButton);
        panelPassenger.add(femaleButton);
        panelPassenger.add(submitButton);

        framePassenger.add(panelPassenger);
        framePassenger.setVisible(true);
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void show() {
        System.out.println("Passenger name: " + passengerName);
        System.out.println("Ticket number: " + ticketNumber);
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public void savePassengerInfoToFile() {
        FileWriter writer;
        try {
            writer = new FileWriter("passengers.txt", true); // Append mode
            writer.write("Passenger Name: " + passengerNameTextField.getText() + "\n");
            writer.write("Gender: " + gender + "\n");
            writer.write("Ticket Number: " + ticketNumberTextField.getText() + "\n");
            /*writer.write("Baggages: ");
            for (int i = 0; i < baggages.length; i++) {
                writer.write(baggages[i] + " ");
            }*/
            writer.write("\n-----------------------------\n");
            writer.close();
            JOptionPane.showMessageDialog(null, "Passenger information saved to file successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "An error occurred while saving passenger information to file.");
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        // Implementation of the actionPerformed method
        // This method will be called when an action event occurs
        // For example, when a button is clicked

        // You can add your logic here to handle the action event
    }
}
