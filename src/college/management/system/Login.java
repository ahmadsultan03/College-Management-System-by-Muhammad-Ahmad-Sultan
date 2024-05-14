
package college.management.system;

/**
 *
 * @author Muhammad  Ahmad Sultan
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JButton login, cancel;
    JTextField username, password;
    
    Login () {
        
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 20);
        lblusername.setForeground(Color.WHITE);
        add(lblusername);
        
        username = new JTextField();
        username.setBounds(150, 20, 150, 20);
        add(username);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 20);
        lblpassword.setForeground(Color.WHITE);
        add(lblpassword);
        
        password = new JPasswordField();
        password.setBounds(150, 70, 150, 20);
        add(password);
        
        login = new JButton("Login");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.YELLOW);
        login.addActionListener(this);
        login.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(login);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(180, 140, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.RED);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);
        
        setSize(600, 300);
        setLocation(500, 250);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String username_ = this.username.getText();
            String password_ = this.password.getText();
            
            String query = "select * from login where username='"+username_+"' and password='"+password_+"'";
            
            try {
                dbConnectivity c = new dbConnectivity();
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()) {
                    setVisible(false);
                    new Project();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    setVisible(false);
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == cancel) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
