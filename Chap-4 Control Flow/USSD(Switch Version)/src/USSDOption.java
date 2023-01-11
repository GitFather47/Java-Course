import java.util.Scanner;
public class USSDOption {

	public static void main(String[] args) {
		System.out.println("""
				1.Bill Pay
				2.Send Money
				3.TopUp/Telco Service
				4.Bank A/C 
				5.My Acc
				6.Binimoy
				7.Cashout
				8.Merchant Pay
				9.Toll Card
				0.Logout
				Select your option""" );
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("""
					                             1.Self,
					                             2.Other""");
			break;
		case 2:
			System.out.println("Enter Mobile/Account No");
			break;
		case 3:
			System.out.println("""
													1.Top Up 
													2.Mobicash 
													3.Internet Data 
													4Robicash Refill""");
			break;
		case 4:
			System.out.println("""
					                              1.From ur Bank Acc
					                              2.To ur Bank Acc
					                              3.To Any Bank Acc
					                              4.To Any Card
					                              5.To Other Bank """);
			break;
		case 5:
			System.out.println("""
											    1.Balance
												2.Statement
												3.Change Pin 
												4.Account No
												5.Remittance
												6.Help
												9.Main Menu""");
			break;
		case 6:
			System.out.println("""
					No User Found 
					0.Back
					""");
			break;
		case 7:
			System.out.println("""
					1.From Agent
					2.From ATM
					""");
			break;
		case 8:
			System.out.println("Enter Merchant's 12-digit Account No");
			break;
		case 9:
			System.out.println("""
					1.Balance Inquiry
					2.Mini Statement
					3.Recharge Toll Card
					""");
			break;
		case 0:
			System.out.println("You have succesfully logout.Thank You.");
			break;
		default:
			System.out.println(""" 
					Please select correct option
					1.Main menu
					0.LogOut
					Select Your option
					""");
		}
		// TODO Auto-generated method stub

	}

}
