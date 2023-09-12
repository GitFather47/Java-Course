abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    // area is now an abstract method
    abstract double area();

    abstract double show();
}

abstract class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    // override area for rectangle
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}

class Shape extends Rectangle {
    Shape(double a, double b) {
        super(a, b);
    }

    @Override
    public double show() {
        System.out.println("Jojo");
        return 0.0; // Add a return statement since the method expects a double return type
    }
}

public class Abstraction {
    public static void main(String args[]) {
        Rectangle r = new Shape(9, 5); // Instantiate Shape instead of Rectangle
        Figure figref; // this is OK, no object is created, IMPORTANT!!!!!
        figref = r;
        System.out.println("Area is " + figref.area());
        figref.show(); // Call show() method using the Figure reference
    }
}
