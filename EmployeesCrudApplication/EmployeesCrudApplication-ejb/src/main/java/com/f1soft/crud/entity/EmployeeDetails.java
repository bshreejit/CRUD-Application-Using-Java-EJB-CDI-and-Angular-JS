/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author shreejit
 */
@Embeddable
public class EmployeeDetails implements Serializable {
     
    @NotNull
    @Size(max = 100)
    private String fname;
    
    @Size(max = 100)
    private String mname;
    
    @Size(max = 100)
    @NotNull
    private String lname;
    
    //    @Email -----hibernate validator
    @Size(max = 100)
    private String email;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" + "fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", email=" + email + '}';
    }
    
}
