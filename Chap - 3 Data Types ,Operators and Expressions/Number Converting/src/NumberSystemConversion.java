
public class NumberSystemConversion {

	public static void main(String[] args) {
		int decimal = 1_000_000;//1 million
		
		String binary = Integer.toBinaryString(decimal);
		String octal = Integer.toOctalString(decimal);
		String hex = Integer.toHexString(decimal);
		
		System.out.println("Binary= " + binary);
		System.out.println("Octal= " + octal);
		System.out.println("Hex= " + hex);
		// TODO Auto-generated method stub

	}

}
