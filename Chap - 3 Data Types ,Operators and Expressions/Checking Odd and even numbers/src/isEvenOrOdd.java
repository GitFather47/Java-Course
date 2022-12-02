import java.util.Scanner;
public class isEvenOrOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		boolean isEven= n % 2 == 0;
		System.out.println("IsEven: " + isEven);
		boolean isOdd= !isEven;
		System.out.println("IsOdd: " + isOdd);
		
		// TODO Auto-generated method stub

	}

}
