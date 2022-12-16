import java.util.Scanner;
//Only checks one character
public class InputCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c = input.next().charAt(0);
		if (Character.isDigit(c)) {
			System.out.println(c + " is a digit");
		}
		else if (Character.isLetter(c)){
			System.out.println(c + " is a letter");
		}
		else {
			System.out.println(c + " is a special character");
		}
		// TODO Auto-generated method stub

	}

}
