
public class ContinueAndBreak {

	public static void main(String[] args) {
		for (int i =0; i<10;i++) {
			if (i%2==0){
				continue;
			}
			System.out.println("Number is: "+i);
			if (i==7) {
				break;
			}
		}
		// TODO Auto-generated method stub

	}

}
