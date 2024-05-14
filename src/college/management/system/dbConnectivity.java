
package college.management.system;

/**
 *
 * @author Muhammad Ahmad Sultan
 */

import java.sql.*;

public class dbConnectivity {
    
    Connection c;
    Statement s;

    dbConnectivity () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegemanagementsystem","root","iyi@123789");
            s = c.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
