package com.springcore.RemoveXML;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Component;

@Configuration
// @ComponentScan(basePackages = "com.springcore.RemoveXML")
public class Config {
    
    @Bean
    public Depends getDepends(){
        return new Depends();
    }
    @Bean
    public Demo getDemo() {
        Demo obj = new Demo();
        obj.setDepends(getDepends());
        return obj;
    }
}
