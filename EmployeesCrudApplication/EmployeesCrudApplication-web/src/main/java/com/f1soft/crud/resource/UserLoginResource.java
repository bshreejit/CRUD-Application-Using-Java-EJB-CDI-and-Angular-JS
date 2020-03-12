/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.resource;

import com.f1soft.crud.entity.Login;
import com.f1soft.crud.service.LoginService;
import java.util.Date;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author shreejit
 */
@Path("admin")
@ApplicationScoped
@Consumes(MediaType.APPLICATION_JSON)
public class UserLoginResource {

    @Inject
    private UserAuthentication userAuthentication;

   @Path("auth")
   public UserAuthentication UserAuthentication() {
     return userAuthentication;
   }   
    
}
  
