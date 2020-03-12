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
@Entity(name = "MANAGER")
@Table(name = "MANAGER_TABLE")
@DiscriminatorValue("Manager")
public class Manager extends Employee{
       
    
    @NotNull    
    private String manager_id;
    
    @NotNull
    private String managing_team;

    public String getManaging_team() {
        return managing_team;
    }

    public void setManaging_team(String managing_team) {
        this.managing_team = managing_team;
    }

   
    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    
}
