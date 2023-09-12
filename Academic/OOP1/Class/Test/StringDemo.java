public class StringDemo
{
public static void main(String[] args) 
{
	String s1="HELLO java";
	String s2= new String();
	String s3 = new String("Hello");
	String s4 = "Hello";
	String s5 = new String("Hello");
	String s6 = "Hello";
	String s8=new String("JaVaClaSs");
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s3.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s8));
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.charAt(1));
		
		System.out.println(s1.concat(s3));
	System.out.println(s1);
	System.out.println(s3);
		if(s3 == s5)
	{
	System.out.println("yes");
	}
	else
	{
	System.out.println("No");
	}
	if(s3.equals(s5))
	{
	System.out.println("yes");
	}
	else
	{
	System.out.println("No");
	}
	if(s1 == s5)
	{
	System.out.println("yes");
	}
	else
	{
	System.out.println("No");
	}
	if(s1.equals(s5))
	{
	System.out.println("yes");
	}
	else
	{
	System.out.println("No");
	}
String s7 = s1.substring(2,7);//begin index is inclusive end index is exclusive
	System.out.println("S7 is: "+s7);
	System.out.println(s1);
	s1 = s1.substring(3,7);
	System.out.println("S1:"+s1); 
	s8=s8.toLowerCase();
	System.out.println(s8);	
       }
}
	
		
