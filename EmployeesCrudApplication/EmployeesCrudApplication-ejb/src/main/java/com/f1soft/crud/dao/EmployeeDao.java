/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.dao;

import com.f1soft.crud.entity.Employee;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


@Named
@ApplicationScoped
public class EmployeeDao implements Serializable{

    @PersistenceContext(unitName = "employeeCrudApplication")
    private EntityManager entityManager;
    
   @Transactional(Transactional.TxType.REQUIRED)
    public Employee saveEmployee(Employee employee){
        try {
            entityManager.persist(employee);
            //printMethod();
        } catch (Exception e) {
            throw e;
        }
        return employee;
    }
    
    private void printMethod() {
        String str = null;
        System.out.println(str.charAt(0));
    }
    
    @Transactional
    public Employee updateEmployee(Employee employee) throws Exception {
        try {
            entityManager.merge(employee);
            return employee;
        } catch (Exception e) {

            System.out.println(e);
            return null;
        }
    }

    @Transactional
    public void deleteEmployee(int id) throws Exception {
        try {
            System.out.println("id : " + id);
            Query q = entityManager.createQuery("SELECT e FROM EMPLOYEE e WHERE e.id = :id");
            q.setParameter("id", id);

            entityManager.remove(entityManager.merge(q.getSingleResult()));
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public List<Employee> getAllEmployees() {
        Query q = entityManager.createQuery("SELECT e FROM EMPLOYEE e");
        return (List<Employee>) q.getResultList();
    }
    
    
    public Employee getEmployeeById(int id) {
        Query q = entityManager.createQuery("SELECT e FROM EMPLOYEE e where e.id = :id");
        q.setParameter("id", id);
        return (Employee) q.getSingleResult();
    }
    
   
}
