package com.f1soft.crud.entity;

import com.f1soft.crud.entity.Address;
import com.f1soft.crud.entity.Department;
import com.f1soft.crud.entity.EmployeeDetails;
import com.f1soft.crud.entity.Phone;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-03T13:37:40")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, Address> address;
    public static volatile ListAttribute<Employee, Phone> phone;
    public static volatile SingularAttribute<Employee, EmployeeDetails> details;
    public static volatile SingularAttribute<Employee, Integer> id;
    public static volatile ListAttribute<Employee, Department> department;

}