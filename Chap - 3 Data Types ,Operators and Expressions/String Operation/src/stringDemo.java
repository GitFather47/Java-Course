
public class stringDemo {
//Concatenating strings
	public static void main(String[] args) {
		String heisenberg1 = "Guess I got what I deserved\nKept you waiting there too long, my love\n";
		String heisenberg2 ="All that time, without a word\nDid you really think that I'd forget\n";
		String heisenberg3 ="And I regret\nThe special love I have for you\nMy baby blue";
		
		String danger = heisenberg1 + heisenberg2 +heisenberg3;
		String name ="Jessie";
		System.out.println(name +", We need to cook");
		System.out.println("\n");
		System.out.println(danger);
		System.out.println("\n");
		//Follows a serial
		System.out.println(5 + 3 +" Abcd");
		System.out.println(5 + 3 *2 + " Abcd");
		System.out.println("Abcd " + 5 + 3 *2  );
		System.out.println("Abcd "+ 5 + 3);
		/*After string + operator serves as a concatiantion operator
		  to avoid that use ()
		 */
		System.out.println("Abcd "+ (5 + 3));
		System.out.println("Abcd "+ (7 + 7 + 2 * 10 +16));
		
		int minutes = 30;
		String loki="I've been falling for " +minutes +" minutes";
		System.out.println(loki);
		// TODO Auto-generated method stub

	}

}
