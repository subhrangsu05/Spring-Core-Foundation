package com.springcore.lifeCycleWithAnnotation;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class Offices {
    private Set <String> offices;
    public Offices(Set <String> offices){
        this.offices = offices;
    }
    @Override
    public String toString(){
        return "Best Service based companies are "+offices;
    }
    @PostConstruct
    public void starting() throws Exception{
        System.out.println("Inside Init");
    }
    @PreDestroy
    public void ending() throws Exception{
        System.out.println("Inside destroy");
    }
}
