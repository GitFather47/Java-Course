import java.lang.*;

public class FixedAccount extends Account
{
	private int tenureYear;
	
	public FixedAccount()
	{
		super();
		System.out.println("FA-E");
	}
	public FixedAccount(int accountNumber, double balance, int tenureYear)
	{
		super(accountNumber, balance);
		System.out.println("FA-P");
		this.tenureYear = tenureYear;
	}

}