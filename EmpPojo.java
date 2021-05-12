/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPojo;

/**
 *
 * @author Akki
 */
public class EmpPojo {
    private String empid, empname,job;
    private double sal;

    public String getEmpid() {
        return empid;
    }

    public String getEmpname() {
        return empname;
    }

    public String getJob() {
        return job;
    }

    public double getSal() {
        return sal;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    
}
