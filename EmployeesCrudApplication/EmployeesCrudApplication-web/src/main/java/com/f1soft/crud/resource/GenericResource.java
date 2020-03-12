/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.resource;

import com.f1soft.crud.entity.Employee;
import com.f1soft.crud.service.EmployeeService;
import java.io.Serializable;
import java.util.Date;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author shreejit
 */
@Path("employeecrud")
@ApplicationScoped
public class GenericResource implements Serializable{
    
    @Inject
    private EmployeeService employeeService;
        
    @POST
    @Path("saveemployee")
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional(Transactional.TxType.REQUIRED)
    public Response addEmployee(Employee employee) {
        employee.setCreateDate(new Date());
        return Response.ok(employeeService.addEmployee(employee)).build();
    }    
    
    @Path("getallemployees")
    @GET
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    
    @PUT
    @Path("updateemployee/{id}")
    public Employee updateEmployee(@PathParam("id") int id, Employee employee) throws  Exception{
        employee.setModifyDate(new Date());
        return employeeService.updateEmployee(employee);
    }
    

    @DELETE
    @Path("deleteemployee/{eId}")
    public void deleteEmployee(@PathParam("eId") int id) throws Exception {
        employeeService.deleteEmployee(id);
    }

    @GET
    @Path("getemployeebyid/{eId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("eId") int id) {
        return employeeService.getEmployeeById(id);
    }
}
