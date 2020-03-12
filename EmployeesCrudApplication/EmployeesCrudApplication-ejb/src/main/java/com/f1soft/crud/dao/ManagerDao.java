/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.dao;

import com.f1soft.crud.entity.Manager;
import java.io.Serializable;
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
public class ManagerDao implements Serializable{
    
    @PersistenceContext(unitName = "employeeCrudApplication")
    private EntityManager entityManager;
    
    @Transactional(Transactional.TxType.REQUIRED)
    public Manager saveManager(Manager manager){
        try {
            entityManager.persist(manager);
        //            printMethod();
        } catch (Exception e) {
            throw e;
        }
        return manager;
    }
    
    private void printMethod() {
        String str = null;
        System.out.println(str.charAt(0));
    }
    
    @Transactional
    public Manager updateManager(Manager manager) throws Exception {
        try {
            entityManager.merge(manager);
            return manager;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @Transactional
    public void deleteManager(int id) throws Exception {
        try {
            System.out.println("id : " + id);
            Query q = entityManager.createQuery("SELECT e FROM MANAGER e WHERE e.id = :id");
            q.setParameter("id", id);
            entityManager.remove(entityManager.merge(q.getSingleResult()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public List<Manager> getAllManagers() {
        Query q = entityManager.createQuery("SELECT e FROM MANAGER e");
        return (List<Manager>) q.getResultList();
    }
    
    
    public List<Manager> getAllManagersFromDepartment() {
        Query q = entityManager.createQuery("SELECT e FROM MANAGER e where e.department.name = ICM");
        return (List<Manager>) q.getResultList();
    }

    public Manager getManagerById(int id) {
        Query q = entityManager.createQuery("SELECT e FROM MANAGER e where e.id = :id");
        q.setParameter("id", id);
        return (Manager) q.getSingleResult();
    }
    
   
}
