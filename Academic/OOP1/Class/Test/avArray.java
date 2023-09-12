import java.util.Scanner;
public class avArray{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Length?");
		int[] numbers = new int[input.nextInt()];
		for(int i=0; i<numbers.length;i++){
			System.out.print(i+":");
            numbers[i]=input.nextInt();
		}
		int sum=0;
		for(int i=0; i<numbers.length;i++){
			sum+=numbers[i];
		}
		double average = (double) sum/numbers.length;

		int min = numbers[0];
		int max = numbers[0];

		for(int i=1; i<numbers.length;i++){
			if(min>numbers[i]){
				min= numbers[i];

			}
			if (max<numbers[i]){
				max = numbers[i];

			}
		}
    
	}
}