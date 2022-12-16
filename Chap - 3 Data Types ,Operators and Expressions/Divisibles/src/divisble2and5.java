import java.util.Scanner;
public class divisble2and5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		 if (n%2==0 && n%5 ==0 ) {
			 System.out.println(n+" is divisible by both 2 and 5");
		 }
		 else {
			 System.out.println(n+" is  not divisible by both 2 and 5");
		 }
		// TODO Auto-generated method stub

	}

}
