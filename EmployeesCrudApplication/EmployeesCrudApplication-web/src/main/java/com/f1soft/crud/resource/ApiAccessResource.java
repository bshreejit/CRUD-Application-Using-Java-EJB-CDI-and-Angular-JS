/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.resource;

import com.f1soft.crud.dao.ApiAccessDetailsDao;
import com.f1soft.crud.entity.ApiAccessedDetails;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author shreejit
 */
@Path("accessDetails")
@ApplicationScoped
public class ApiAccessResource {
    
    @Inject 
    ApiAccessDetailsDao apiAccessDetailsDao;
    
    ApiAccessedDetails apiAccessedDetails;
    
    @GET
    @Path("author")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAuthorDetails() {
        System.out.println(apiAccessedDetails.getAccessedDate());
        return Response.ok().build();
         
    }
}
