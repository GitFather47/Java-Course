import java.util.Scanner;
public class GottaGoFast {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type something Dumbass: ");
		String itype = input.nextLine();
		long startTime = System.currentTimeMillis();
		System.out.println("Type Again: ");
		String type = input.nextLine();
		long endTime= System.currentTimeMillis();
		if (itype.equals(type)) {
			long elapsedTime= endTime -startTime;
			double typingSpeed = (double) itype.length()/(elapsedTime/1000);
			System.out.println("Your typing speed is: "+ typingSpeed+ " "
					+ " characters per second.");
		} else {
			System.out.println("The text you typed does not match the original text.");
		}
		// TODO Auto-generated method stub

	}

}
