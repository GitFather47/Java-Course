import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

class Passenger implements IFeature{
    private Flight flight;
    private String passengerName;
    private String ticketNumber;
    private Reservation reservation;
    private int[] baggages;

    public void install(){}
    public boolean checkUser(){
        return false;
    }
    public boolean checkAdmin(){
        return false;
    }

    public void avail() {
        System.out.println("Ticket number : "+ticketNumber);
    }

    public void passengerInfo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter passenger name:");
        passengerName = input.nextLine();

        System.out.println("Enter your ticket Number (13 digits): ");
        ticketNumber = input.nextLine();
        if (ticketNumber.length() != 13) {
            System.out.println("INVALID TICKET NUMBER");
            
        }

        System.out.println("How many baggages do you have?");
        baggages = new int[input.nextInt()];
        System.out.println("Class type:");
        // setClass() // You may want to implement this method or remove the reference.

        System.out.println("Enter Weight");
        for (int i = 0; i < baggages.length; i++) {
            // getClass() // You may want to implement this method or remove the reference.
            System.out.println("Bag no " + (i + 1));
            baggages[i] = input.nextInt();
        }
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
            writer.write("Passenger Name: " + passengerName + "\n");
            writer.write("Ticket Number: " + ticketNumber + "\n");
            writer.write("Baggages: ");
            for (int i = 0; i < baggages.length; i++) {
                writer.write(baggages[i] + " ");
            }
            writer.write("\n-----------------------------\n");
            writer.close();
            System.out.println("Passenger information saved to file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while saving passenger information to file.");
            e.printStackTrace();
        }
    }
}
