public class Parent {

	public int x;

	Parent() { 
		this(10);
		System.out.println("Default Constructor of Parent"); 
	}

	Parent(int x) {
		this(10, 20); 
		System.out.print("Parameterized Constructor of Parent - 1"); 
	}

	Parent(int x, int y) {
		this(10, 20, 30); 
		System.out.println("Parameterized Constructor of Parent - 2"); 

	}

	Parent(int x, int y, int z) { 
		System.out.println("Parameterized Constructor of Parent - 3"); 
	}

	void show() {
		System.out.println("Value of x asdasdasd = " + x);
	}
}
