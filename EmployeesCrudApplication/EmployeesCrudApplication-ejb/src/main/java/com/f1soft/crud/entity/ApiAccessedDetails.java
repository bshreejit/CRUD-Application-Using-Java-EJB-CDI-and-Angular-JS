/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author shreejit
 */
public class ApiAccessedDetails {
    
    
    private URI uri;
    
    private List<Date> accessedDate;

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public List<Date> getAccessedDate() {
        return accessedDate;
    }

    public void setAccessedDate(List<Date> accessedDate) {
        this.accessedDate = accessedDate;
    }

    @Override
    public String toString() {
        return "ApiAccessedDetails{" + "uri=" + uri + ", accessedDate=" + accessedDate + '}';
    }

    public void setUri(Map<String, URI> uri) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
