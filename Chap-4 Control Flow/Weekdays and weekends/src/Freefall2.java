import java.util.Scanner;
public class Freefall2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a day between 1 to 7 : ");
		int day = input.nextInt();
		switch (day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekdays");
			break;
		case 6:
		case 7:
			System.out.println("Weekends");
		}
		// TODO Auto-generated method stub

	}

}
