package com.basic.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBasicDIApplication {

    public static void main(String[] args){

        ApplicationContext context = SpringApplication.
                run(SpringBootBasicDIApplication.class, args);
        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);


    }
}
