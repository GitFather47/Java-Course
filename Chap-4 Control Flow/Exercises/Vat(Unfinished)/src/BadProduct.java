import java.util.Scanner;
public class BadProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many products did you buy? ");
		int items = input.nextInt() ;
		System.out.println("Enter their prices one by one: ");
		int p1 = input.nextInt();
		int p2 = input.nextInt();
		int total = (p1+p2)+(int)((p1+p2)*0.15);
		System.out.println("Total Price: "+ total );
		int money,c1;
		do {
			System.out.println("Give me my rent: ");
			money = input.nextInt();
			if (money==total) {
				System.out.println("ありがとうございます");//Arigato Gozaimasu
			}
			else if(total>money) {
					c1 = total - money;
					System.out.println("Pay More "+c1+". I need that money.");
					money+=c1;//Not appearing input
			}
			else{
				System.out.println("Here is your changes. "+ (money-total));
			}
		}while(money!=total);
		// TODO Auto-generated method stub

	}

}
