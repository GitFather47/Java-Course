import java.util.Scanner;

public class BusReservationSystem {
    private static int p = 0;

    static class Bus {
        private String busn;
        private String driver;
        private String arrival;
        private String depart;
        private String from;
        private String to;
        private String[][] seat;

        public Bus() {
            seat = new String[8][4];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 4; j++) {
                    seat[i][j][0] = "Empty";
                }
            }
        }

        public void install() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter bus no: ");
            busn = scanner.next();

            System.out.print("\nEnter Driver's name: ");
            driver = scanner.next();

            System.out.print("\nArrival time: ");
            arrival = scanner.next();
            System.out.print("\nDeparture: ");
            depart = scanner.next();

            System.out.print("\nFrom: \t\t\t");
            from = scanner.next();

            System.out.print("\nTo: \t\t\t");
            to = scanner.next();
        }

        public void allotment() {
            Scanner scanner = new Scanner(System.in);
            String number;
            int seat;

            while (true) {
                System.out.print("Bus no: ");
                number = scanner.next();

                int n;
                for (n = 0; n <= p; n++) {
                    if (bus[n].busn.equals(number)) {
                        break;
                    }
                }

                if (n > p) {
                    System.out.println("Enter correct bus no.");
                    continue;
                }

                System.out.print("\nSeat Number: ");
                seat = scanner.nextInt();

                if (seat > 32) {
                    System.out.println("\nThere are only 32 seats available in this bus.");
                } else {
                    if (bus[n].seat[seat / 4][(seat % 4) - 1][0].equals("Empty")) {
                        System.out.print("Enter passenger's name: ");
                        bus[n].seat[seat / 4][(seat % 4) - 1][0] = scanner.next();
                        break;
                    } else {
                        System.out.println("The seat no. is already reserved.");
                    }
                }
            }
        }

        public void show() {
            Scanner scanner = new Scanner(System.in);
            String number;

            System.out.print("Enter bus no: ");
            number = scanner.next();

            int n;
            for (n = 0; n <= p; n++) {
                if (bus[n].busn.equals(number)) {
                    break;
                }
            }

            if (n > p) {
                System.out.println("Enter correct bus no.");
                return;
            }

            vline('*');
            System.out.println("Bus no: \t" + bus[n].busn + "\nDriver: \t" + bus[n].driver + "\t\tArrival time: \t"
                    + bus[n].arrival + "\tDeparture time:" + bus[n].depart + "\nFrom: \t\t" + bus[n].from
                    + "\t\tTo: \t\t" + bus[n].to + "\n");
            vline('*');

            position(n);
            int a = 1;

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 4; j++) {
                    a++;
                    if (!bus[n].seat[i][j][0].equals("Empty")) {
                        System.out.println("The seat no " + (a - 1) + " is reserved for " + bus[n].seat[i][j][0] + ".");
                    }
                }
            }
        }

        public void avail() {
            for (int n = 0; n < p; n++) {
                vline('*');
                System.out.println("Bus no: \t" + bus[n].busn + "\nDriver: \t" + bus[n].driver + "\t\tArrival time: \t"
                        + bus[n].arrival + "\tDeparture Time: " + bus[n].depart + "\nFrom: \t\t" + bus[n].from
                        + "\t\tTo: \t\t\t" + bus[n].to + "\n");
                vline('*');
                vline('-');
            }
        }

        private void vline(char ch) {
            for (int i = 0; i < 80; i++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        private void position(int l) {
            int p = 0, s = 0;

            for (int i = 0; i < 8; i++) {
                System.out.println();
                for (int j = 0; j < 4; j++) {
                    s++;
                    if (bus[l].seat[i][j][0].equals("Empty")) {
                        System.out.printf("%5s", s + ".");
                        System.out.printf("%10s", "Empty");
                    } else {
                        System.out.printf("%5s", s + ".");
                        System.out.printf("%10s", bus[l].seat[i][j][0]);
                    }
                }
            }

            System.out.println("\n\nThere are " + p + " seats empty in Bus No: " + bus[l].busn);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bus[] bus = new Bus[100];

        while (true) {
            System.out.println("\n\n\n\n\n");
            System.out.println("\t\t\t1. Install\n\t\t\t" + "2. Reservation\n\t\t\t" + "3. Show\n\t\t\t"
                    + "4. Buses Available\n\t\t\t" + "5. Exit");
            System.out.print("\t\t\tEnter your choice:->");

            int w = scanner.nextInt();

            switch (w) {
                case 1:
                    bus[p] = new Bus();
                    bus[p].install();
                    p++;
                    break;
                case 2:
                    bus[p].allotment();
                    break;
                case 3:
                    bus[0].show();
                    break;
                case 4:
                    bus[0].avail();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
