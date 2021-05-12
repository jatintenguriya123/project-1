/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPojo;

import java.sql.Date;

/**
 *
 * @author Akki
 */
public class PatientPojo {
String opd, doctor_id, f_name , s_name, p_id, gender, m_status, address, city, mno;
Date date;
int age;

    public PatientPojo(String opd, String doctor_id, String f_name, String s_name, String p_id, String gender, String m_status, String address, String city, String mno, Date date, int age) {
        this.opd = opd;
        this.doctor_id = doctor_id;
        this.f_name = f_name;
        this.s_name = s_name;
        this.p_id = p_id;
        this.gender = gender;
        this.m_status = m_status;
        this.address = address;
        this.city = city;
        this.mno = mno;
        this.date = date;
        this.age = age;
    }

    public PatientPojo() {
   }





    public void setP_id(String p_id) {
        this.p_id = p_id;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOpd(String opd) {
        this.opd = opd;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setM_status(String m_status) {
        this.m_status = m_status;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getP_id() {
        return p_id;
    }

    public String getF_name() {
        return f_name;
    }

    public String getS_name() {
        return s_name;
    }

    public int getAge() {
        return age;
    }

    public String getOpd() {
        return opd;
    }

    public String getGender() {
        return gender;
    }

    public String getM_status() {
        return m_status;
    }

    public Date getDate() {
        System.out.println(date);
        return date;
        
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getMno() {
        return mno;
    }

    public String getDoctor_id() {
        return doctor_id;
    }


    
}
