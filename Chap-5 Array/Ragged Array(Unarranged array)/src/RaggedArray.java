
public class RaggedArray {

	public static void main(String[] args) {
		int[][]  arr = {
				{5,7,9,0,6},
				{7,9,0,6},
				{9,0,6},
	{0,6},
{6}
		};
		for (int row =0 ;row<arr.length;row++) {//arr.length = row numbers
			for (int col =0 ;col<arr[row].length;col++) {//arr[row].length=column numbers in the particular row 
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
