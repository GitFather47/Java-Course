import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		SavingsAccount sa1 = new SavingsAccount();
		sa1.setAccountNumber(1111);
		sa1.setBalance(5000.0);
		sa1.setInterestRate(7.8);
		
		SavingsAccount sa2 = new SavingsAccount(1112, 6000.0, 8.4);
		
		FixedAccount fa1 = new FixedAccount();
		fa1.setAccountNumber(2111);
		fa1.setBalance(100000.0);
		fa1.setTenureYear(10);
		
		FixedAccount fa2 = new FixedAccount(2112, 200000.0, 5);
		
		Customer c1 = new Customer();
		c1.setNid(11111111);
		c1.setName("Mr. ABC");
		c1.setAge(20);
		c1.setMobileNumber("+8801711111111");
		c1.setSavingsAccount(sa1);
		c1.setFixedAccount(fa1);
		
		Customer c2 = new Customer(11111112, "Ms. XYZ", 18, "+8801811111111", sa2, fa2);
		
		System.out.println("\n---------------------------\n");
		
		System.out.println("Customer NID: " + c1.getNid());
		System.out.println("Customer Name: " + c1.getName());
		System.out.println("Customer Age: " + c1.getAge());
		System.out.println("Customer Mobile Number: " + c1.getMobileNumber());
		System.out.println();
		System.out.println("************** Customer Savings Account ******************");
		System.out.println("Customer SavingsAccount - Account Number: " + c1.getSavingsAccount().getAccountNumber());
		System.out.println("Customer SavingsAccount - Account Balance: " + c1.getSavingsAccount().getBalance());
		System.out.println("Customer SavingsAccount - Interest Rate " + c1.getSavingsAccount().getInterestRate());
		System.out.println();
		System.out.println("************** Customer Fixed Account ******************");
		System.out.println("Customer FixedAccount - Account Number: " + c1.getFixedAccount().getAccountNumber());
		System.out.println("Customer FixedAccount - Account Balance: " + c1.getFixedAccount().getBalance());
		System.out.println("Customer FixedAccount - Tenure Year: " + c1.getFixedAccount().getTenureYear());
		
		System.out.println("\n---------------------------\n");
		
		c2.showDetails();
	}
}