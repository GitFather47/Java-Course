import java.lang.*;

public class Customer
{
	private int nid;
	private String name;
	private int age;
	private String mobileNumber;
	private SavingsAccount savingsAccount;
	private FixedAccount fixedAccount;
	
	public Customer(){System.out.println("E-Customer");}
	public Customer(int nid, String name, int age, String mobileNumber, SavingsAccount savingsAccount, FixedAccount fixedAccount)
	{
		System.out.println("P-Customer");
		this.nid = nid;
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.savingsAccount = savingsAccount;
		this.fixedAccount = fixedAccount;
	}
	
	public void setNid(int nid){
		this.nid = nid;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
}
	public void setMobileNumber(String mobileNumber){
		this.mobileNumber = mobileNumber;
	}
	public void setSavingsAccount(SavingsAccount savingsAccount){
		this.savingsAccount = savingsAccount;
	}
	public void setFixedAccount(FixedAccount fixedAccount){
		this.fixedAccount = fixedAccount;
	}
	
	public int getNid(){
		return nid;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getMobileNumber(){
		return mobileNumber;
	}
	public SavingsAccount getSavingsAccount(){
		return savingsAccount;
	}
	public FixedAccount getFixedAccount(){
		return fixedAccount;
	}
	
	public void showDetails()
	{
		System.out.println("Customer NID: " + nid);
		System.out.println("Customer Name: " + name);
		System.out.println("Customer Age: " + age);
		System.out.println("Customer Mobile Number: " + mobileNumber);
		System.out.println();
		System.out.println("************** Customer Savings Account ******************");
		savingsAccount.showDetails();
		System.out.println();
		System.out.println("************** Customer Fixed Account ******************");
		fixedAccount.showDetails();
	}
}