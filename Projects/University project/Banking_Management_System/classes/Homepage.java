package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import classes.Login;

abstract class Methods{
      protected static String getTotalInfo(String username) {
            String fileName = "classes/Total.txt";
            String userInfo = "";
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                boolean found = false;
                while ((line = br.readLine()) != null) {
                    if (line.startsWith("User: " + username)) {
                        found = true;
                        userInfo = line + "\n"; // Adding the User line to the userInfo
                        for (int i = 0; i < 5; i++) {
                            userInfo += br.readLine() + "\n"; // Adding the next 5 lines
                        }
                        break;
                    }
                }
                if (!found) {
                    userInfo = "User not found!";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return userInfo;
        }
    protected String getValueAfterColon(String line) {
        return line.substring(line.indexOf(':') + 1).trim();
    }

     protected DefaultTableModel parseAccData() {
                DefaultTableModel model1 = new DefaultTableModel();
                model1.addColumn("Acc");
                model1.addColumn("MICR NO");
                model1.addColumn("Acc_Type");
                model1.addColumn("Name");
                model1.addColumn("Gender");
                model1.addColumn("Mobile");
                model1.addColumn("Address");
                
                String filePath ="classes/Bank.txt";
                   
                       try {
                        FileReader reader = new FileReader(filePath);
                        BufferedReader br = new BufferedReader(reader);
                        String line;// To store flight information
                        String[] accInfo = new String[8];
                        while ((line = br.readLine()) != null) {
                            if (line.equals("----------------------------")) {
                                model1.addRow(accInfo); // Add the data to the table
                                accInfo = new String[7]; // Reset the flightInfo array
                            } else {
                                String[] parts = line.split(":");
                                if (parts.length == 2) {
                                    String columnName = parts[0];
                                    String columnValue = parts[1];
                                    switch (columnName) {
                                        case "Acc":
                                            accInfo[0] = columnValue;
                                            break;
                                        case "MICR_NO":
                                            accInfo[1] = columnValue;
                                            break;
                                        case "Acc_Type":
                                            accInfo[2] = columnValue;
                                            break;
                                        case "Name":
                                            accInfo[3] = columnValue;
                                            break;
                                        case "Gender":
                                            accInfo[4] = columnValue;
                                            break;
                                        case "Mobile":
                                            accInfo[5] = columnValue;
                                        case "Address":
                                            accInfo[6]=columnValue;
                                            break;
                                    }
                                }
                            }
                        }
                        br.close();
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            
                    return model1;
            }

     protected DefaultTableModel parseTransactionData() {
                DefaultTableModel model2 = new DefaultTableModel();
                model2.addColumn("Transcation Date");
                model2.addColumn("Transcation type");
                model2.addColumn("Amount(USD)");
                
                String filePath ="classes/Transaction.txt";
                   
                       try {
                        FileReader reader = new FileReader(filePath);
                        BufferedReader br = new BufferedReader(reader);
                        String line;// To store flight information
                        String[] accInfo = new String[4];
                        while ((line = br.readLine()) != null) {
                            if (line.equals("----------------------------------------")) {
                                model2.addRow(accInfo); // Add the data to the table
                                accInfo = new String[3]; // Reset the flightInfo array
                            } else {
                                String[] parts = line.split(":");
                                if (parts.length == 2) {
                                    String columnName = parts[0];
                                    String columnValue = parts[1];
                                    switch (columnName) {
                                        case "Transcation Date ":
                                            accInfo[0] = columnValue;
                                            break;
                                        case "Transcation type ":
                                            accInfo[1] = columnValue;
                                            break;
                                        case "Amount(USD)     ":
                                            accInfo[2] = columnValue;
                                            break;
                                    }
                                }
                            }
                        }
                        br.close();
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            
                    return model2;
            }






       protected JPanel showAccInfoToFile(JFrame frame) {
        DefaultTableModel model1 = parseAccData();
        JTable table1 = new JTable(model1);
        JScrollPane scrollPane = new JScrollPane(table1);

        scrollPane.setPreferredSize(new Dimension(600, 360));  

        table1.setBackground(new Color(144, 238, 144));
        scrollPane.getViewport().setBackground(new Color(176, 196, 222));

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        backButton.setPreferredSize(new Dimension(100, 30));
        backButton.setBackground(Color.LIGHT_GRAY);
        backButton.setBorder(BorderFactory.createEtchedBorder());

        JButton removeButton = new JButton("Remove");
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table1.getSelectedRow();
                if (selectedRow != -1) {
                    // Remove the selected row from the table model
                    model1.removeRow(selectedRow);

                    JOptionPane.showMessageDialog(null, "Selected Account removed successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Please select an account to remove.");
                }
            }
        });
        removeButton.setPreferredSize(new Dimension(100, 30));
        removeButton.setBackground(Color.LIGHT_GRAY);
        removeButton.setBorder(BorderFactory.createEtchedBorder());
        removeButton.setIcon(new ImageIcon(Homepage.class.getResource("/images/remove.png")));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(backButton);
        buttonPanel.add(removeButton);

        JPanel accountListPanel = new JPanel(new BorderLayout());
        accountListPanel.add(scrollPane, BorderLayout.CENTER);
        accountListPanel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(accountListPanel);
        frame.pack();
        frame.setVisible(true);
        return accountListPanel;
    }

