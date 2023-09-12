
public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		int array[][] = new int[12][8];
		for (int row =0;row<array.length;row++) {
			for(int column =0;column<array[row].length;column++) {
				array[row][column]=row*column+1;
			}
		}
		for (int row =0;row<array.length;row++) {
			for(int column =0;column<array[row].length;column++) {
				//Continue...
				System.out.println("%3d",array[row][column]);
			}
		}
		// TODO Auto-generated method stub

	}

}
