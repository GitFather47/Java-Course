import java.util.Scanner;
public class IPayMyTaxes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Your Income: ");
		int income = input.nextInt();
		
		double taxIncome = income - 3_00_000;
		double tax;
		if (taxIncome<=1_00_000) {
			 tax = taxIncome*0.05;
		} else if (taxIncome <=4_00_000) {
			 tax = (1_00_000)*0.05 + (taxIncome-1_00_000)*0.10;
		} else if (taxIncome<=8_00_000) {
			tax = (1_00_000)*0.05+(3_00_000)*0.10 + (taxIncome-4_00_000)*0.15;
			
		}
		else if (taxIncome<=13_00__000) {
			tax = (1_00_000)*0.05+(3_00_000)*0.10 + (4_00_000)*0.15+(taxIncome-8_00_000)*0.20;
			
		}
		else {
			tax = (1_00_000)*0.05+(3_00_000)*0.10 + (4_00_000)*0.15+(5_00_000)*0.20+(taxIncome-13_00_000)*0.25;
		}
		System.out.println("Your Tax is : "+tax);
		// TODO Auto-generated method stub

	}

}
