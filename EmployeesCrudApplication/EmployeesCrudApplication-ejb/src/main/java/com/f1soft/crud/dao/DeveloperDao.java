/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.dao;

import com.f1soft.crud.entity.Developer;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 *
 * @author shreejit
 */
@Named
@ApplicationScoped
public class DeveloperDao {
    @PersistenceContext(unitName = "employeeCrudApplication")
    private EntityManager entityManager;
    
    @Transactional(Transactional.TxType.REQUIRED)
    public Developer saveDeveloper(Developer developer){
        try {
            entityManager.persist(developer);
            //printMethod();
        } catch (Exception e) {
            throw e;
        }
        return developer;
    }
    
    private void printMethod() {
        String str = null;
        System.out.println(str.charAt(0));
    }
    
    @Transactional
    public Developer updateDeveloper(Developer developer) throws Exception {
        try {
            entityManager.merge(developer);
            return developer;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @Transactional
    public void deleteDeveloper(int id) throws Exception {
        try {
            System.out.println("id : " + id);
            Query q = entityManager.createQuery("SELECT d FROM DEVELOPER d WHERE d.id = :id");
            q.setParameter("id", id);
            entityManager.remove(entityManager.merge(q.getSingleResult()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public List<Developer> getAllDeveloper() {
        Query q = entityManager.createQuery("SELECT d FROM DEVELOPER d");
        return (List<Developer>) q.getResultList();
    }
    
    
    
    public List<Developer> getAllDeveloperFromDepartment() {
        Query q = entityManager.createQuery("SELECT e FROM DEVELOPER e where e.department.name = ICM");
        return (List<Developer>) q.getResultList();
    }

    public Developer getDeveloperById(int id) {
        Query q = entityManager.createQuery("SELECT e FROM DEVELOPER e where e.id = :id");
        q.setParameter("id", id);
        return (Developer) q.getSingleResult();
    }
    
   
}
