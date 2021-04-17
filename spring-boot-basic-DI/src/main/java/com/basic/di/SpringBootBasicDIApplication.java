package com.basic.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class SpringBootBasicDIApplication {

    @Bean(name = "employeeOne")
    public Employee getEmployeeOne() {
        Employee employee1 = new Employee();
        employee1.setAge(37);
        employee1.setName("Sagar");
        employee1.setSalary(BigDecimal.valueOf(1000000));
        return employee1;
    }

    @Bean(name = "employeeTwo")
    public Employee getEmployeeTwo() {
        Employee employee1 = new Employee();
        employee1.setAge(33);
        employee1.setName("Swapna");
        employee1.setSalary(BigDecimal.valueOf(2000000));
        return employee1;
    }

    public static void main(String[] args){

        ApplicationContext context = SpringApplication.
                run(SpringBootBasicDIApplication.class, args);
        System.out.println(context.getBean("employeeTwo", Employee.class));

    }
}
