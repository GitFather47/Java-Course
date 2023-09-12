import java.util.Scanner;

class User implements IFeature {
    private String username;
    private String password;

    public void install(){}
    public void show(){}
    public void passengerInfo(){}

    public void avail() {
        System.out.println("Username : "+username);
    }

    public boolean checkAdmin() {
        boolean flag = true;

        System.out.println("\t\t\t1.Username\n\t\t\t");
        Scanner input = new Scanner(System.in);
        username = input.nextLine();

        System.out.println("2.Password:");
        password = input.nextLine();

        if (username.equals("admin")) {
            if (password.equals("admin")) {
                System.out.println("Access granted.");
            } else {
                System.out.println("Wrong password.");
                flag = false;
            }
        } else {
            System.out.println("Wrong username.");
            flag = false;
        }
        return flag;
    }

    public boolean checkUser() {
        boolean flag = true;

        System.out.println("\t\t\t1.Username\n\t\t\t");
        Scanner input = new Scanner(System.in);
        username = input.nextLine();

        System.out.println("2.Password:");
        password = input.nextLine();

        // Replace the following condition with your predefined username and password for regular users
        if (username.equals("user") && password.equals("user")) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Invalid username or password.");
            flag = false;
        }

        return flag;
    }
}
