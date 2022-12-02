import java.util.Scanner;

public class inchtoMeter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.println("Enter Lentgh in inch: ");
			double inch = input.nextDouble();
			double meters = inch * 0.0254;
			
			System.out.println(inch+" inch is " +meters+" meters ");
			// TODO Auto-generated method stub
		}

	}


