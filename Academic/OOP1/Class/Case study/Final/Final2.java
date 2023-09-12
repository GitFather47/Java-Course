class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

}

final class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    // override area for rectangle
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}



public class Final2{
    public static void main(String args[]) {
         // Instantiate Shape instead of Rectangle
        Figure figuref = new Figure(2.00, 3.00);
        Rectangle r = (Rectangle)figuref; // this is OK, no object is created, IMPORTANT!!!!!
        System.out.println("Area is " + r.area());
         // Call show() method using the Figure reference
    }
}
