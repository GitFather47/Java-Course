package FlyUSA.controller.Admin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import FlyUSA.controller.Admin.Flight;
public class AdminFrame implements ActionListener{
	private   int p = 0;
	private   Flight[] flight = new Flight[100];
    private  JFrame frameAdmin;
    private  JPanel panelAdmin;
    private  JButton logOutButton; // Initialize panelAdmin here

     public void showAdminPanel() {
     	    frameAdmin= new JFrame();
     	    panelAdmin = new JPanel();
            frameAdmin.setTitle("Admin Panel");
            frameAdmin.setSize(350, 200);

            panelAdmin.setBackground(new Color(176,196,222));
            frameAdmin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose only this frame
            frameAdmin.setLocationRelativeTo(null);
            
            panelAdmin.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
            JButton buttonInstall = new JButton("Create Flight");
            buttonInstall.setAlignmentX(Component.CENTER_ALIGNMENT);
            buttonInstall.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    flight[p] = new Flight();
                    flight[p].flightInfo();
                }
            });
            buttonInstall.setPreferredSize(new Dimension(200, 50));
           
            panelAdmin.add(buttonInstall);


            JButton buttonShow = new JButton("Show all flights");
            buttonShow.setAlignmentX(Component.CENTER_ALIGNMENT);
            buttonShow.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                            flight[p] = new Flight();
                            flight[p].showFlightInfoToFile();
                    }
            });
             buttonShow.setPreferredSize(new Dimension(200, 50));
             panelAdmin.add(buttonShow);
             panelAdmin.add(Box.createVerticalGlue());
            logOutButton = new JButton("Log Out");
            logOutButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            logOutButton.setPreferredSize(new Dimension(100, 50));
            logOutButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frameAdmin.dispose();
                        }
                });
            panelAdmin.add(logOutButton);
            
            panelAdmin.add(Box.createVerticalStrut(20));
            frameAdmin.add(panelAdmin);
            frameAdmin.setResizable(false);
            frameAdmin.setVisible(true);
        }
@Override
    public void actionPerformed(ActionEvent e) {
    	//
    }
}