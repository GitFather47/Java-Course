import java.util.Scanner;

public class EndDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		System.out.println("Last Digit: " + num % 10 );
		//MAGIC!! If you divide any number by 10 , you will always get the last digit as a remainder.
		// TODO Auto-generated method stub

	}

}
