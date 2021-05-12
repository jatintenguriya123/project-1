/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient.dao;

import UserPojo.PatientPojo;
import hospitalmanagment.DBConnection;
import java.sql.Connection;
import java.sql.Date;
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
public class PatientDao {
    public static boolean addPatient(PatientPojo p ) throws SQLException {
        PreparedStatement ps = DBConnection.getConnection().prepareStatement("insert into patients values(?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, p.getP_id());
                ps.setString(2, p.getF_name());
                ps.setString(3, p.getS_name());
                ps.setInt(4, p.getAge());
                ps.setString(5, p.getOpd());
                ps.setString(6, p.getGender());
                ps.setString(7, p.getM_status());
                ps.setDate(8, p.getDate());
                ps.setString(9, p.getAddress());
                ps.setString(10, p.getCity());
                ps.setString(11, p.getMno());
                ps.setString(12, p.getDoctor_id());
                return (ps.executeUpdate()!= 0);
    }
    public static String getNewId() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select max(p_id) from patients");
        int id =1;
        if (rs.next()){
            String empid = rs.getString (1);
            System.out.println(empid.substring(1));
            int eno = Integer.parseInt(empid.substring(1));
            id = id+eno;
            String sr = "p" + id;
            return sr;
            
                    
        }
        else 
            return "P101";
    }
     public static ArrayList <PatientPojo> getAllPat() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("select * from patients");
        ArrayList<PatientPojo> patList = new ArrayList();
        while (rs.next()) {
            PatientPojo e = new PatientPojo();
            e.setP_id(rs.getString(1));
            e.setF_name(rs.getString(2));
            e.setS_name(rs.getString(3));
            e.setAge(rs.getInt(4));
            e.setOpd(rs.getString(5));
            e.setGender(rs.getString(6));
            e.setM_status(rs.getString(7));
            e.setDate(rs.getDate(8));
            e.setAddress(rs.getString(9));
            e.setCity(rs.getString(10));
            e.setMno(rs.getString(11));
            patList.add(e);
        }
        return patList;
        
        
                
    }   

    public static ArrayList<PatientPojo> getAllAppn(String userId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String qry = "select * from patients where doctor_id = ?";
        PreparedStatement ps;
        ps = conn.prepareStatement(qry);
        ps.setString(1, userId ); 
        ResultSet rs = ps.executeQuery(qry);
        ArrayList<PatientPojo>pat = new ArrayList();
        while(rs.next()){
            PatientPojo e = new PatientPojo();
            e.setP_id(rs.getString(1));
            e.setF_name(rs.getString(2));
            e.setOpd(rs.getString(3));
            pat.add(e);
        }
        return pat;
        
         
    
    }

    public static boolean removePat(String pid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String qry = "delete from patients where P_ID = ?";
        PreparedStatement ps;
        ps = conn.prepareStatement(qry);
        ps.setString(1, pid);
        int x = ps.executeUpdate();
        return x == 1;
    }
     public static boolean updatePatient(PatientPojo p) throws SQLException
  {
      Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update patients set f_name =?,s_name =?,age =?,OPD=?,gender=?,m_status =?,p_date =?,address = ?,city =?, phone_no = ? ,doctor_id =? where p_id =?");
        
        ps.setString(1,p.getF_name());
        ps.setString(2,p.getS_name());
        ps.setInt(3,p.getAge());
        ps.setString(4,p.getOpd());
        ps.setString(5,p.getGender());
        ps.setString(6,p.getM_status());
        ps.setDate(7,p.getDate());
        ps.setString(8,p.getAddress());
        ps.setString(9,p.getCity());
        ps.setString(10,p.getMno());
        ps.setString(11,p.getDoctor_id());
        ps.setString(12,p.getP_id());
        int x = ps.executeUpdate();
        
        return x==1;
  }
    public static HashMap<String, PatientPojo> getAllPatList() throws SQLException {
        Connection conn = DBConnection.getConnection();
         String qry = "select * from patients";
         Statement st = conn.createStatement();
         ResultSet rs = st.executeQuery(qry);
         HashMap <String , PatientPojo> doctor = new HashMap();
         PatientPojo e = new PatientPojo();
         while (rs.next()){
            String P_id = rs.getString(1);
            String F_name = rs.getString(2);
            String S_name = rs.getString(3);
            int Age = rs.getInt(4);
            String Opd = rs.getString(5);
            String Gender = rs.getString(6);
            String M_status = rs.getString(7);
            Date Date = rs.getDate(8);
            String Address = rs.getString(9);
            String City = rs.getString(10);
            String Mno = rs.getString(11);

             
             doctor.put(P_id,e);
         }
         return doctor;
    }

 public static PatientPojo allPatient(String pid)throws SQLException
 {
     Connection conn = DBConnection.getConnection();
        String qry = "select * from patients where P_id =?";
        PreparedStatement ps;
        ps = conn.prepareStatement(qry);
        ps.setString(1,pid);
        ResultSet rs = ps.executeQuery();
        PatientPojo pp = new PatientPojo();
        rs.next();
         pp.setP_id(rs.getString(1));
         pp.setF_name(rs.getString(2));
         pp.setS_name(rs.getString(3));
         pp.setAge(rs.getInt(4));
         pp.setOpd(rs.getString(5));
         pp.setGender(rs.getString(6));
         pp.setM_status(rs.getString(7));
         pp.setDate(rs.getDate(8));
         pp.setAddress(rs.getString(9));
         pp.setCity(rs.getString(10));
         pp.setMno(rs.getString(11));
         pp.setDoctor_id(rs.getString(12));
         
         
         
         return pp;
        
        
 }
            
}
