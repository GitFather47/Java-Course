package FlyUSA.function.reservation;

import FlyUSA.controller.Admin.Flight;
import FlyUSA.controller.User.Passenger;
import javax.swing.*;
import java.util.Scanner;

public class Reservation {
    private Flight[] flight = new Flight[100];
    private String[][] seat;
    private Passenger[] passenger = new Passenger[2000];
    private JFrame frame;
    private JPanel panel;
    private JLabel seatLabel;
    private JTextField seatTextField;
    public int p, seatNum;

    public Reservation(Flight f, Passenger p) {
        for (int i = 0; i < flight.length; i++) {
            if (passenger[i] != null && flight[i] != null) {
                passenger[i] = p;
                flight[i] = f;
            } else {
                break;
            }
        }

        seat = new String[8][4];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                seat[i][j] = "Empty";
            }
        }
    }

    public void setP(int p) {
        this.p = p;
    }
/*public class SeatPlanWriter {
    public static void writeSeatPlan(String fileName, String flightNo, String[][] seatPlan) {
        try {
            File inputFile = new File(fileName);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            boolean foundFlight = false;

            while ((currentLine = reader.readLine()) != null) {
                writer.write(currentLine);
                writer.newLine();

                if (currentLine.startsWith("Flight No:") && currentLine.contains(flightNo)) {
                    foundFlight = true;

                    // Read and discard the remaining lines until "Class:" is found
                    while ((currentLine = reader.readLine()) != null) {
                        if (currentLine.startsWith("Class:")) {
                            break;
                        }
                    }

                    // Write the updated seat plan
                    for (int i = 0; i < seatPlan.length; i++) {
                        for (int j = 0; j < seatPlan[i].length; j++) {
                            writer.write(seatPlan[i][j] + " ");
                        }
                        writer.newLine();
                    }
                }
            }

            writer.close();
            reader.close();

            // Rename the temporary file to replace the original file
            tempFile.renameTo(inputFile);

            if (!foundFlight) {
                System.out.println("Flight not found in the file.");
            } else {
                System.out.println("Seat plan updated successfully.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
    public void allotment() {
        frame = new JFrame();
        frame.setTitle("Reserve deez nuts");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        seatLabel = new JLabel("Seat Number:");
        seatLabel.setBounds(10, 20, 80, 25);
        panel.add(seatLabel);

        seatTextField = new JTextField(2);
        seatTextField.setBounds(100, 50, 165, 25);
        panel.add(seatTextField);
        seatNum = Integer.parseInt(seatTextField.getText());
        if (seatNum > p) {
            JOptionPane.showMessageDialog(null, "Enter appropriate seat number:");
        }
        if (flight[p].seat[(seatNum - 1) / 4][(seatNum - 1) % 4].equals("Empty")) {
            flight[p].passengerInfo();
            flight[p].seat[(seatNum - 1) / 4][(seatNum - 1) % 4] = passenger[p].getPassengerName();
        } else {
            JOptionPane.showMessageDialog(null, "The seat is already reserved.");
            flight[p].passengerInfo();
        }
    }
}
