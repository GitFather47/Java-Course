import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many student records do you want to insert?");
        Student stu[] = new Student[input.nextInt()];
        input.nextLine(); // Consume the newline character

        for (int i = 0; i < stu.length; i++) {
            System.out.print("Enter ID for Student " + (i + 1) + ": ");
            int inputId = input.nextInt();
            input.nextLine(); // Consume the newline character
            System.out.print("Enter name for Student " + (i + 1) + ": ");
            String inputName = input.nextLine();

            stu[i] = new Student();
            stu[i].setNameAndId(inputId, inputName);

            System.out.print("How many courses are there for student " + (i + 1) + "? ");
            int numCourses = input.nextInt();
            input.nextLine(); // Consume the newline character
            stu[i].setMarks(numCourses);
        }

        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null) {
                System.out.println("\nDetails of Student: " + (i + 1));
                System.out.println("ID: " + stu[i].getId() + " Name: " + stu[i].getName() + " Avg: " + stu[i].calculateAvg());
                System.out.println("Marks: ");
                stu[i].getMarks();
                System.out.println("Highest Mark: " + stu[i].getHighestMark());
            }
        }
    }
}

class Student {
    int id;
    String name;
    int[] marks;
    float avg;

    void setNameAndId(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    void setMarks(int size) {
        marks = new int[size];
        int sum = 0;
        Scanner inputMarks = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter mark for course " + (i + 1) + ": ");
            marks[i] = inputMarks.nextInt();
            sum += marks[i];
        }

        avg = (float) sum / size;
    }

    void getMarks() {
        for (int j = 0; j < marks.length; j++) {
            System.out.println("Course " + (j + 1) + ": " + marks[j]);
        }
    }

    float calculateAvg() {
        return avg;
    }

    int getHighestMark() {
        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        return max;
    }
}