    protected JPanel showTransactionFile(JFrame frame) {
        DefaultTableModel model2 = parseTransactionData();
        JTable table2 = new JTable(model2);
        JScrollPane scrollPane = new JScrollPane(table2);

        scrollPane.setPreferredSize(new Dimension(600, 360));  

        table2.setBackground(new Color(144, 238, 144));
        scrollPane.getViewport().setBackground(new Color(176, 196, 222));

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        backButton.setPreferredSize(new Dimension(100, 30));
        backButton.setBackground(Color.LIGHT_GRAY);
        backButton.setBorder(BorderFactory.createEtchedBorder());

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(backButton);

        JPanel transactionListPanel = new JPanel(new BorderLayout());
        transactionListPanel.add(scrollPane, BorderLayout.CENTER);
        transactionListPanel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(transactionListPanel);
        frame.pack();
        frame.setVisible(true);
        return transactionListPanel;
    }
}

public class Homepage extends Methods{
    private DefaultTableModel model = new DefaultTableModel();
    private JTable table1 = new JTable(model);
    private JTable table2 = new JTable(model);
    private String username,password;
    public JFrame frame; 
    private Login login;
    
    public Homepage(Login login,String username ,String password){
        this.login = login;
        this.username=username;
        this.password=password;
        frame = new JFrame("LCBank Homepage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 800);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(0,0,204)); // Set your desired background color
        topPanel.setLayout(new BorderLayout());

        topPanel.setPreferredSize(new Dimension(550, 50));


        JLabel marqueeLabel = new JLabel("Thank You for Banking with us.LCBank,the bank you can trust");
        marqueeLabel.setFont(new Font("Eurostile Extended", Font.BOLD, 18)); // Set your desired font
        marqueeLabel.setForeground(Color.WHITE); // Set your desired text color

        // Add the marquee label to the top panel
        topPanel.add(marqueeLabel, BorderLayout.CENTER);

        // Use a Timer to update the text position at regular intervals
        Timer timer = new Timer(50, new ActionListener() {
            int xPos = 500; // Initial x-position outside the panel

            public void actionPerformed(ActionEvent e) {
                xPos--; // Adjust the x-position for leftward movement
                marqueeLabel.setBounds(xPos, 0, 800, 50); // Set label position and size

                // Check if the label has moved completely out of the panel's bounds
                if (xPos + marqueeLabel.getWidth() == 0) {
                    xPos = topPanel.getWidth(); // Reset x-position to the panel width
                }
            }
        });
        timer.start(); // Start the timer for the marquee animation
         
        mainPanel.add(topPanel, BorderLayout.NORTH);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBackground(Color.BLACK);
        tabbedPane.setForeground(Color.WHITE);
        String userInfo = getTotalInfo(username);

        JPanel depositPanel = new JPanel(){
        @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the background image
                ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/HomePage.png"));
                // Draw the image on the panel
                g.drawImage(imageIcon.getImage(), 0, 0, null);
            }
        };
        depositPanel.add(new JLabel("Deposit"));
        depositPanel.setLayout(null);
        depositPanel.setPreferredSize(new Dimension(600, 400));

        JLabel userLabel = new JLabel("User:");
        userLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        userLabel.setForeground(Color.WHITE);
        userLabel.setBounds(147, 32, 116, 22);


        JTextField userField = new JTextField();
        userField.setEditable(false);
        userField.setColumns(10);
        userField.setBounds(303, 32, 179, 23);
        depositPanel.add(userLabel);
        depositPanel.add(userField);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Segoe UI",  Font.BOLD, 14));
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setBounds(147, 78, 116, 22);
        JTextField nameField = new JTextField();
        nameField.setEditable(false);
        nameField.setColumns(10);
        nameField.setBounds(303, 78, 179, 23);
        depositPanel.add(nameLabel);
        depositPanel.add(nameField);

        JLabel accountNoLabel = new JLabel("Account No:");
        accountNoLabel.setForeground(Color.WHITE);
        accountNoLabel.setFont(new Font("Segoe UI",  Font.BOLD, 14));
        accountNoLabel.setBounds(147, 123, 116, 22);
        JTextField accountNoField = new JTextField();
        accountNoField.setEditable(false);
        accountNoField.setColumns(10);
        accountNoField.setBounds(303, 123, 179, 23);
        depositPanel.add(accountNoLabel);
        depositPanel.add(accountNoField);

        JLabel accountBalanceLabel = new JLabel("Available Balance:");
        accountBalanceLabel.setForeground(Color.WHITE);
        accountBalanceLabel.setFont(new Font("Segoe UI",  Font.BOLD, 14));
        accountBalanceLabel.setBounds(147, 169, 159, 22);
        JTextField accountBalanceField = new JTextField();
        accountBalanceField.setEditable(false);
        accountBalanceField.setColumns(10);
        accountBalanceField.setBounds(303, 169, 179, 23);
        depositPanel.add(accountBalanceLabel);
        depositPanel.add(accountBalanceField);

        JLabel depositAmountLabel = new JLabel("Deposit Amount:");
        depositAmountLabel.setForeground(Color.WHITE);
        depositAmountLabel.setFont(new Font("Segoe UI",  Font.BOLD, 14));
        depositAmountLabel.setBounds(147, 213, 159, 22);
        JTextField depositAmountField = new JTextField();
        depositAmountField.setColumns(10);
        depositAmountField.setBounds(303, 213, 179, 23);



        JLabel depositTotal = new JLabel("Total");
        depositTotal.setForeground(Color.WHITE);
        depositTotal.setFont(new Font("Segoe UI",  Font.BOLD, 14));
        depositTotal.setBounds(147, 260, 116, 22);
        depositPanel.add(depositTotal);

        JTextField totalTextField = new JTextField();
        totalTextField.setEditable(false);
        totalTextField.setColumns(10);
        totalTextField.setBounds(303, 260, 179, 23);
        depositPanel.add(totalTextField);


        depositPanel.add(depositAmountLabel);
        depositPanel.add(depositAmountField);


        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(147, 307, 150, 30);
        depositButton.setIcon(new ImageIcon(Homepage.class.getResource("/images/deposit.png")));
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform deposit action here
                // Example: Retrieve values from fields and perform deposit
                String s1 = accountBalanceField.getText();
                String s2 = depositAmountField.getText();
                    
                int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
                String total = String.valueOf(sum);
                accountBalanceField.setText(total);
                totalTextField.setText(total);
                 
                // Perform the deposit operation or any other logic
                // For example, display a message for demonstration
                JOptionPane.showMessageDialog(frame, "Deposit of $" + s2 + "successful");
            }
        });
        depositButton.setBackground(Color.LIGHT_GRAY);
        depositButton.setBorder(BorderFactory.createEtchedBorder());
        depositPanel.add(depositButton);


        JPanel withdrawPanel = new JPanel(){
        @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the background image
                ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/HomePage.png"));

                // Draw the image on the panel
                g.drawImage(imageIcon.getImage(), 0, 0, null);
            }
        };
        withdrawPanel.add(new JLabel("Withdraw"));
        withdrawPanel.setLayout(null);
        
        
        JLabel withdrawUserLabel = new JLabel("User");
        withdrawUserLabel.setForeground(Color.WHITE);
        withdrawUserLabel.setFont(new Font("Segoe UI",  Font.BOLD, 14));
        withdrawUserLabel.setBounds(147, 32, 116, 22);
        withdrawPanel.add(withdrawUserLabel);
        
        JLabel withdrawNameLabel = new JLabel("Name");
        withdrawNameLabel.setForeground(Color.WHITE);
        withdrawNameLabel.setFont(new Font("Segoe UI",  Font.BOLD, 14));
        withdrawNameLabel.setBounds(147, 78, 116, 22);
        withdrawPanel.add(withdrawNameLabel);
        
        JLabel withdrawAccountNoLabel = new JLabel("Account No. ");
        withdrawAccountNoLabel.setForeground(Color.WHITE);
        withdrawAccountNoLabel.setFont(new Font("Segoe UI",  Font.BOLD, 14));
        withdrawAccountNoLabel.setBounds(147, 123, 116, 22);
        withdrawPanel.add(withdrawAccountNoLabel);
        
        JLabel withdrawAvailableBalanceLabel = new JLabel("Available Balance");
        withdrawAvailableBalanceLabel.setForeground(Color.WHITE);
        withdrawAvailableBalanceLabel.setFont(new Font("Segoe UI",  Font.BOLD, 14));
        withdrawAvailableBalanceLabel.setBounds(147, 169, 159, 22);
        withdrawPanel.add(withdrawAvailableBalanceLabel);
        
        JLabel withdrawAmount = new JLabel(" Withdraw Amount ");
        withdrawAmount.setForeground(Color.WHITE);
        withdrawAmount.setFont(new Font("Segoe UI",  Font.BOLD, 14));
        withdrawAmount.setBounds(147, 213, 159, 22);
        withdrawPanel.add(withdrawAmount);
        
        JLabel withdrawTotal = new JLabel("Total");
        withdrawTotal.setForeground(Color.WHITE);
        withdrawTotal.setFont(new Font("Segoe UI",  Font.BOLD, 14));
        withdrawTotal.setBounds(147, 260, 116, 22);
        withdrawPanel.add(withdrawTotal);
        
        JTextField textField_User = new JTextField();
        textField_User.setEditable(false);
        textField_User.setBounds(303, 32, 179, 23);
        withdrawPanel.add(textField_User);
        textField_User.setColumns(10);
        
        JTextField textField_Name = new JTextField();
        textField_Name.setEditable(false);
        textField_Name.setColumns(10);
        textField_Name.setBounds(303, 78, 179, 23);
        withdrawPanel.add(textField_Name);
        
        JTextField textField_AccNo = new JTextField();
        textField_AccNo.setEditable(false);
        textField_AccNo.setColumns(10);
        textField_AccNo.setBounds(303, 123, 179, 23);
        withdrawPanel.add(textField_AccNo);
        
        JTextField textField_AvailBalance = new JTextField();
        textField_AvailBalance.setEditable(false);
        textField_AvailBalance.setColumns(10);
        textField_AvailBalance.setBounds(303, 169, 179, 23);
        withdrawPanel.add(textField_AvailBalance);
        
        JTextField textField_Amount = new JTextField();
        textField_Amount.setColumns(10);
        textField_Amount.setBounds(303, 213, 179, 23);
        withdrawPanel.add(textField_Amount);
        
        JTextField textField_Total = new JTextField();
        textField_Total.setEditable(false);
        textField_Total.setColumns(10);
        textField_Total.setBounds(303, 260, 179, 23);
        withdrawPanel.add(textField_Total);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(147, 307, 150, 30);
        withdrawButton.setIcon(new ImageIcon(Homepage.class.getResource("/images/withdraw.png")));
        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform deposit action here
                // Example: Retrieve values from fields and perform deposit
                String s1 = textField_AvailBalance.getText();
                String s2 = textField_Amount.getText();
                    
                int sub = Integer.parseInt(s1) - Integer.parseInt(s2);
                String total = String.valueOf(sub);
                textField_AvailBalance.setText(total);
                textField_Total.setText(total);

                // Perform the deposit operation or any other logic
                // For example, display a message for demonstration
                JOptionPane.showMessageDialog(frame, "withdrawal of $" + s2 + " successful");
            }
        });
        withdrawButton.setBackground(Color.LIGHT_GRAY);
        withdrawButton.setBorder(BorderFactory.createEtchedBorder());
        withdrawPanel.add(withdrawButton);





       if (!userInfo.equals("User not found!")) {
       String[] lines = userInfo.split("\n");

        // Ensure each line exists and process them to extract information after the colon
        for (String line : lines) {
            if (line.startsWith("User:")) {
                userField.setText(getValueAfterColon(line));
                textField_User.setText(getValueAfterColon(line));
            } else if (line.startsWith("Name:")) {
                nameField.setText(getValueAfterColon(line));
                textField_Name.setText(getValueAfterColon(line));
            } else if (line.startsWith("Account No:")) {
                accountNoField.setText(getValueAfterColon(line));
                textField_AccNo.setText(getValueAfterColon(line));
            } else if (line.startsWith("Available Balance(USD):")) {
                accountBalanceField.setText(getValueAfterColon(line));
                textField_AvailBalance.setText(getValueAfterColon(line));
            } else if (line.startsWith("Amount:")) {
                depositAmountField.setText(getValueAfterColon(line));
                textField_Amount.setText(getValueAfterColon(line));
            } else if (line.startsWith("Total:")) {
                totalTextField.setText(getValueAfterColon(line));
                textField_Total.setText(getValueAfterColon(line));
            }
        }
    } else {
        userField.setText(userInfo); // If user not found, display the message in the userField
    }


        JPanel contactPanel = new JPanel(){
        @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the background image
                ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/HomePage.png"));
                // Draw the image on the panel
                g.drawImage(imageIcon.getImage(), 0, 0, null);
            }
        };
        JLabel contactLabel = new JLabel("<html><body style='width: 300px;'>Website: https://www.libertybank.net/personal-banking/<br>" +
                "Phone:<br>" +
                "General Inquiries: (800) 555-BANK (2265)<br>" +
                "Lost or Stolen Cards:<br>" +
                "Credit Cards: (800) 325-3678<br>" +
                "Debit Cards: (800) 528-2273<br>" +
                "Credit Card Customer Service: (800) 423-7503<br>" +
                "Mortgage Inquiries: (800) 555-MORT (6678)<br>" +
                "Email: libertyCity@outlook.com<br>" +
                "Branches:<br>" +
                "Find your nearest branch using our branch locator: <a href='https://www.liberty-bank.com/utility/find-a-branch'>Branch Locator</a><br>" +
                "Social Media:<br>" +
                "Follow us on Facebook: <a href='https://www.facebook.com/libertybank.ge/?locale=ka_GE'>Facebook</a><br>" +
                "Follow us on Twitter: <a href='https://www.instagram.com/libertybankandtrust/?hl=en'>Twitter</a><br>" +
                "Additional Resources:<br>" +
                "FAQs: <a href='https://www.libertybank.net/accounts/online-banking-registration/'>FAQs</a><br>"+
                "If you suspect fraud, contact us immediately.</body></html>");
        contactLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
        contactLabel.setForeground(Color.WHITE);
        contactPanel.add(new JLabel("Contact Us"));
        contactPanel.add(contactLabel);

        JPanel profilePanel = new JPanel(){
        @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the background image
                ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/HomePage.png"));
                // Draw the image on the panel
                g.drawImage(imageIcon.getImage(), 0, 0, null);
            }
        };
        profilePanel.add(new JLabel("Profile"));
        ImageIcon profilePic;
        if(username.equals("Arnob") && password.equals("7476")){
            profilePic = new ImageIcon(getClass().getResource("/images/arnob.png")); // Make sure the path is correct
        }
        else{
            profilePic = new ImageIcon(getClass().getResource("/images/other.png"));
        }

        JLabel imageLabel = new JLabel(profilePic);
        imageLabel.setBounds(315, 113, 250, 176);
        profilePanel.add(imageLabel);
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setFont(new Font("Arial Black",  Font.BOLD, 14));
        usernameLabel.setBounds(47, 213, 100, 22);
        profilePanel.add(usernameLabel);
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setFont(new Font("Arial Black",  Font.BOLD, 14));
        passwordLabel.setBounds(47, 260, 100, 22);
        profilePanel.add(passwordLabel);
        JTextField usernameTextField = new JTextField();
        usernameTextField.setBounds(153, 213, 116, 23);
        usernameTextField.setText(username); // Set the text
        usernameTextField.setEditable(false); // Make it non-editable
        profilePanel.add(usernameTextField);

        JTextField passwordTextField = new JTextField();
        passwordTextField.setBounds(153, 260, 116, 23);
        passwordTextField.setText(password); // Set the text
        passwordTextField.setEditable(false);
        profilePanel.add(passwordTextField);
        profilePanel.setLayout(null);

        JPanel accountListPanel = showAccInfoToFile(frame);
        accountListPanel.add(new JLabel("Account List"));


        JPanel transactionPanel = showTransactionFile(frame);
        transactionPanel.add(new JLabel("Transaction"));


        
        
        tabbedPane.addTab("Deposit", depositPanel);
        tabbedPane.addTab("Withdraw", withdrawPanel);
        tabbedPane.addTab("Contact Us", contactPanel);
        tabbedPane.addTab("Profile", profilePanel);
        tabbedPane.addTab("Account List", accountListPanel);
        tabbedPane.addTab("Transaction", transactionPanel);
        mainPanel.add(tabbedPane, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    

    } 



}
