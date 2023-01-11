//1+(1/2)+(1/3)+....+(1/(n-1))+(1/n) whereas n=5000
public class HarmonicSum {

	public static void main(String[] args) {
		int n =5000;
		double sum= 0.0;
		for (int i =1; i<=n; i++) {
			sum += 1.0/i;
		}
		System.out.println("sum "+ sum);
		// TODO Auto-generated method stub

	}

}
