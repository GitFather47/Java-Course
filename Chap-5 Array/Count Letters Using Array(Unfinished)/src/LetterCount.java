import java.util.Scanner;
public class LetterCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Characters: ");
		String inputValue= input.nextLine().toLowerCase();
		char[] letters =inputValue.toCharArray();
		int[] counts = new int[26];
	   for (int i=0;i<letters.length;i++) {
		   char letter =letters[i];
		   if(Character.isLetter(letter)) {
			  int index = letter -'a';
			  counts[index]++;
			  /*array length 26 'cause alphabet is 26
			   * 1st it will measure the distance from letter a to every letter given
			   * then it will assign the distance as index number 
			   * ex: a - a = 0 and z-a=25
			   * so it will assign index 0 and 25 in that array (specific array index for specific characters)
			   * and then as every primitive integer array's default val;ue is 0,
			   * we will increment it by 1so..
			   * counts[index]++
			   * 
			   */
		   }
	   }
		   System.out.println("Letter Counts: ");
		   for (int i=0;i<counts.length;i++) {
				 if (counts[i]!=0) {//counts[i] is index value
				       char letter = (char)(i+'a');
				       System.out.println(letter+":"+counts[i]);
				   }
			   }
		// TODO Auto-generated method stub

	}

}
