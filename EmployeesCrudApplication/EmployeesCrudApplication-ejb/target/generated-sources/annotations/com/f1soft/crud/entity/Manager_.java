package com.f1soft.crud.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-03T13:37:40")
@StaticMetamodel(Manager.class)
public class Manager_ extends Employee_ {

    public static volatile SingularAttribute<Manager, String> manager_id;
    public static volatile SingularAttribute<Manager, String> managing_team;

}