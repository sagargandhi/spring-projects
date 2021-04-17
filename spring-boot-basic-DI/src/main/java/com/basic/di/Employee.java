package com.basic.di;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Getter
@Setter
@ToString
@Slf4j
public class Employee {
    private String name = "Sagar";
    private BigDecimal salary = BigDecimal.valueOf(1000000.00);
    private Integer age = 37;

    public void display(){
        System.out.println("Displaying " + this.toString() );
    }
}
