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
public class User {

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", password=" + password + ", userType=" + userType + '}';
    }
    private String userId;
    private String password;
    private String userType;

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
         
}
