import java.util.Scanner;
import java.lang.Math;
public class FitInCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Height: ");
		int h= input.nextInt();
		System.out.print("Width: ");
		int w = input.nextInt();
		System.out.print("Enter radius: ");
		int r = input.nextInt();
		int Carea = (int)Math.PI*r*r;
		int Rarea = h * w;
		if (Rarea<=Carea) {
			System.out.println("The rectangle can fit inside the circle.");
		}
		else {
			System.out.println("Sorry Cunt.It can't fit");
		}
		
		// TODO Auto-generated method stub

	}

}
