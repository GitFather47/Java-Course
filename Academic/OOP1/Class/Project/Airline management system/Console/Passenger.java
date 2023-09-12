import java.util.Scanner;

class Passenger implements IFeature{
    private Flight flight;
    private String passengerName;
    private String ticketNumber;
    private Reservation reservation;
    private int[] bagages;

    public void passengerInfo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter passenger name:");
        passengerName = input.nextLine();

        System.out.println("Enter your ticket Number (13 digits): ");
        ticketNumber = input.nextLine();
        if (ticketNumber.length() != 13) {
            System.out.println("INVALID TICKET NUMBER");
            break; 

        System.out.println("How many bagages do you have?");
        bagages = new int[input.nextInt()];
        System.out.println("Class type:");
        // setClass() // You may want to implement this method or remove the reference.

        System.out.println("Enter Weight");
        for (int i = 0; i < bagages.length; i++) {
            // getClass() // You may want to implement this method or remove the reference.
            System.out.println("Bag no " + (i + 1));
            bagages[i] = input.nextInt();
        }
    }

    public void show() {
        System.out.println("Passenger name: " + passengerName);
        System.out.println("Ticket number: " + ticketNumber);
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
