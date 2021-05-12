/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDao;

import UserPojo.EmpPojo;
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
public class EmpDao {
    public static String getNewId() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement s = conn.createStatement(); //ye kya krti
        ResultSet rs = s.executeQuery("select max(empid) from employees");
        int id =1;
        rs.next();
        String empid = rs.getString(1);
        System.out.println(empid);
        int eno = Integer.parseInt(empid.substring(1));
        id = id + eno;
        String st = "E" + id;
        System.out.println(st);
        return st;
        
        
    }
    public static boolean addEmployee(EmpPojo emp) throws SQLException { // pojo as a argument kyu
        //System.out.println("g");
        Connection conn = DBConnection.getConnection(); // har bar ku establish krna+
        String qry = "insert into employees values (?,?,?,?,'n')";
        PreparedStatement ps;
        ps = conn.prepareStatement(qry); //preparestatement or createstatement mei farak
        System.out.println("g");
        ps.setString(1, emp.getEmpid());
        ps.setString(2, emp.getEmpname());
        ps.setDouble(4, emp.getSal());
        ps.setString(3, emp.getJob());
        
        int x = ps.executeUpdate();
        return x == 1;
        
    }
    public static boolean updateEmployee (EmpPojo emp ) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String qry = "update employees set empname = ? , role = ? , sal = ? where empid = ? ";
        PreparedStatement ps ;
        ps = conn.prepareStatement(qry);
        ps.setString(4, emp.getEmpid());
        ps.setString(1, emp.getEmpname());
        ps.setDouble(3, emp.getSal());
        ps.setString(2, emp.getJob());
        int x = ps.executeUpdate();
        return x ==1;
    }
    public static HashMap<String , String > getNonRegisteredReceptionistList() throws SQLException {
        Connection conn = DBConnection.getConnection();
        String qry = "Select empid, empname from employees where role = 'RECEPTIONIST'  and empid not in (select empid from users where usertype = 'RECEPTIONIST')";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(qry);
        HashMap <String, String > receptionist = new HashMap();
        while (rs.next()) {
            String id = rs.getString(1);
            String name = rs.getString(2);
            receptionist.put(id, name);
            
        }
        return receptionist;
    }
    public static HashMap<String , String > getNonRegisteredDoctorsList() throws SQLException{
        Connection conn = DBConnection.getConnection();
        String qry = "Select empid, empname from employees where role = 'DOCTOR'  and empid not in (select empid from users where usertype = 'DOCTOR')";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(qry);
        HashMap <String, String > doctor = new HashMap();
        while (rs.next()) {
            String id = rs.getString(1);
            String name = rs.getString(2);
            doctor.put(id, name);
            
        }
        return doctor;        
    }
    public static ArrayList <EmpPojo> getAllEmp() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("select * from employees");
        ArrayList<EmpPojo> empList = new ArrayList();
        while (rs.next()) {
            EmpPojo e = new EmpPojo();
            e.setEmpid(rs.getString(1));
            e.setEmpname(rs.getString(2));
            e.setJob(rs.getString(3));
            e.setSal(rs.getDouble(4));
            empList.add(e);
        }
        return empList;
        
                
    }
    public static ArrayList<EmpPojo> getAllRec () throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("select * from employees where role = 'RECEPTIONIST' ");
        ArrayList<EmpPojo> recList = new ArrayList();     
                while (rs.next()) {
            EmpPojo e = new EmpPojo();
            e.setEmpid(rs.getString(1));
            e.setEmpname(rs.getString(2));
            e.setJob(rs.getString(3));
            e.setSal(rs.getDouble(4));
            recList.add(e);
        }
        return recList;
    }
    


        public static boolean removeEmployee (String emp ) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps,pb;
        String qry = "delete from employees where empId = ?";
        String qry2 = "delete from users where empid = ?";
                pb = conn.prepareStatement(qry2);
               pb.setString (1, emp);
                pb.executeQuery();
        ps = conn.prepareStatement(qry);

        ps.setString (1, emp);
        int x = ps.executeUpdate();   
        return x == 1;
        
    }
        public static boolean removeReceptionist (String emp) throws SQLException {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps;
        String qry = "delete from employees where empId = ?";
        String qry2 = "delete from users where empid = ?";
                ps = conn.prepareStatement(qry2);
               ps.setString (1, emp);
                ps.executeQuery();
        ps = conn.prepareStatement(qry);

        ps.setString (1, emp);
        int x = ps.executeUpdate();   
        return x == 1;
        }
    
     public static HashMap <String, EmpPojo> getAllEmpList() throws SQLException {
         Connection conn = DBConnection.getConnection();
         String qry = "select * from employees";
         Statement st = conn.createStatement();
         ResultSet rs = st.executeQuery(qry);
         HashMap <String , EmpPojo> employee = new HashMap();
         EmpPojo e = new EmpPojo();
         while (rs.next()){
             String id = rs.getString(1);
             String name = rs.getString (2);
             String job = rs.getString (3);
             double sala = rs.getDouble(4);
             employee.put(id,e);
         }
         return employee;
     }
    public static HashMap<String, EmpPojo> getAllReceptionistList() throws SQLException {
            Connection conn = DBConnection.getConnection();
            String qry = "select * from employees where role = 'RECEPTIONIST'";
         Statement st = conn.createStatement();
         ResultSet rs = st.executeQuery(qry);
         HashMap <String , EmpPojo> receptionist = new HashMap();
         EmpPojo e = new EmpPojo();
         while (rs.next()){
             String id = rs.getString(1);
             String name = rs.getString (2);
             String job = rs.getString (3);
             double sala = rs.getDouble(4);
             receptionist.put(id,e); // ye kya krta 
         }
         return receptionist;            
    }
     
     public static EmpPojo getEmp(String id) throws SQLException {
          Connection conn = DBConnection.getConnection();
           String qry = "select * from employees where empId = ?";
           PreparedStatement ps;
           ps = conn.prepareStatement (qry);
           ps.setString (1, id);
           ResultSet rs = ps.executeQuery(); 
           EmpPojo e = new EmpPojo();
           rs.next();
           e.setEmpid(rs.getString(1));
           e.setEmpname(rs.getString(2));
           e.setJob(rs.getString(3));
           e.setSal(rs.getDouble(4));
           return e;
     }




}