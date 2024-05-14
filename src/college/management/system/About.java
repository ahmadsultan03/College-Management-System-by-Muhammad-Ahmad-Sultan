/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad Ahmad Sultan
 */
package college.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 840);
        setLocation(350, 5);
        getContentPane().setBackground(Color.WHITE);
        
        // Top left logo
        ImageIcon logo1 = new ImageIcon(ClassLoader.getSystemResource("icons/nustlogo.png"));
        Image logo1Scaled = logo1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon logo1Icon = new ImageIcon(logo1Scaled);
        JLabel logo1Label = new JLabel(logo1Icon);
        logo1Label.setBounds(10, 10, 100, 100);
        add(logo1Label);

        // Top right logo
        ImageIcon logo2 = new ImageIcon(ClassLoader.getSystemResource("icons/mcs.png"));
        Image logo2Scaled = logo2.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon logo2Icon = new ImageIcon(logo2Scaled);
        JLabel logo2Label = new JLabel(logo2Icon);
        logo2Label.setBounds(580, 10, 100, 100);
        add(logo2Label);

        // Main heading
        JLabel heading = new JLabel("<html><div style='text-align: center;'>Miltary College of Signals<br/>Department of Software Engineering</div></html>");
        heading.setBounds(100, 0, 500, 250);
        heading.setFont(new Font("serif", Font.BOLD|Font.ITALIC, 32));
        heading.setForeground(Color.RED);
        add(heading);
        
         // Second heading
        JLabel heading_ = new JLabel("<html><div style='text-align: center;'>Student Management System</div></html>");
        heading_.setBounds(120, 100, 500, 200);
        heading_.setFont(new Font("sansserif", Font.BOLD, 34));
        heading_.setForeground(Color.BLUE);
        add(heading_);
        
        // Developer name
        JLabel name = new JLabel("<html><div style='text-align: center;'>Developed By:<br/>MUHAMMAD AHMAD SULTAN</div></html>");
        name.setBounds(140, 230, 500, 80);
        name.setFont(new Font("Tahoma", Font.BOLD|Font.ITALIC, 28));
        name.setForeground(Color.BLACK);
        add(name);
        
        // Developer picture
        ImageIcon devPic = new ImageIcon(ClassLoader.getSystemResource("icons/myPic.png"));
        Image devPicScaled = devPic.getImage().getScaledInstance(220, 220, Image.SCALE_DEFAULT);
        ImageIcon devPicIcon = new ImageIcon(devPicScaled);
        JLabel devPicLabel = new JLabel(devPicIcon);
        devPicLabel.setBounds(250, 320, 220, 220);
        add(devPicLabel);
        
        // CMS ID Number
        JLabel rollno = new JLabel("<html><div style='text-align: center;'>CMS ID # : 408709</div></html>");
        rollno.setBounds(250, 520, 500, 80);
        rollno.setFont(new Font("Tahoma", Font.BOLD|Font.ITALIC, 22));
        rollno.setForeground(Color.DARK_GRAY);
        add(rollno);
        
        // Batch
        JLabel batch = new JLabel("<html><div style='text-align: center;'> Batch: BESE-28 (C) </div></html>");
        batch.setBounds(250, 550, 500, 80);
        batch.setFont(new Font("Tahoma", Font.BOLD|Font.ITALIC, 22));
        batch.setForeground(Color. ORANGE);
        add(batch);
        
        // Contact details
        JLabel contact = new JLabel("<html><div style='text-align: center;'>Contact Info <br/>Email : m.ahmadsultan123mas@gmail.com<br/>Phone :+92 306 1611301</div></html>");
        contact.setBounds(140, 600, 500, 100);
        contact.setFont(new Font("Tahoma", Font.ITALIC, 22));
        contact.setForeground(Color.BLACK);
        add(contact);
        
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}

