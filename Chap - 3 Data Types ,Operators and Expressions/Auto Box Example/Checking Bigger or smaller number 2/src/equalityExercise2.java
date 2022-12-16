import java.util.Scanner;

public class equalityExercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = input.nextInt();
		System.out.println("Enter another number:");
		int b = input.nextInt();
		boolean isAGreaterThanB=a>b;
		System.out.println("isAGreaterThanB = " + isAGreaterThanB);
		boolean isALesserThanB=a<b;
		System.out.println("isALesserThanB = " + isALesserThanB);
		boolean isAEqualToB=a==b;
		System.out.println("isAEqualToB = " + isAEqualToB);
		boolean isANotEqualToB=a!=b;
		System.out.println("isANotEqualToB = " + isANotEqualToB);
		// TODO Auto-generated method stub

	}

}
