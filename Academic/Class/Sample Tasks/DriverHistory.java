/*Drivers are concerned with the mileage obtained by their automobiles. 
One driver has kept track of several trips by recording miles driven and
gallons used for each trip. Develop a class DriveHistory that uses a while 
statement to input the miles driven and gallons used for each trip. 
The program should calculate and display the miles per gallon obtained
for each trip.

My code has a problem: while statement and trip will start from the beginning 
despite of me adding trips before.
*/

import java.util.Scanner;

public class Driver {
    private String name;
    private int age;
    private String licenseNumber;
    private String vehicle;
    float mpg;

    public Driver(String name, int age, String vehicle, String licenseNumber) {
        this.name = name;
        this.age = age;
        this.vehicle = vehicle;
        this.licenseNumber = licenseNumber;
    }
    public void driverRecord() {
        System.out.println("Details of the driver -->");
        System.out.println("Name: " + name + "\nAge: " + age +"\nVehicle:" + vehicle + "\nLicense Number: " + licenseNumber);
        System.out.println("Average Miles per gallon for all trips: " + mpg);
    }

}

public class DriverHistory extends Driver {
    private float totalMilesDriven;
    private float totalGallons;
    
    public DriverHistory(String name, int age, String vehicle,String licenseNumber) {
        super(name, age,vehicle, licenseNumber);
        this.totalMilesDriven = 0.0f;
        this.totalGallons = 0.0f;
    }
    public void setTotalMilesDriven(float miles){
        totalMilesDriven+=miles;
    }
    public void setTotalGallons(float gallons){
        totalGallons+=gallons;
    }
    public void calculateTrip(int numOfTrips ) {
        Scanner input = new Scanner(System.in);
        int i =0 ;
        while(i < numOfTrips){
            System.out.println("Trip " + (i + 1) + ":");
            System.out.println("Miles: ");
            setTotalMilesDriven(input.nextFloat());

            System.out.println("Gallons: ");
            setTotalGallons(input.nextFloat());
            //totalGallons += input.nextFloat();
            i++;
        }
        mpg = totalMilesDriven / totalGallons;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----MURPHY USA----");

        // Setting attributes
        System.out.println("Name: ");
        String driverName = input.nextLine();

        System.out.println("Age: ");
        int driverAge = input.nextInt();

        System.out.println("Vehicle: ");
        input.nextLine();
        String driverVehicle = input.nextLine();

        System.out.println("License number: ");
        
        String driverLicense = input.nextLine();

        DriverHistory driver = new DriverHistory(driverName, driverAge,driverVehicle, driverLicense);

        System.out.println("Trips: ");
        int numOfTrips = input.nextInt();
        driver.calculateTrip(numOfTrips);
        driver.driverRecord();

        char response;
        do{
            System.out.println("Add more trips?(Y/N)");//Here is the problem.It will start from the beginning.
            response = input.next().charAt(0);
            if(response=='Y'|| response=='y'){
                System.out.println("How many?");
                numOfTrips+=input.nextInt();
                driver.calculateTrip(numOfTrips);
                driver.driverRecord();
                break;
            }
        }while(response=='Y'|| response=='y');

    }
}

