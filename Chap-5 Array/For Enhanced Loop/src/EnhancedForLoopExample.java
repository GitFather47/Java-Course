
public class EnhancedForLoopExample {

	public static void main(String[] args) {
		int[] nums = {1, 2, 4, 8, 16, 32, 64, 128};
		int sum = 0;
		
		for (int num: nums) {
			sum+=num;
		}
		System.out.println("Sum="+ sum);
		// TODO Auto-generated method stub

	}

}
