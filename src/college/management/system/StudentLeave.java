
package college.management.system;

/**
 *
 * @author Muhammad Ahmad Sultan
 */


import javax.swing.*;
import java.awt.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class StudentLeave extends JFrame implements ActionListener {

    Choice rollno_, time_;
    JDateChooser dcdate;
    JButton submit, cancel;
    
    StudentLeave() {
        
        setSize(500, 550);
        setLocation(550, 100);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("Apply Leave (Student)");
        heading.setBounds(40, 50, 300, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);
        
        JLabel lblrollno = new JLabel("Search by Roll Number");
        lblrollno.setBounds(60, 100, 200, 20);
        lblrollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblrollno);
        
        rollno_ = new Choice();
        rollno_.setBounds(60, 130, 200, 20);
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
        
        JLabel lbldate = new JLabel("Date");
        lbldate.setBounds(60, 180, 200, 20);
        lbldate.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lbldate);
        
        dcdate = new JDateChooser();
        dcdate.setBounds(60, 210, 200, 25);
        add(dcdate);
        
        JLabel lbltime = new JLabel("Time Duration");
        lbltime.setBounds(60, 260, 200, 20);
        lbltime.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lbltime);
        
        time_ = new Choice();
        time_.setBounds(60, 290, 200, 20);
        time_.add("Full Day");
        time_.add("Half Day");
        add(time_);
        
        submit = new JButton("Submit");
        submit.setBounds(60, 350, 100, 25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.CYAN);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(200, 350, 100, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.RED);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String rollno = rollno_.getSelectedItem();
            String date = ((JTextField) dcdate.getDateEditor().getUiComponent()).getText();
            String duration = time_.getSelectedItem();
            
            String query = "insert into studentleave values('"+rollno+"', '"+date+"', '"+duration+"')";
            
            try {
               dbConnectivity c = new dbConnectivity();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Leave Confirmed");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new StudentLeave();
    }
}
