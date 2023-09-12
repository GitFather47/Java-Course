import java.util.Scanner;
import java.util.Scanner;
public class AvarageMinAndMaxCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Length of Array: ");
		int sizeOfArray = input.nextInt();
		int[] array= new int[sizeOfArray];//Seting Length
		for (int i=0;i<array.length;i++) {
			System.out.println("Input the "+i+"th element: ");
			array[i]=input.nextInt();
		}
		int sum =0;
		for (int i=0;i<array.length;i++) {
			sum +=array[i];
			
		}
		double avarage = sum/array.length;
		
		int max = array[0];
		int min=array[0];
		for (int i=1;i<array.length;i++) {
			if (max<array[i]) {
				max=array[i];
			}
			if(min>array[i]) {
				min=array[i];
			}
		}
		System.out.println("Sum: "+sum);
		System.out.print("Avarage: "+ avarage);
		System.out.print("\nMax: "+max);
		System.out.print("\nMin: "+min);
		// TODO Auto-generated method stub

	}

}
