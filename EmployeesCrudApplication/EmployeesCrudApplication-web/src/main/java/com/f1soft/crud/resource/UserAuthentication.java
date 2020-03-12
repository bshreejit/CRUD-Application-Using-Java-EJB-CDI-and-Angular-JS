/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.resource;

import com.f1soft.crud.service.UserAuthenticationService;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author shreejit
 */
@Named
@ApplicationScoped
@Consumes(MediaType.APPLICATION_JSON)
public class UserAuthentication {
    
    @Inject
    UserAuthenticationService userAuthenticationService;
    
    
    @Path("check")
    public Response checkUser(String username){
        return userAuthenticationService.authenticateUser(username);
    }
}
