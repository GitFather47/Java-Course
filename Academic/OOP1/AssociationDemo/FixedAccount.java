import java.lang.*;

public class FixedAccount extends AccountException
{
	private int tenureYear;
	public FixedAccount()
	{
		super();
		System.out.println("FA-E");
		
		
	}
	public FixedAccount(int accountNumber, double balance,int tenureYear)
	{
		super(accountNumber , balance);
		System.out.println("FA-P");
		this.tenureYear=tenureYear;
	}
	public showDetails()
	{
		super.showDetails();
		System.out.println("Tenure Year :"+tenureYear);
	}
}