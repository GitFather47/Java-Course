package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
 class SignUpFrame{
     
    String acc,
    micr,
    acc_Type,
    gender,
    address,
    name,
    mobile;

     public static JFrame frame;
     public static JPanel panel;
     public static JLabel nameLabel,
     accLabel,
     micrLabel,
     genderLabel,
     acc_TypeLabel,
     mobileLabel,
     addressLabel;
     public static JTextField nameTextField,
     accTextField,
     micrTextField,
     acc_TypeTextField,
     addressTextField,
     mobileTextField;
     public static JComboBox<String> genderComboBox;
     private Login login;


     
     public SignUpFrame(Login login) {
        this.login=login;
        frame = new JFrame("Sign Up");
        frame.setSize(600, 590);
        frame.setResizable(false);
        panel = new JPanel();
        //panel.setIcon(new ImageIcon(SignUpFrame.class.getResource("/images/tree.png")));
        panel.setLayout(null);
        //panel.setPreferredSize(new Dimension(600, 400));

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/tree.png")); // Make sure the path is correct
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(10, 10, 200, 527); // Adjust the bounds as needed

        // Existing code...
        // Adjust the bounds of other components accordingly to accommodate the image

        panel.add(imageLabel);


        panel.setBackground(new Color(0,153,153));
        frame.setLocationRelativeTo(null);
        accLabel = new JLabel("Account");
        accLabel.setBounds(247, 32, 116, 22);
        accTextField = new JTextField(12);
        accTextField.setBounds(373, 32, 179, 23);
        
        micrLabel = new JLabel("MICR_NO");
        micrLabel.setBounds(247, 78, 116, 22);
        micrTextField = new JTextField(12);
        micrTextField.setBounds(373, 78, 179, 23);
        
        acc_TypeLabel = new JLabel("Account Type");
        acc_TypeLabel.setBounds(247, 123, 116, 22);
        acc_TypeTextField = new JTextField();
        acc_TypeTextField.setBounds(373, 123, 179, 23);
        
        nameLabel = new JLabel("Name");
        nameLabel.setBounds(247, 169, 116, 22);
        nameTextField = new JTextField(12);
        nameTextField.setBounds(373, 169, 179, 23);
        
        genderLabel = new JLabel("Gender");
        genderLabel.setBounds(247, 213, 116, 22);
        String[] genderOptions = {"Male", "Female", "Other"};
        genderComboBox = new JComboBox<>(genderOptions);
        genderComboBox.setBounds(373, 213, 179, 23);

        mobileLabel = new JLabel("Mobile");
        mobileLabel.setBounds(247, 259,116, 22);
        mobileTextField= new JTextField(12);
        mobileTextField.setBounds(373, 259, 179, 23);
        
        addressLabel = new JLabel("Address");
        addressLabel.setBounds(247, 303,116, 22);
        addressTextField = new JTextField(12);
        addressTextField.setBounds(373, 303, 179, 23);
      
      
        
        

        JButton createButton = new JButton("Create");
        createButton.setBounds(247, 353, 100, 30);
        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name=nameTextField.getText();
                acc = accTextField.getText();
                micr = micrTextField.getText();
                String gender = (String) genderComboBox.getSelectedItem();
                address = addressTextField.getText();
                acc_Type =acc_TypeTextField.getText();
                mobile=mobileTextField.getText();
                createFile();
                frame.dispose(); // Close the window after saving

            }
        });

        JLabel bankMotto1 = new JLabel("LCBank");
        bankMotto1.setBounds(247, 443, 100, 35);
        JLabel bankMotto2 = new JLabel("Bank smart. Bank local. Bank well.");
        bankMotto2.setBounds(247, 493, 350, 35);
        bankMotto1.setFont(new Font("Segoe UI",  Font.BOLD, 16));
        bankMotto2.setFont(new Font("Script MT Bold",  Font.PLAIN, 14));
        panel.add(accLabel);
        panel.add(accTextField);
        panel.add(micrLabel);
        panel.add(micrTextField);
        panel.add(acc_TypeLabel);
        panel.add(acc_TypeTextField);
        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(genderLabel);
        panel.add(genderComboBox);
        panel.add(mobileLabel);
        panel.add(mobileTextField);
        panel.add(addressLabel);
        panel.add(addressTextField);
        panel.add(createButton);
        panel.add(bankMotto1);
        panel.add(bankMotto2);
        frame.add(panel);
        frame.setVisible(true);


     }

     public void createFile() {
      FileWriter writer;
       String filePath ="classes/Bank.txt";
      try {
          writer = new FileWriter(filePath, true); // Append mode
          writer.write("Acc: " + acc + "\n");
          writer.write("MICR_NO: " + micr + "\n");
          writer.write("Acc_Type: " + acc_Type + "\n");
          writer.write("Name: " + name + "\n");
          writer.write("Gender: " + gender + "\n");
          writer.write("Mobile: " + mobile + "\n");
          writer.write("Address: " + address + "\n");
          writer.write("----------------------------\n");
          writer.close();
          JOptionPane.showMessageDialog(null, "Account is created!");
      } catch (IOException io) {
          System.out.println("An error occurred while saving account information to file.");
          io.printStackTrace();//To know the erronous line
      }
  }

    }
