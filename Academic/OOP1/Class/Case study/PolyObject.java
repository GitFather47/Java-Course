
// Base class Person
class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

// Derived class Employee
class Employee extends Person {
    private int employeeId;
    
    public Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + employeeId);
    }
}

// Derived class Student
class Student extends Person {
    private int studentId;
    
    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Student ID: " + studentId);
    }
}

// Derived class Faculty
class Faculty extends Person {
    private String facultyId;
    
    public Faculty(String name, String facultyId) {
        super(name);
        this.facultyId = facultyId;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Faculty ID: " + facultyId);
    }
}

public class PolyObject {
    public static void main(String[] args) {
        // Create objects of different classes but with a reference to the base class
        Person person1 = new Employee("John Doe", 1001);
        Person person2 = new Student("Jane Smith", 2001);
        Person person3 = new Faculty("Dr. James Brown", "F001");
        
        // Call displayInfo() method on each object
        person1.displayInfo(); // This will call the overridden method in Employee class
        person2.displayInfo(); // This will call the overridden method in Student class
        person3.displayInfo(); // This will call the overridden method in Faculty class
    }
}