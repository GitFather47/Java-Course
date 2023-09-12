public class Main {

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.x = 10;
		c1.y = 20;
	    c1.show();
        Child c2 = new Child(67);
        c2.show();
        c2.x = 80;
		c2.y = 50;
		c2.show();
	}
}
