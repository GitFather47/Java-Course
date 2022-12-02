import java.util.Scanner;

public class cToF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in celsius: ");
		double c = input.nextDouble();
		double f = (c * 9/5)+ 32;
		System.out.println(c+" celsius is " + f +" farenheit ");
		// TODO Auto-generated method stub

	}

}
