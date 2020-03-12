/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.service;


import com.f1soft.crud.dao.EmployeeDao;
import com.f1soft.crud.entity.Employee;
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
public class EmployeeService implements Serializable{
    
    @Inject
    private EmployeeDao employeeDao;
    
    
    public Employee addEmployee(Employee employee){
        return employeeDao.saveEmployee(employee);
//        return employee;
    }


    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    public Employee updateEmployee(Employee employee) throws Exception {
        return employeeDao.updateEmployee(employee);
    }

    public void deleteEmployee(int id) throws Exception {
        employeeDao.deleteEmployee(id);
    }

    public Employee getEmployeeById(int id) {
        return employeeDao.getEmployeeById(id);
    }

    
}
