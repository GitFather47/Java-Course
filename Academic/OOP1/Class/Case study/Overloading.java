class Meth1 {
    // Class Method Overloading

    // Class Method Overriding
    // Class Constructor Overloading
    // Class Object Polymorphism

    public void add() {
        System.out.println("Dwayne");
    }

    public void add(int a) {
        System.out.println("Dwayne" + a);
    }

    public void add(int a, int b) {
        System.out.println("Dwayne" + (a + b));
        System.out.println("Fam"+(a/b));
        System.out.println("Fam"+((double)a/b));
    }

    public void add(double a, double b) {
        System.out.println("Dwayne" + (a + b));
    }

    public void add(int a, double b) {
        System.out.println("Dwayne" + (a + b));
    }

    public void add(double a, int b) {
        System.out.println("Dwayne" + (a + b));
    }
    // public int add(int a) {}

}

class Meth2 {
    public void add() {
        System.out.println("Johnson");
    }

    public void add(double a) {
        System.out.println("Johnson" + a);
    }
}

public class Overloading {
    public static void main(String[] args) {
        Meth1 m1 = new Meth1();
        m1.add();
        m1.add(1, 3);
        m1.add(2.70, 0.30);

        Meth2 m2 = new Meth2();
        m2.add();
        m2.add(2);
    }
}
