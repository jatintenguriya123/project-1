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
public class DoctorPojo {
    String userId, doctorId, qualification, specialist;
    char active;

    public String getUserId() {
        return userId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getQualification() {
        return qualification;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public void setActive(char active) {
        this.active = active;
    }

    public String getSpecialist() {
        return specialist;
    }

    public char getActive() {
        return active;
    }
}
