/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.service;

import com.f1soft.crud.dao.ManagerDao;
import com.f1soft.crud.entity.Manager;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author shreejit
 */
@Named
@ApplicationScoped
public class ManagerService implements Serializable{
    @Inject
    private ManagerDao managerDao;
    
    public Manager addManager(Manager manager){
        managerDao.saveManager(manager);
        return manager;
    }

    public List<Manager> getAllManagers() {
        return managerDao.getAllManagers();
    }

    public Manager updateManager(Manager manager) throws Exception {
        return managerDao.updateManager(manager);
    }

    public void deleteManager(int id) throws Exception {
        managerDao.deleteManager(id);
    }

    public Manager getManagerById(int id) {
        return managerDao.getManagerById(id);
    }
  
}
