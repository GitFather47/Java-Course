import java.util.Scanner;
public class TimesTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int counter = 1;
		while (counter<11) {
			System.out.println(num + " × " +counter+" = "+counter*num );
			counter++;
		}
		// TODO Auto-generated method stub

	}

}
