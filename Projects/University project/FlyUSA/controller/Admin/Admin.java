package FlyUSA.controller.Admin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import FlyUSA.mainFrame.AppFrame;


public class Admin implements ActionListener {
    private JFrame frameAdminCheck;
    private JPanel panelAdminCheck;
    private JLabel adminNameLabel;
    private JTextField adminNameTextField;
    private JLabel passwordLabel;
    private JPasswordField passField;
    private JButton loginButton;
    private JButton backButton;
    private boolean LoggedIn;
    private AppFrame appFrame;
    private AdminFrame admin;

    public Admin(AppFrame appFrame) {
        this.appFrame = appFrame;
        admin = new AdminFrame();
        frameAdminCheck = new JFrame("Admin Verification");
        frameAdminCheck.setSize(350, 170);
        frameAdminCheck.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameAdminCheck.setLayout(new BorderLayout());
        frameAdminCheck.setLocationRelativeTo(null);
        frameAdminCheck.setResizable(false);

        panelAdminCheck = new JPanel();
        panelAdminCheck.setBackground(new Color(176,196,222)); // custom created color
        adminNameLabel = new JLabel("User name:");
        adminNameLabel.setForeground(Color.BLACK);
        adminNameLabel.setBounds(10, 60, 80, 25);
        

        adminNameTextField = new JTextField(20);
         adminNameTextField.setBackground(Color.WHITE);
        adminNameTextField.setForeground(Color.BLACK);
        adminNameTextField.setBounds(100, 60, 165, 25);
       
        passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.BLACK);
        passwordLabel.setBounds(10, 130, 80, 25);
        

        passField = new JPasswordField(20);
        passField.setBounds(100, 130, 165, 25);
        passField.setBackground(Color.WHITE);
        passField.setForeground(Color.BLACK);


        loginButton = new JButton("Login");
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginButton.setPreferredSize(new Dimension(100, 50));

        backButton = new JButton("Back");
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        backButton.setPreferredSize(new Dimension(100, 50));
        backButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frameAdminCheck.dispose();
                    }
            });

       
        panelAdminCheck.add(adminNameLabel);
        panelAdminCheck.add(adminNameTextField);

        
       
        panelAdminCheck.add(passwordLabel);
        panelAdminCheck.add(passField);
         
        panelAdminCheck.add(loginButton);
        panelAdminCheck.add(backButton);
        loginButton.addActionListener(this); 

        frameAdminCheck.add(panelAdminCheck);
        frameAdminCheck.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String filePath = "FlyUSA/controller/Admin/Admin.txt";
            String enteredUsername = adminNameTextField.getText();
            String enteredPassword = new String(passField.getPassword());
            BufferedReader reader = null;

            try {
                reader = new BufferedReader(new FileReader(filePath));
                String line;
                boolean loggedIn = false; // Keep track of whether login was successful
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(" ");
                    if (parts.length == 2) {
                        String username = parts[0].trim();
                        String password = parts[1].trim();
                        if (username.equals(enteredUsername) && password.equals(enteredPassword)) {
                            loggedIn = true;
                            break;
                        }
                    }
                }

                if (loggedIn) {
                    JOptionPane.showMessageDialog(null, "Access granted!");
                    frameAdminCheck.setVisible(false);
                    frameAdminCheck.dispose();
                    admin.showAdminPanel();
                    // Close the login window
                    // Create and show your main application window here
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }
}
