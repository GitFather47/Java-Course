import java.util.Scanner;
public class Edges {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 edges of a triangle: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		/*How to check a Valid Triangle edges?? 2conditions  should be met.
		1.The largest edge should be smaller than the sum of the other two edges
		2.Following number 1 condition , the sum of any  2 edges should be bigger than the 
		    other edge ,which means--
		    a+b>c and b+c>a and c+a>b
		*/
		if (a+b>c&&b+c>a&&c+a>b) {
			System.out.println("VALID");
		}
		else {
			System.out.println("INVALID");
		}
		// TODO Auto-generated method stub

	}

}
