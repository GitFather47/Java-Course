import java.util.Scanner;
public class ExperssionSolver {

	public static void main(String[] args) {
		int i =Integer.MAX_VALUE;
		System.out.println("The largest value that an Integer can hold is: "+ i);
		
		int j=5;
		double k = j * j + 2 + Math.random();
		System.out.println(k);
		int m=5;
		int n = 6;
		int l = 9 ;
		int expre1= (m+n)/2-l;//-4
		int expre2= m+n/2-l;//-1
		System.out.println(expre1);
		System.out.println(expre2);
		
		Scanner input = new Scanner(System.in);
		System.out.println("x= ");
		int x = input.nextInt();
		System.out.println("y= ");
		int y = input.nextInt();
		System.out.println("a= ");
		int a = input.nextInt();
		System.out.println("b= ");
		int b = input.nextInt();
		double result = (x - 5)/2 + 2*((55-y)/ (double)a - (b+9)/(double)y)/2.5 + 42;
		System.out.println("result= "+result);
		// TODO Auto-generated method stub

	}

}
