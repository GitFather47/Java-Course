import java.util.Scanner;
public class CalcSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose an operator +,-,*,/: ");
		char op = input.next().charAt(0);
		System.out.println("1st Number: ");
		int n1 = input.nextInt();
		System.out.println("2nd number: ");
		int n2 = input.nextInt();
		int result = switch (op) {
		case '+'-> n1 + n2;
		case '-'-> n1 - n2;
		case '*'-> n1 * n2;
		case '/'-> n1 / n2;
		default ->{
			System.out.println("Invalid Operator");
			yield 0;
		}
		
		};
		System.out.println("Result: "+ result);
		// TODO Auto-generated method stub

	}

}
