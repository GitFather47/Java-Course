// Abstract class
abstract class Shape {
    // Final variable
    final int sides;

    Shape(int sides) {
        this.sides = sides;
    }

    // Abstract method
    abstract double calculateArea();

    // Final method
    final void displayInfo() {
        System.out.println("I am a shape with " + sides + " sides.");
    }
}

// Concrete classes inheriting from Shape
class Circle extends Shape {
    int radius;

    Circle(int radius) {
        super(0); // Circles have 0 sides
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    int sideLength;

    Square(int sideLength) {
        super(4); // Squares have 4 sides
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }
}

public class Main {
    public static void main(String[] args) {
        // Polymorphism using an object array of the abstract class Shape
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(4);

        for (Shape shape : shapes) {
            shape.displayInfo(); // Static method call
            System.out.println("Area: " + shape.calculateArea());
        }

        // instanceof keyword
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("This is a circle.");
            } else if (shape instanceof Square) {
                System.out.println("This is a square.");
            }
        }

        // Static method call
        int x = 5;
        int y = increment(x);
        int z = decrement(y);
        System.out.println("Incremented and decremented values: " + y + ", " + z);
    }

    // Static method
    static int increment(int value) {
        return value + 1;
    }

    static int decrement(int value) {
        return value - 1;
    }
}
