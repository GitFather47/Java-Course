import java.lang.*;

public class SavingsAccount extends Account
{
	private double interestRate;
	
	public savingsAccount()
	{
		super();
		System.out.println("SA-E");		
	}
	public savingsAccount(int accountNumber, double balance, double interestRate)
	{
		super(accountNumber,balance);
		System.out.println("SA-P");
		this.interestRate=interestRate;
	}
	public void setInterestRate(double interestRate)
	{
		this.interestRate=interestRate;
	}
	
	public double getInterestRate
	{
		return interestRate;
	}
	public showDetails()
	{
		super.showDetails();
		System.out.println("Interest Rate :"+interestRate);
	}
}