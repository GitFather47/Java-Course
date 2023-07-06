import java.util.Scanner;
 
class Main {
 
    public static void main(String[] args) {
        Student studentArray[] = new Student[5];
 
        Student s1 = new Student();
        s1.setId(10);
 
        studentArray[0] = s1;
 
        for(int i = 0; i < studentArray.length; i++) {
            if (studentArray[i] != null) {
                System.out.println(i + " = " + studentArray[i].getId());
            }
        }
    }
}
 
class Student {
 
    int id;
 
    Student() { System.out.println("Default Constructor of Student"); }
 
    void setId(int id) { this.id = id; }
 
    int getId() { return id; }
}