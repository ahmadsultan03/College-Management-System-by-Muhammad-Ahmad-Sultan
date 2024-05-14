
package college.management.system;

/**
 *
 * @author Muhammad  Ahmad Sultan
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {

    Project() {
        setSize(1300, 700);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Nust.png"));
        Image i2 = i1.getImage().getScaledInstance(1300, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
      JMenuBar mb = new JMenuBar();
      mb.setBackground(Color.LIGHT_GRAY);
        
        // New Information
        JMenu newInformation = new JMenu("New Info");
        newInformation.setForeground(Color.BLUE);
        newInformation.setFont(new Font("sansserif", Font.BOLD, 16));
        mb.add(newInformation);
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        facultyInfo.setFont(new Font("sansserif", Font.PLAIN, 16));
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        studentInfo.setFont(new Font("sansserif", Font.PLAIN, 16));
        newInformation.add(studentInfo);
        
        // Details
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLACK);
        details.setFont(new Font("sansserif", Font.BOLD, 16));
        mb.add(details);
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        facultydetails.setFont(new Font("sansserif", Font.PLAIN, 16));
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        studentdetails.setFont(new Font("sansserif", Font.PLAIN, 16));
        details.add(studentdetails);
        
        // Leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        leave.setFont(new Font("sansserif", Font.BOLD, 16));
        mb.add(leave);
        
        JMenuItem facultyleave = new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        facultyleave.setFont(new Font("sansserif", Font.PLAIN, 16));
        leave.add(facultyleave);
        
        JMenuItem studentleave = new JMenuItem("Student Leave");
        studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
        studentleave.setFont(new Font("sansserif", Font.PLAIN, 16));
        leave.add(studentleave);
        
        // Leave Details
        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.BLACK);
        leaveDetails.setFont(new Font("sansserif", Font.BOLD, 16));
        mb.add(leaveDetails);
        
        JMenuItem facultyleavedetails = new JMenuItem("Faculty Leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        facultyleavedetails.setFont(new Font("sansserif", Font.PLAIN, 16));
        leaveDetails.add(facultyleavedetails);
        
        JMenuItem studentleavedetails = new JMenuItem("Student Leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        studentleavedetails.addActionListener(this);
        studentleavedetails.setFont(new Font("sansserif", Font.PLAIN, 16));
        leaveDetails.add(studentleavedetails);
        
        // Exams
        JMenu exam = new JMenu("Exams Details");
        exam.setForeground(Color.BLUE);
        exam.setFont(new Font("sansserif", Font.BOLD, 16));
        mb.add(exam);
        
        JMenuItem examinationdetails = new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.WHITE);
        examinationdetails.addActionListener(this);
        examinationdetails.setFont(new Font("sansserif", Font.PLAIN, 16));
        exam.add(examinationdetails);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        entermarks.setFont(new Font("sansserif", Font.PLAIN, 16));
        exam.add(entermarks);
        
        // UpdateInfo
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.BLACK);
        updateInfo.setFont(new Font("sansserif", Font.BOLD, 16));
        mb.add(updateInfo);
        
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updatefacultyinfo.setFont(new Font("sansserif", Font.PLAIN, 16));
        updateInfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updatestudentinfo .setFont(new Font("sansserif", Font.PLAIN, 16));
        updateInfo.add(updatestudentinfo);
        
        // fee
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        fee.setFont(new Font("sansserif", Font.BOLD, 16));
        mb.add(fee);
        
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        feestructure .setFont(new Font("sansserif", Font.PLAIN, 16));
        fee.add(feestructure);
        
        JMenuItem feeform = new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        feeform .setFont(new Font("sansserif", Font.PLAIN, 16));
        fee.add(feeform);
        
        // Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLACK);
        utility.setFont(new Font("sansserif", Font.BOLD, 16));
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        notepad .setFont(new Font("sansserif", Font.PLAIN, 16));
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        calc.setFont(new Font("sansserif", Font.PLAIN, 16));
        utility.add(calc);
        
        // about
        JMenu about = new JMenu("About");
        about.setForeground(Color.MAGENTA);
        about.setFont(new Font("sansserif", Font.BOLD|Font.ITALIC, 16));
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        ab.setFont(new Font("sansserif", Font.PLAIN, 16));
        about.add(ab);
        
        // exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        exit.setFont(new Font("sansserif", Font.BOLD, 16));
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        ex.setFont(new Font("sansserif", Font.PLAIN, 16));
        exit.add(ex);
        
        setJMenuBar(mb);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        
        if (msg.equals("Exit")) {
            setVisible(false);
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                
            }
        } else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                
            }
        } else if (msg.equals("New Faculty Information")) {
            new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        } else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
        } else if (msg.equals("Faculty Leave")) {
            new TeacherLeave();
        } else if (msg.equals("Student Leave")) {
            new StudentLeave();
        } else if (msg.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        } else if (msg.equals("Student Leave Details")) {
            new StudentLeaveDetails();
        } else if (msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        } else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        } else if (msg.equals("Examination Results")) {
            new ExaminationDetails();
        } else if (msg.equals("Fee Structure")) {
            new FeeStructure();
        } else if (msg.equals("About")) {
            new About();
        } else if (msg.equals("Student Fee Form")) {
            new StudentFeeForm();
        }
    }

    public static void main(String[] args) {
        new Project();
    }
}

