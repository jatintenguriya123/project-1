/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDao;

import UserPojo.UserPojo;
import hospitalmanagment.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Akki
 */
public class ReceptionistDao {
    public static boolean addReceptionist (UserPojo user )  throws SQLException{
                Connection conn = DBConnection.getConnection(); // har bar ku establish krna+
        String qry = "insert into users values (?,?,?,?,?,'n')";
        PreparedStatement ps;
        ps = conn.prepareStatement(qry); //preparestatement or createstatement mei farak
        //System.out.println("g");
        ps.setString(1, user.getUserid());
        ps.setString(2, user.getUserName());
        ps.setString(3, user.getEmpId());
        ps.setString(4, user.getPassword());
        ps.setString(5, user.getUserType());
        int x = ps.executeUpdate();
        return x >0;
    }  
    public static boolean removeReceptionist (UserPojo usr ) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps;
        String qry = "delete from users where userId(?)";
        ps = conn.prepareStatement(qry);
        int x = ps.executeUpdate();
        return x>0;
    }
    
}
