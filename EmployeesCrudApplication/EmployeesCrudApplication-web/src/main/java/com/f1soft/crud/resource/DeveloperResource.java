    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.resource;

import com.f1soft.crud.entity.Developer;
import com.f1soft.crud.service.DeveloperService;
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
@Path("developercrud")
@ApplicationScoped
public class DeveloperResource {

    @Inject
    private DeveloperService developerService;
        
    @POST
    @Path("savedeveloper")
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional(Transactional.TxType.REQUIRED) 
    public Response addDeveloper(Developer developer) {
        developer.setCreateDate(new Date());
        return Response.ok(developerService.addDeveloper(developer)).build();
    }
    
    
    @Path("getalldevelopers")
    @GET
    public List<Developer> getAllDevelopers() {
        return developerService.getAllDevelopers();
    }
    
    @PUT
    @Path("updatedeveloper/{id}")
    public Developer updateDeveloper(@PathParam("id") int id, Developer developer) throws  Exception{
        developer.setId(id);
        developer.setCreateDate(new Date());
        return developerService.updateDeveloper(developer);
    }
    

    @DELETE
    @Path("delete/{eId}")
    public void deleteDeveloper(@PathParam("eId") int id) throws Exception {
        developerService.deleteDeveloper(id);
    }

    @GET
    @Path("/{eId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Developer getDeveloper(@PathParam("eId") int id) {
        return developerService.getDeveloperById(id);
    }
    
}
