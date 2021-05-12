/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDao;

import UserPojo.DoctorPojo;
import UserPojo.UserPojo;
import hospitalmanagment.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Akki
 */
public class DoctorsDao {

    public static ArrayList<String> getAllDoctorsId() throws SQLException {
        ArrayList<String> docId = new ArrayList();
        ResultSet rs = DBConnection.getConnection().createStatement().executeQuery("select doctorid from doctors");
        
        while (rs.next()) {
            docId.add(rs.getString(1));
        }
        return docId;
    }
    public static boolean registerDoctor (UserPojo user )  throws SQLException{
                Connection conn = DBConnection.getConnection(); // har bar ku establish krna+
        String qry = "insert into users values (?,?,?,?,?)";
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
    public static boolean addDoctor (DoctorPojo doctor) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String qry = "insert into doctors values(?,?,?,?,'y')";
        PreparedStatement ps;
        ps = conn.prepareStatement(qry);
        ps.setString(1, doctor.getUserId());
        ps.setString(2,doctor.getDoctorId());
        ps.setString(3,doctor.getQualification());
        ps.setString(4,doctor.getSpecialist());
       
        int x = ps.executeUpdate();
        return x>0;
    }
     public static ArrayList <DoctorPojo> getAllDoc() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("select * from doctors");
        ArrayList<DoctorPojo> docList = new ArrayList();
        while (rs.next()) {
            DoctorPojo e = new DoctorPojo();
            e.setDoctorId(rs.getString(1));
            e.setQualification(rs.getString(2));
            e.setSpecialist(rs.getString(3));
            e.setUserId(rs.getString(4));
            docList.add(e);
        }
        return docList;
        
        
                
    }
     
         public static HashMap <String, DoctorPojo> getAllDocList() throws SQLException {
         Connection conn = DBConnection.getConnection();
         String qry = "select * from doctors";
         Statement st = conn.createStatement();
         ResultSet rs = st.executeQuery(qry);
         HashMap <String , DoctorPojo> doctor = new HashMap();
         DoctorPojo e = new DoctorPojo();
         while (rs.next()){
             String userid = rs.getString(1);
             String doctorid = rs.getString (2);
             String qualification = rs.getString (3);
             String specialist = rs.getString(4);
             
             doctor.put(userid,e);
         }
         return doctor;
     }

    public static boolean removeDoctor(String doc) throws SQLException {
        /*Connection conn = DBConnection.getConnection();
        PreparedStatement ps,pb, pc, pd, pe;
        String qry = "update doctors set active = 'n' where doctorid = ?";
        String qry1 = "select * from users where userId =?   ";
       // String qry2 = "select * from employees where empid = ?";
        String qry3 = "update users set active = 'n' where userid = ?";
        String qry4 = "update employees set active = 'n' where empid = ?";
        String qry5 = "select * from doctors where doctorId = ?";
        pc = conn.prepareStatement(qry);
        pc.setString(1,doc);
        int x = pc.executeUpdate();
        ps = conn.prepareStatement (qry5);
           ps.setString (1, doc);
           ResultSet rs = ps.executeQuery(); 
           rs.next();
           //String userId = rs.getString(1);
        pd = conn.prepareStatement(qry3);
        pd.setString(1,rs.getString(1));
        int z = pd.executeUpdate();
        
           pb = conn.prepareStatement(qry1);
        pb.setString(1,rs.getString(1));
        ResultSet rm = pb.executeQuery();
        rm.next();
        //String empid = rm.getString(3);
        pe = conn.prepareStatement(qry4);
        pe.setString(1, rm.getString(3));
        int y = pe.executeUpdate();
      /*  pc = conn.prepareStatement(qry2);
        pc.setString(1,empid);
        ResultSet rn = pb.executeQuery();
        rn.next();
        String empid = rs.getString(3);
         return x == 1 & y ==1 & z ==1; 
        */
        
        Connection conn = DBConnection.getConnection();
        String qry4 = "select empid from users where userid = ?";
        String qry3 = "update employees set active = 'n' where empid = ?";
        String qry2 = "update users set active = 'n' where userid = ?";
        String qry  = "update doctors set active = 'n' where userid = ?";
        PreparedStatement ps;
        ps = conn.prepareStatement(qry4);
        ps.setString(1, doc);
        ResultSet rs = ps.executeQuery();
        rs.next();
        System.out.println(rs.getString(1));
        ps = conn.prepareStatement(qry3);
        ps.setString(1,rs.getString(1));
        ps.executeUpdate();
        ps = conn.prepareStatement(qry2);
        ps.setString(1,doc);
        ps.executeUpdate();
        ps = conn.prepareStatement(qry);
        ps.setString(1,doc);
        int x = ps.executeUpdate();
        return x ==1;
           
              

   
    }
    
}
