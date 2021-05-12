/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDao;


import hospitalmanagment.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import UserPojo.User;
import java.sql.Statement;
import java.util.HashMap;
/**
 *
 * @author Akki
 */
public class UserDao {
    public static String validateUser(User usr)throws SQLException{
        try{
       // System.out.println(usr.getUserId());
       // System.out.println(usr.getPassword());
       // System.out.println(usr.getUserType());
         //               System.out.println("IDHAR HAI DIKKAT1");
        Connection conn = DBConnection.getConnection();
        String qry = "Select username from users where userid = ? and password = ? and usertype = ?";
       // System.out.println(usr);
        PreparedStatement ps = conn.prepareStatement(qry);
         //               System.out.println("IDHAR HAI DIKKAT2");
        ps.setString(1, usr.getUserId());
        ps.setString(2, usr.getPassword());
        ps.setString(3, usr.getUserType());
        ResultSet  rs = ps.executeQuery();
        String username = null;
        if (rs.next()) {
            username = rs.getString(1); //himtani
            
        }
        System.out.println(username);
        return username;
        
    }
            catch (SQLException e){
        return "";

}

}
    public static boolean changePassword (String userid, String pwd) throws SQLException {

        PreparedStatement ps = DBConnection.getConnection().prepareStatement("update users set password = ? where userid = ?");
        ps.setString(1,pwd);
        ps.setString(2,userid);
        return (ps.executeUpdate()!= 0);
    }
    public static HashMap<String, String> getReceptionistList() throws SQLException {
        HashMap <String , String > receptionistList = new HashMap<>();
        ResultSet rs = DBConnection.getConnection().createStatement().executeQuery("select userid, username from users where usertype = 'RECEPTIONIST' ");
        while (rs.next()){
        receptionistList.put(rs.getString(1), rs.getString(2));
        
    }
        return receptionistList;
    }   
}