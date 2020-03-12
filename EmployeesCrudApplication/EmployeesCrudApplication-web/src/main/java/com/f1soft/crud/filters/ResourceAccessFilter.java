/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.filters;

import com.f1soft.crud.dao.ApiAccessDetailsDao;
import java.io.IOException;
import java.net.URI;
import java.util.Date;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author shreejit
 */
@Provider
@PreMatching
public class ResourceAccessFilter implements ContainerRequestFilter{

    @Context
    UriInfo uriInfo;
    
        
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        
        Date date =new Date();
        URI myUri = uriInfo.getAbsolutePath();
        System.out.println(myUri + " :: Accessed at :: " + date);
//        ApiAccessDetailsDao apiAccessDetailsDao = new ApiAccessDetailsDao();
//        apiAccessDetailsDao.method(myUri, date);
    }
        
}
