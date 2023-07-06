public class Child extends Parent {

	public int y;

	Child() { 
		super();
		System.out.println("Default Constructor of Child"); 		
	}

	void show() {
		super.show();
		System.out.println("Value of y = " + y);
	}
}