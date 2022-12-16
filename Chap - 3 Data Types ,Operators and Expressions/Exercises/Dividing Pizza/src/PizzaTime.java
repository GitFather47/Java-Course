import java.util.Scanner;
public class PizzaTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total slices: ");
		int t = input.nextInt();
		System.out.println("Enter number of your friends: ");
		int f = input.nextInt();
		System.out.println("How many slices each wants: ");
		int s = input.nextInt();
		if (t>= f*s) {
			System.out.println("Pizza Time!Pizza can be splited among your friends Fairly.");
		}
		else {
			System.out.println("I'm not paying for those.Pizza can't be splited among your friends Fairly.");
		}
		// TODO Auto-generated method stub

	}

}
