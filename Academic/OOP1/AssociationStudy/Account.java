import java.lang.*;

public class Account
{
	protected int accountNumber;
   
    protected double balance;
	
	public Account(){System.out.println("Empty-Account");}
	public Account(int accountNumber, double balance)
	{
		System.out.println("Parameterized-Account");
		this.accountNumber = accountNumber;
		
		this.balance = balance;
	}	
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance)
	{
		this.balance=balance; 
	}
	
	public int getAccountNumber()
	{
		return accountNumber; 
	}
	
	public double getBalance()
	{ 
		return balance;
	}
	
	public void showDetails()
	{
		System.out.println("Account Number: "+ accountNumber);
		
		System.out.println("Balance: "+ balance);
	}
}