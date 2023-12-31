package classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import classes.Homepage;
import classes.Main;
public class Login{
    public static JFrame frame;
    public static JPanel panel, top_panel;
    public static JLabel ulabel, plabel, topLabel;
    private static JButton buttonSI, buttonSU, buttonE;
    private static JTextField utextfield;
    private static JPasswordField passfield;
    private Homepage homepage;
    private SignUpFrame SignUpFrame;
    private Main main;

    public Login (Main main){
        this.main= main;
        frame = new JFrame("LCBank");
        panel = new JPanel(){
        @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the background image
                ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/Login.png"));
                // Draw the image on the panel
                g.drawImage(imageIcon.getImage(), 0, 0, null);
            }
        };
        frame.setSize(670, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        topLabel = new JLabel();
        top_panel = new JPanel();
        topLabel.setBackground(new Color(0, 138, 208));
        topLabel.setForeground(new Color(192, 192, 192));
        topLabel.setFont(new Font("Script MT Bold", Font.PLAIN, 30));
        topLabel.setIcon(new ImageIcon(Login.class.getResource("/images/ibank.png")));
        topLabel.setText("Welcome to Liberty City Bank");
        topLabel.setHorizontalAlignment(JLabel.CENTER);
        topLabel.setOpaque(true);

        top_panel.setLayout(new BorderLayout());
        top_panel.setBounds(0, 0, 400, 150);
        top_panel.add(topLabel);
        frame.add(top_panel, BorderLayout.NORTH);

        panel.setLayout(null);

        ulabel = new JLabel("Username:");
        ulabel.setBounds(200, 130, 80, 25); // Centered within the panel
        ulabel.setForeground(Color.WHITE); // Set text color to white
        ulabel.setFont(new Font("Tahoma", Font.BOLD, 13)); // Change font and size
        panel.add(ulabel);

        utextfield = new JTextField();
        utextfield.setBounds(290, 130, 150, 25); // Centered within the panel
        panel.add(utextfield);

        plabel = new JLabel("Password:");
        plabel.setBounds(200, 190, 80, 25); // Centered within the panel
        plabel.setForeground(Color.WHITE); // Set text color to white
        plabel.setFont(new Font("Tahoma", Font.BOLD, 13)); // Change font and size
        panel.add(plabel);

        passfield = new JPasswordField();
        passfield.setBounds(290, 190, 150, 25); // Centered within the panel
        panel.add(passfield);

        buttonSI = new JButton("Sign In");
        buttonSI.setBounds(150, 250, 100, 35);
        buttonSI.setIcon(new ImageIcon(Login.class.getResource("/images/Sign In.png")));

        buttonSU = new JButton("Sign Up");
        buttonSU.setBounds(280, 250, 100, 35);
        
        buttonSI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == buttonSI) {
            String filePath = "classes/Users.txt";
            String enteredUsername = utextfield.getText();
            String enteredPassword = new String(passfield.getPassword());
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
                    frame.dispose();
                    homepage = new Homepage(Login.this,enteredUsername,enteredPassword);
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
        });
            buttonSI.setBackground(Color.LIGHT_GRAY);
            buttonSI.setBorder(BorderFactory.createEtchedBorder());
             buttonSU.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               SignUpFrame = new SignUpFrame(Login.this);
            }
        });
        buttonSU.setBackground(Color.LIGHT_GRAY);
        buttonSU.setBorder(BorderFactory.createEtchedBorder());
        buttonSU.setIcon(new ImageIcon(Login.class.getResource("/images/Sign Up.png")));

        buttonE = new JButton("Exit");
        buttonE.setBounds(410, 250, 100, 35); // Centered within the panel
        buttonE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        buttonE.setBackground(Color.LIGHT_GRAY);
        buttonE.setBorder(BorderFactory.createEtchedBorder());

        panel.add(buttonSI);
        panel.add(buttonSU);
        panel.add(buttonE);

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}



