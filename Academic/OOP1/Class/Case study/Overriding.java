/*Methods MUST be in two different classes.
There MUST be inheritance between the two classes.
Method Name MUST be same.
Method Parameter MUST be same.
Method Return Type MUST be same.
*/

class A {
int i, j;
public A(int a, int b) {
i = a;
j = b;
}
// display i and j
void show() {
System.out.println("i and j: " + i + " " + j);
}
}
// Create a subclass by extending class A.
class B extends A {
double k;
public B(int a, int b, int c){
super(a, b);
k = c;
}
// overload show()
void show(String msg) {
	super.show();
System.out.println(msg + k);
}
}
public class Overriding {
public static void main(String args[]) {
B subOb = new B(1, 2, 3);
subOb.show("This is k: "); // this calls show() in B
subOb.show(); // this calls show() in A
}
}
//The output produced by this program is shown here:
//This is k: 3
//i and j: 1 2