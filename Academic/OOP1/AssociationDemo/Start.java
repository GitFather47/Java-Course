import java.lang.*;
public class StartDocument
{
	public static void main(String args[])
	{
		SavingsAccount sa1= new savingsAccount();
		
		sa1.setAccountNumber(1111);
		sa1.setBalance(55000.0);
		sa1.setInterestRate(8.7);
		
		savingsAccount sa2 = new SavingsAccount(1112,6000.0,8.4);
		savingsAccount sa3 = new SavingsAccount(1113,5500.0,6.7);
		savingsAccount sa2 = new SavingsAccount(1114,6500.0,9.2);
		
		FixedAccount fa1= new fixedAccount();
		fa1.setAccountNumber(2111);
		fa1.setBalance(100000.0);
		fa1.setTenureYear(10);
		FixedAccount fa2 =new FixedAccount(2112,20000.0,5);
		FixedAccount fa3= new FixedAccount(2113,250000.0,7);
		FixedAccount fa3= new FixedAccount(2114,120000.0,3);
	}
}
