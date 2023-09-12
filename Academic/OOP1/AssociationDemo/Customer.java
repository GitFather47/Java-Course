import java.lang.*;

public class Customer
{
	private int nid;
	private String name;
	private int age;
	private String mobileNumber;
	
	private SavingsAccount SavingsAccounts[]= new SavingsAccount[3];
	private FixedAccount FixedAccounts[]=new FixedAccounts[10];
	
	public Customer()
	{
		System.out.println("E-customer");
		
	}
	
	public Customer(int nid, String name, age, String mobileNumber)
	{
		System.out.println("P-Customer");
		
		this.nid=nid;
		this.name=name;
		this.age=age;
		this.mobileNumber=mobileNumber;
		
	}
	
	public void setNid(int nid)
	{
		this.nid=nid;
		
	}
	public void setName(String name)
	{
	
	this.name=name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber=mobileNumber;
	}
	
	public int getNid()
	{
		return nid;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getMobileNumber()
	{
		return mobileNumber;
	}
	
	public boolean insertSavingAccount(SavingsAccount sa)
	{
		boolean flag = false;
		for(int i=0;i<savingsAccount.length;i++)
		{
			if(savingsAccount[i]==null)
			{
				savingsAccount[i]=sa;
				flag=true;
				break;
			}
		}
		return flag;
			
	}
	
	public boolean removeSavingsAccount(SavingsAccount sa)
	{
		boolean flag= false;
		for(int i=0;i<savingsAccount.length;i++)
		{
			if(savingsAccount[i]==sa)
			{
				savingsAccount[i]=null;
				flag true;
				break;
			}
		}
		return flag;
	}
	public void showAllSavedAccount()
	{
		for(int i=0;i<savingsAccount.length;i++)
		{
		if(savingsAccount[i]!= null)
		{
			savingsAccount[i].showDetails();
			System.out.println();
		}
		}
	}
	public SavingsAccount searchSavingsAccount(int accountNumber)
	{
		SavingsAccount flag=null;
		for(int i=0;i<savingsAccount.length;i++)
		{
			if(savingsAccount[i]!= null)
			{
				if(savingsAccount[i].getAccountNumber()==accountNumber)
				{
					flag=savingsAccount[i];
					break;
				}
			}
		
		}
		return flag;
	}
	
}