/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listestudents.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class dbconnect {
public static Connection Connect ()
{
Connection sos = null;
try{
    Class.forName ("com.mysql.jdbc.Driver");
    sos = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inzertf","root","");
        } catch (Exception e) {
            {
              JOptionPane. showMessageDialog (null ,e);
            }
        }
       return sos ;
}
}

  