import java.util.Scanner;

class Reservation {
    private Flight[] flight;
    private String[][] seat;
    public int p;
    public Reservation(Flight[] flight) {
        this.flight = flight;
        seat = new String[8][4];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                seat[i][j] = "Empty";
            }
        }
    }
   public void setP(int p){
    this.p=p;
   }
    public void allotment() {
        Scanner input = new Scanner(System.in);

        System.out.println("Seat Number:");
        int seatNum = input.nextInt();
        if (seatNum > p) {
            System.out.println("Enter appropriate seat number:");
            return;
        }
        if (flight[p].seat[(seatNum - 1) / 4][(seatNum - 1) % 4].equals("Empty")) {
            flight[p].passengerInfo();
            flight[p].seat[(seatNum - 1) / 4][(seatNum - 1) % 4] = "John wick"; //flight[p].getPassengerName() implement this method;
        } else {
            System.out.println("The seat is already reserved.");
            flight[p].passengerInfo();
        }
    }
}
