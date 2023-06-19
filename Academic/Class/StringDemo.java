import java.lang.*;

public class StringDemo
{
public static void main(String args[])
{
	String s1="HELLO java";
	String s2= new String();
	String s3 = new String("Hello");
	String s4 = "Hello";
	String s5 = new String("Hello");
	String s6 = "Hello";
	String s8=new String("JaVaClaSs");
		
		System.out.println(s1.isEmpty());//false
		System.out.println(s2.isEmpty());//True
		System.out.println(s1.length());//10
		System.out.println(s3.charAt(1));//e
		
		System.out.println(s1.concat(s3));//HELLO JavaHello
	System.out.println(s1);//
	System.out.println(s3);//Hello
	if(s3 == s5)//no
	{
	System.out.println("yes");
	}
	else
	{
	System.out.println("No");
	}
	if(s3.equals(s5))//yes
	{
	System.out.println("yes");
	}
	else
	{
	System.out.println("No");
	}
String s7 = s1.substring(2,7);//begin index is inclusive end index is exclusive
	System.out.println(s7);//LLO ja
	System.out.println(s1);//HELLO javaHello
	s1 = s1.substring(3,7);//LO ja
	System.out.println(s1);//Lo ja
	s8=s8.toLowerCase();
	System.out.println(s8);//javaclass
	String s9 = s8.toUpperCase();
	System.out.println(s9);
}
}