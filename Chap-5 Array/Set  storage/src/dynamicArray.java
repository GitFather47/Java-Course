import java.util.Arrays;
import java.util.Scanner;
public class dynamicArray {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a sequence of Characters: ");
		int capacity =3;
		int size = 0;
		int[] elements= new int[capacity];
		
		int nextInt;
		while (true) {
			nextInt = input.nextInt();//Infinitely takes input
			//Then check conditions after every input
			if (nextInt==-1) {
				System.out.println("It's time to STOP");
				break;
			}//Then stops
			//The reason *1 and *2 line isn't here 'cause it wont create a new array when it exceed 3 , then it will make size 4 1st, than go to next if condition given it has no space,it will crash the program  
			if (elements.length==size) {
				int newCapacity = elements.length*2;
				elements = Arrays.copyOf(elements, newCapacity);
				
			}//If it reaches 3(size=elements index number) ,than creates a new array in the background which will make space for other elements
			elements[size]=nextInt;//*1
			size++;//*2
			if (elements.length>size) {
				elements = Arrays.copyOfRange(elements,0, size);
			}//Shrink if inputs gets small 
		}
		System.out.println("You entered: ");
		System.out.println(Arrays.toString(elements));
		// TODO Auto-generated method stub

	}

}
