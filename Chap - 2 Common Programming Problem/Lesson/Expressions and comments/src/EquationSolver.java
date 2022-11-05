// Single Line comment
/*Multiline comment*/
/** This is a JAVAdoc comment
 * 
 * @author ARNOB
 *Billy Joel
 */
import java.util.Scanner;
public class EquationSolver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x = ");
		double x = input.nextDouble();
		System.out.println("Enter a = ");
		int a = input.nextInt();
		System.out.println("Enter b = ");
		int b = input.nextInt();
		System.out.println("Enter c = ");
		int c = input.nextInt();
		
		double z = a*x*x + b*x +c;
		//This is an expression
		System.out.println("Result = " + z);
		// TODO Auto-generated method stub

	}

}
