/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.resource;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author shreejit
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.f1soft.crud.exceptionmappers.GeneralExceptionMappers.class);
        resources.add(com.f1soft.crud.exceptionmappers.NotFoundExceptionMapper.class);
        resources.add(com.f1soft.crud.filters.ResourceAccessFilter.class);
        resources.add(com.f1soft.crud.resource.ApiAccessResource.class);
        resources.add(com.f1soft.crud.resource.DeveloperResource.class);
        resources.add(com.f1soft.crud.resource.GenericResource.class);
        resources.add(com.f1soft.crud.resource.ManagerResource.class);
        resources.add(com.f1soft.crud.resource.UserLoginResource.class);
    }
    
}
