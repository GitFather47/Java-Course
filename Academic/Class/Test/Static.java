public class Staic{
	static int i =0;//class variable
	private float j=1.8f;//instance or object variable
	public static void main(String[] args) {
		Obj o1 = new Obj();
		Obj o2 = new Obj(30);
		Obj o3 = new Obj(20);
		o2.show();
		o3.show();
	}



}
class Obj{
static int i;
Obj(){
	System.out.println("Empty constructor");
}
Obj(int i){//parameter i is local variable
	System.out.println("Parameterized constructor");
	i=i;
}
public static void show(){
	System.out.println("Value of i = "+i);
}
}