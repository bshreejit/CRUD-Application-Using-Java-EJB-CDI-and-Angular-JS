/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.dao;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.ws.rs.core.Response;

/**
 *
 * @author shreejit
 */
@ApplicationScoped
@Named
public class UserAuthenticationDao {

    public Response checkAuthenticity(String username) {
        //Query
        
        return Response.ok().build();
    }
  
}
