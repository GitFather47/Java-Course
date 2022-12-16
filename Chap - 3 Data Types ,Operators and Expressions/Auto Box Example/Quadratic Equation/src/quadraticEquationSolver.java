//learnt math sqrt and if statement
import java.util.Scanner;
public class quadraticEquationSolver {

	public static void main(String[] args) {
		//example =Eq.: 2x^2+5x-3=0
		Scanner input = new Scanner(System.in);
		System.out.println("a = ");
		int a = input.nextInt();
		System.out.println("b = ");
		int b = input.nextInt();
		System.out.println("c = ");
		int c = input.nextInt();
		//D=determinant
		double D = b*b -4.0*a*c;
		
		if (D > 0.0) {
			double root1= (-b - Math.sqrt(D)) / (2.0 * a);
			double root2= (-b + Math.sqrt(D)) / (2.0 * a);
			System.out.println("The roots = "+ root1 + " , " +root2);
		}else if (D == 0.0){
		    double root = b /(2.0*a);
		    System.out.println("The root = "+ root);
		}else {
			System.out.println("No root");
		}
		// TODO Auto-generated method stub

	}

}
