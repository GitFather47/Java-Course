/*A large company pays its salespeople on a commission basis. 
The salespeople each receive $200 per week plus 9% of their
 gross sales for that week. For example, a salesperson who sells 
 $5000 worth of chemicals in a week receives $200 plus 9% of $5000, 
 or a total of $650. Develop a program that uses a while statement to 
 input each salesperson's gross sales for last week and calculates and
  displays that salesperson earnings.
 */

/*
import java.util.Scanner;

class Salesperson {
    private double sales;
    private double earnings;

    public Salesperson(double sales) {
        this.sales = sales;
    }

    public void calculateEarnings() {
        earnings = 200 + (0.09 * sales);
    }

    public double getEarnings() {
        return earnings;
    }
}

class CommissionSalesperson extends Salesperson {
    public CommissionSalesperson(double sales) {
        super(sales);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scanner.nextInt();

        CommissionSalesperson[] salespeople = new CommissionSalesperson[numSalespeople];

        for (int i = 0; i < numSalespeople; i++) {
            System.out.print("Enter the gross sales for salesperson " + (i + 1) + ": $");
            double sales = scanner.nextDouble();

            salespeople[i] = new CommissionSalesperson(sales);
            salespeople[i].calculateEarnings();
        }

        System.out.println("\nEarnings for last week:");

        for (int i = 0; i < numSalespeople; i++) {
            System.out.println("Salesperson " + (i + 1) + ": $" + salespeople[i].getEarnings());
        }
    }
}
*/
import java.util.Scanner;
class SalesPerson{
    //Attributes
    private float grossSalary,earnings,totalEarnings;
    private float baseCommision=200f;
    private float extraCommission;
    private String name;
    private int ID;
    SalesPerson(){};
    public void setName(String name){
        this.name=name;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public void setEarnings(float grossSalary){
        earnings=grossSalary;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return ID;
    }
    public float getEarnings(){
        return totalEarnings;
    }
    public void calculateEarnings(){
        extraCommission = earnings * 0.09f;
        totalEarnings = earnings+ baseCommision+extraCommission;
    }

}
 class company extends SalesPerson{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String company = "Skynet";
        System.out.println("-----"+company.toUpperCase()+"-----");
        System.out.println("How many employes?");
        SalesPerson employee[] = new SalesPerson[input.nextInt()];
        int i=0; 
        while(i<employee.length){
            //INPUTSSSS

            System.out.println("Employee number "+ (i+1));
            System.out.print("Employee name:");
            input.nextLine();//Consume a newline character
            String name = input.nextLine();
            System.out.print("ID:");
            int id = input.nextInt();
            System.out.println("Salary?");

            //Object Creation and setter methods
            employee[i]=new SalesPerson();
            employee[i].setEarnings(input.nextFloat());
            employee[i].setName(name);
            employee[i].setID(id);
            i++;
        }
        System.out.println("-----"+company.toUpperCase()+"-----");
        //Using variable I doesn't work
        int j=0;
        while(j<employee.length){
            //SHOWING DETAILS!!!
            System.out.println("Employee number "+ (j+1));
            System.out.println("Name:"+employee[j].getName());
            System.out.println("ID:"+employee[j].getID());
            employee[j].calculateEarnings();
            System.out.println("Total earnings:$" + employee[j].getEarnings());
            System.out.print("\n");
            j++;
}
    }
 }