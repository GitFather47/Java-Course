//9
import java.util.Scanner;
public class MoneyConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount in BDT: ");
		int BDT = input.nextInt();
		System.out.println("Enter exchange rate(USD): ");//0.0097 or 0.00967586
		double ExUSD= input.nextDouble();
		System.out.println("Enter exchange rate(YEN): ");//1.32 or 1.32177
		double ExYEN= input.nextDouble();
		double USD = BDT * ExUSD;
		double YEN = BDT * ExYEN;
		System.out.println("USD: "+USD);
		System.out.println("YEN: "+YEN);
		// TODO Auto-generated method stub

	}

}
