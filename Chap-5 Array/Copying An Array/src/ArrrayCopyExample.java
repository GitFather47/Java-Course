import java.util.Arrays;
public class ArrrayCopyExample {

	public static void main(String[] args) {
		  int myArray[] = new int[10];
		  int[] copyTo= new int[10];
		  /*Method 1 
		  for (int i = 0; i <myArray.length;i++) {
			  copyTo[i]=myArray[i];
		  }
		  */
		//Method 2
		System.arraycopy(myArray, 5, copyTo, 7, 3);
		
		int[] array = {1, 2, 4, 8, 16, 32, 64, 128};
		int[] copied1=Arrays.copyOf(array, 10);
		int[] copied2=Arrays.copyOfRange(array, 1, 4);
		System.out.println("Copied Array1: "+Arrays.toString(copied1));
		System.out.println("Copied Array2: "+Arrays.toString(copied2));
		
		// TODO Auto-generated method stub

	}

}
