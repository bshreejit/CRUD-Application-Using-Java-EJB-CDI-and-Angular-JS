/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.entity;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author shreejit
 */
@Entity(name = "DEVELOPER")
@Table(name="DEVELOPER_TABLE")
@DiscriminatorValue("Developer")
public class Developer extends Employee{
    
    @NotNull
    private String developer_id;
    
    @NotNull
    private String developing_team;

    public String getDeveloper_id() {
        return developer_id;
    }

    public void setDeveloper_id(String developer_id) {
        this.developer_id = developer_id;
    }

    @Override
    public String toString() {
        return "Developer{" + "developer_id=" + developer_id + ", developing_team=" + developing_team + '}';
    }

    public String getDeveloping_team() {
        return developing_team;
    }

    public void setDeveloping_team(String developing_team) {
        this.developing_team = developing_team;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
   
    
}
