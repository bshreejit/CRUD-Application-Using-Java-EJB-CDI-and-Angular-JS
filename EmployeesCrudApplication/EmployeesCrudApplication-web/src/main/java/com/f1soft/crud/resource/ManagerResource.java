/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.resource;

import com.f1soft.crud.entity.Manager;
import com.f1soft.crud.service.ManagerService;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author shreejit
 */
@Path("managercrud")
@ApplicationScoped
public class ManagerResource implements Serializable{

    @Inject
    private ManagerService managerService;
        
    @POST
    @Path("savemanager")
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional(Transactional.TxType.REQUIRED)
    public Response addManager(Manager manager) {
        manager.setCreateDate(new Date());
        return Response.ok(managerService.addManager(manager)).build();
    }
    
    @Path("getallmanagers")
    @GET
    public List<Manager> getAllManagers() {
        return managerService.getAllManagers();
    }
    
    @PUT
    @Path("updatemanager/{id}")
    public Manager updateManager(@PathParam("id") int id, Manager manager) throws  Exception{
        manager.setCreateDate(new Date());
        //        manager.setId(id);
        return managerService.updateManager(manager);
    }
    

    @DELETE
    @Path("delete/{mId}")
    public void deleteManager(@PathParam("mId") int id) throws Exception {
        managerService.deleteManager(id);
    }

    @GET
    @Path("/{mId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Manager getManager(@PathParam("mId") int id) {
        return managerService.getManagerById(id);
    }
  
}
