import java.util.Scanner;

public class Start
{
    public static void main(String[] args)
	{
        Scanner inp = new Scanner(System.in);
        int size, indexOfMaxAvg = 0, maxAvgDraft = 0;
        System.out.println("How many students' record do you want to store?");
        size = inp.nextInt();

        Student stds[] = new Student[size];
        for(int i = 0; i < stds.length; i++)
		{
            stds[i] = new Student();

            System.out.println("Id of student "+(i+1)+"?");
            stds[i].setId(inp.nextInt());
			inp.nextLine();

            System.out.println("Name of student "+(i+1)+"? ");
            stds[i].setName(inp.nextLine());

            System.out.println("How Many Courses?");
            int courseSize = inp.nextInt();
            int marks[] = new int[courseSize];
            for(int j = 0; j < marks.length; j++)
			{
                System.out.print("Enter the marks of course "+(j+1)+": ");
                marks[j] = inp.nextInt();
            }
            stds[i].setMarks(marks);
            
			int avgMarks=0;
            for(int j = 0; j < (stds[i].getMarks()).length; j++)
			{
                avgMarks += (stds[i].getMarks())[j];
            }
            avgMarks = avgMarks/(stds[i].getMarks()).length;
            stds[i].setAvg(avgMarks);
            
			if(avgMarks > maxAvgDraft)
			{
                maxAvgDraft = avgMarks;
                indexOfMaxAvg = i;
            }
        }

        for (int i = 0; i < stds.length; i++)
		{
            if(stds[i] == null)
			{
                continue;
            }
            
			System.out.println("Details Of Student "+(i+1));

            System.out.print("Id = "+ stds[i].getId()+ ", ");
            System.out.print("Name = "+ stds[i].getName()+ ", ");

            System.out.print("Marks = [");
            for(int m = 0; m < (stds[i].getMarks()).length; m++)
			{
                System.out.print((stds[i].getMarks())[m]+", ");
            }
            System.out.print("], ");
            System.out.print("Avg = "+stds[i].getAvg()+"");
            System.out.println("");
            System.out.println("");
        }

            System.out.println("Highest Avg Student is "+ stds[indexOfMaxAvg].getName());
            System.out.println("Highest Avg is "+ stds[indexOfMaxAvg].getAvg());

    }
}
class Student
{
    int id;
    String name;
    int marks[];
	float avg;
    
    void setId(int id)
	{
        this.id = id;
    }
    void setName(String name)
	{
        this.name = name;
    }
	void setMarks(int[] marks)
	{
        this.marks = marks;
    }
	void setAvg(float avg)
	{
        this.avg = avg;
    }
    
	int getId()
	{
        return id;
    }
	String getName()
	{
        return name;
    }
	int[] getMarks()
	{
        return marks;
    }
    float getAvg()
	{
        return avg;
    }
}