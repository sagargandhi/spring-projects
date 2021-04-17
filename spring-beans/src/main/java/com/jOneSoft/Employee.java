package com.jOneSoft;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.math.BigDecimal;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class Employee {
    private int id;
    private String name;
    private BigDecimal amount;

    private Address address;

    public Employee(Address address){
        super();
        this.address = address;
    }

    public static void main(String [] args){
        Resource resource = new ClassPathResource("beans.xml");
        BeanFactory context = new XmlBeanFactory(resource);

        Employee employee = context.getBean("emp1", Employee.class);
       // Employee emp2 = context.getBean("emp2", Employee.class);
      //  System.out.println(emp2);
        System.out.println(employee);

    }

}
