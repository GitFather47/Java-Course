import java.util.Scanner;
public class InputGoBrrr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Length of Array: ");
		int sizeOfArray = input.nextInt();
		int[] array= new int[sizeOfArray];//Seting Length
		for(int i=0;i<array.length;i++) {
			System.out.println("Input the elements: ");
			array[i]=input.nextInt();//Assigns input in the specific index
		}
		System.out.println("Index\t\tValue");
		for (int i=0;i<array.length;i++) {
			System.out.println(i+"\t\t\t"+array[i]);
		}
		// TODO Auto-generated method stub

	}

}
