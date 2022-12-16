
public class overunderflow {

	public static void main(String[] args) {
		int a = 2_147_483_647;
		a +=1;
		System.out.println(a);
		int b = -2_147_483_648;
		b +=-1;
		System.out.println(b);
		
		System.out.println("Doubles");
		System.out.println("Overflow: "+Double.MAX_VALUE *2);
		System.out.println("Underflow: "+Double.MIN_VALUE /2);
		// TODO Auto-generated method stub

	}

}
