/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.service;

import com.f1soft.crud.dao.DeveloperDao;
import com.f1soft.crud.entity.Developer;
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
public class DeveloperService implements Serializable{
    
    @Inject
    private DeveloperDao developerDao;
    
    public Developer addDeveloper(Developer developer){
        developerDao.saveDeveloper(developer);
        return developer;
    }

    public List<Developer> getAllDevelopers() {
        return developerDao.getAllDeveloper();
    }

    public Developer updateDeveloper(Developer developer) throws Exception {
        return developerDao.updateDeveloper(developer);
    }

    public void deleteDeveloper(int id) throws Exception {
        developerDao.deleteDeveloper(id);
    }

    public Developer getDeveloperById(int id) {
        return developerDao.getDeveloperById(id);
    }
  
}
