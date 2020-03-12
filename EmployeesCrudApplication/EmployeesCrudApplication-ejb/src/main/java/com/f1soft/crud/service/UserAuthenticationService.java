/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.service;

import com.f1soft.crud.dao.UserAuthenticationDao;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

/**
 *
 * @author shreejit
 */
@ApplicationScoped
public class UserAuthenticationService {
    
    @Inject
    UserAuthenticationDao userAuthenticationDao;

    public Response authenticateUser(String username) {
        return userAuthenticationDao.checkAuthenticity(username);
    }
    
}
