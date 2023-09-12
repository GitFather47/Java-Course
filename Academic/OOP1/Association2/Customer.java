import java.lang.*;

public class Customer
{
	private int nid;
	private String name;
	private int age;
	private String mobileNumber;
	private SavingsAccount savingsAccounts[] = new SavingsAccount[3];
	private FixedAccount fixedAccounts[] = new FixedAccount[10];
	
	public Customer()
	{
		System.out.println("E-Customer");
	}
	public Customer(int nid, String name, int age, String mobileNumber)
	{
		System.out.println("P-Customer");
		this.nid = nid;
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
	}
	
	public void setNid(int nid){this.nid = nid;}
	public void setName(String name){this.name = name;}
	public void setAge(int age){this.age = age;}
	public void setMobileNumber(String mobileNumber){this.mobileNumber = mobileNumber;}
	
	public int getNid(){return nid;}
	public String getName(){return name;}
	public int getAge(){return age;}
	public String getMobileNumber(){return mobileNumber;}
	
	public void showDetails()
	{
		System.out.println("Customer NID: " + nid);
		System.out.println("Customer Name: " + name);
		System.out.println("Customer Age: " + age);
		System.out.println("Customer Mobile Number: " + mobileNumber);
		
	}
	public boolean insertSavingsAccount(SavingsAccount sa)
	{
		boolean flag = false;
		for(int i = 0; i<savingsAccounts.length; i++)
		{
			if(savingsAccounts[i] == null)
			{
				savingsAccounts[i] = sa;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeSavingsAccount(SavingsAccount sa)
	{
		boolean flag = false;
		for(int i=0; i<savingsAccounts.length; i++)
		{
			if(savingsAccounts[i] == sa)
			{
				savingsAccounts[i] = null;
				flag = true;
				break;
			}
		}
		return flag;		
	}
	public void showAllSavingsAccounts()
	{
		for(int i=0; i<savingsAccounts.length; i++)
		{
			if(savingsAccounts[i] != null)
			{
				savingsAccounts[i].showDetails();
				System.out.println();
			}
			
		}
	}
	public SavingsAccount searchSavingsAccount(int accountNumber)
	{
		SavingsAccount flag = null;
		for(int i=0; i<savingsAccounts.length; i++)
		{
			if(savingsAccounts[i] != null)
			{
				if(savingsAccounts[i].getAccountNumber() == accountNumber)
				{
					flag = savingsAccounts[i];
					break;
				}
			}
		}
		return flag;
	}
	
	
	public boolean insertFixedAccount(FixedAccount fa)
	{
		boolean flag = false;
		for(int i = 0; i<fixedAccounts.length; i++)
		{
			if(fixedAccounts[i] == null)
			{
				fixedAccounts[i] = fa;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeFixedAccount(FixedAccount fa)
	{
		boolean flag = false;
		for(int i=0; i<fixedAccounts.length; i++)
		{
			if(fixedAccounts[i] == fa)
			{
				fixedAccounts[i] = null;
				flag = true;
				break;
			}
		}
		return flag;		
	}
	public void showAllFixedAccounts()
	{
		for(int i=0; i<fixedAccounts.length; i++)
		{
			if(fixedAccounts[i] != null)
			{
				fixedAccounts[i].showDetails();
				System.out.println();
			}
			
		}
	}
	public FixedAccount searchFixedAccount(int accountNumber)
	{
		FixedAccount flag = null;
		for(int i=0; i<fixedAccounts.length; i++)
		{
			if(fixedAccounts[i] != null)
			{
				if(fixedAccounts[i].getAccountNumber() == accountNumber)
				{
					flag = fixedAccounts[i];
					break;
				}
			}
		}
		return flag;
	}
}