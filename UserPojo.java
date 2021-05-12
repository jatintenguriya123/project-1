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
public class UserPojo {
    
    private String userid;
    private String password;
    private String userType;
    private String userName;
    private String empId;

    @Override
    public String toString() {
        return "UserPojo{" + "userid=" + userid + ", password=" + password + ", userType=" + userType + ", userName=" + userName + ", empId=" + empId + '}';
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmpId() {
        return empId;
    }
    
}
