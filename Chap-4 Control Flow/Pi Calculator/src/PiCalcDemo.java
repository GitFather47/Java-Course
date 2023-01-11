
public class PiCalcDemo {

	public static void main(String[] args) {
		Picalculator calculator = new Picalculator();
		var pi = calculator.calculate(100_000);
		System.out.println("Pi= "+pi);
		// TODO Auto-generated method stub

	}

}
