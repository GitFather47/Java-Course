package FlyUSA.controller.User;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User extends JFrame implements ActionListener {
    private String username;
    private String password;
    private JTextField userText; // Add member variable for JTextField
    private JPasswordField passwordText; // Add member variable for JPasswordField
    private JFrame frameAd; // Add member variable for JFrame
    public int flag = 0; // Move the flag array to a member variable

    public void adminTitle() {
        JPanel panelAd = new JPanel();
        frameAd = new JFrame(); // Initialize the frameAd member variable
        frameAd.setTitle("Reserve deez nuts");
        frameAd.setSize(350, 200);
        frameAd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameAd.setLocationRelativeTo(null);
        frameAd.add(panelAd);
        panelAd.setLayout(null);

        JLabel userLabel = new JLabel("1.Username");
        userLabel.setBounds(10, 20, 80, 25);
        panelAd.add(userLabel);
        userText = new JTextField(); // Initialize the userText member variable
        userText.setBounds(100, 20, 165, 25);
        panelAd.add(userText);
        JLabel passwordLabel = new JLabel("2.Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panelAd.add(passwordLabel);
        passwordText = new JPasswordField(); // Initialize the passwordText member variable
        passwordText.setBounds(100, 50, 165, 25);
        panelAd.add(passwordText);

        JButton login = new JButton("Login");
        login.setBounds(10, 80, 80, 25);
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if ((userText.getText()).equals("admin")) {
                    if ((passwordText.getText()).equals("admin")) {
                        frameAd.dispose();
                        JOptionPane.showMessageDialog(null, "Access granted.");
                        flag = 1;
                        frameAd.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong password. Try again");
                        flag = 0; // Modify the flag using the array
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong username.");
                    flag = 0; // Modify the flag using the array
                }
                if (flag == 0) {
                    frameAd.dispose(); // Close the login frame
                }
                System.out.println("Button clicked!");
            }
        }); // Use "this" as the ActionListener
        panelAd.add(login);
        frameAd.setVisible(true);
    }

    public void show() {}

    public void passengerInfo() {}

    public void avail() {
        System.out.println("Username: " + username);
    }

    public int checkAdmin() {
        System.out.println(flag);
        return flag;
    }

    public int checkUser() {
        //boolean flag = true;

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
            //flag = false;
        }

        return flag;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // This code will be executed when the button is clicked
    }
    
    // You can add some code here if needed.
}
