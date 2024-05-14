/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college.management.system;

/**
 *
 * @author Muhammad Ahmad Sultan
 */


import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class EnterMarks extends JFrame implements ActionListener {

    Choice rollno_;
    JComboBox cbsemester;
    JTextField sub1_, sub2_,sub3_,sub4_,sub5_,marks1_,marks2_,marks3_,marks4_,marks5_;
    JButton cancel, submit;
    
    EnterMarks() {
        
        setSize(1000, 500);
        setLocation(300, 150);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/exam.png"));
        Image i2 = i1.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500, 40, 400, 300);
        add(image);
        
        JLabel heading = new JLabel("Enter Marks of Student");
        heading.setBounds(50, 0, 500, 50);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);
        
        JLabel lblrollnumber = new JLabel("Select Roll Number");
        lblrollnumber.setBounds(50, 70, 150, 20);
        add(lblrollnumber);
        
        rollno_ = new Choice();
        rollno_.setBounds(200, 70, 150, 20);
        add(rollno_);
        
        try {
            dbConnectivity c = new dbConnectivity();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()) {
                rollno_.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JLabel lblsemester = new JLabel("Select Semester");
        lblsemester.setBounds(50, 110, 150, 20);
        add(lblsemester);
        
        String semester[] = {"1st Semester", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester" };
        cbsemester = new JComboBox(semester);
        cbsemester.setBounds(200, 110, 150, 20);
        cbsemester.setBackground(Color.WHITE);
        add(cbsemester);
        
        JLabel lblentersubject = new JLabel("Enter Subject");
        lblentersubject.setBounds(100, 150, 200, 40);
        add(lblentersubject);
        
        JLabel lblentermarks = new JLabel("Enter Marks");
        lblentermarks.setBounds(320, 150, 200, 40);
        add(lblentermarks);
        
        sub1_ = new JTextField();
        sub1_.setBounds(50, 200, 200, 20);
        add(sub1_);
        
        sub2_ = new JTextField();
        sub2_.setBounds(50, 230, 200, 20);
        add(sub2_);
        
        sub3_ = new JTextField();
        sub3_.setBounds(50, 260, 200, 20);
        add(sub3_);
        
        sub4_ = new JTextField();
        sub4_.setBounds(50, 290, 200, 20);
        add(sub4_);
        
        sub5_ = new JTextField();
        sub5_.setBounds(50, 320, 200, 20);
        add(sub5_);
        
        marks1_ = new JTextField();
        marks1_.setBounds(250, 200, 200, 20);
        add(marks1_);
        
        marks2_ = new JTextField();
        marks2_.setBounds(250, 230, 200, 20);
        add(marks2_);
        
        marks3_ = new JTextField();
        marks3_.setBounds(250, 260, 200, 20);
        add(marks3_);
        
        marks4_ = new JTextField();
        marks4_.setBounds(250, 290, 200, 20);
        add(marks4_);
        
        marks5_ = new JTextField();
        marks5_.setBounds(250, 320, 200, 20);
        add(marks5_);
        
        submit = new JButton("Submit");
        submit.setBounds(70, 360, 150, 25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Back");
        cancel.setBounds(280, 360, 150, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            try {
                dbConnectivity c = new dbConnectivity();
                
                String query1 = "insert into subject values('"+rollno_.getSelectedItem()+"', '"+cbsemester.getSelectedItem()+"', '"+sub1_.getText()+"', '"+sub2_.getText()+"', '"+sub3_.getText()+"', '"+sub4_.getText()+"', '"+sub5_.getText()+"')";
                String query2 = "insert into marks values('"+rollno_.getSelectedItem()+"', '"+cbsemester.getSelectedItem()+"', '"+marks1_.getText()+"', '"+marks2_.getText()+"', '"+marks3_.getText()+"', '"+marks4_.getText()+"', '"+marks5_.getText()+"')";
            
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null, "Marks Added Sucessfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new EnterMarks();
    }
}

