/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.crud.dao;

import com.f1soft.crud.entity.ApiAccessedDetails;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author shreejit
 */
@Named
@ApplicationScoped
public class ApiAccessDetailsDao {
    
    
//    ApiAccessedDetails apiAccessedDetails;
    
    public void method(URI myUri, Date date) {
        
        System.out.println("TEST Suceeded!!");
        //        System.out.println(myUri + " :: " + date);
        
        //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        
        // Test
        //              Map<URI, Date> map = new HashMap<>();
        //              System.out.println("Below map");
        //              map.put(myUri, date);
        //              map.get(myUri);
              
    }

}
