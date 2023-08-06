package com.springcore.springAutoWiringWithXML;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Grade2 {
    private GStudent gstudent;
    // constructor
    public Grade2 (GStudent gstudent){
        this.gstudent = gstudent;
    }
    @Override
    public String toString(){
        return "The "+gstudent;
    }
    @PostConstruct
    public void start(){
        System.out.println("Grade2 lyfcycle start in constructor");
    }
    @PreDestroy
    public void end(){
        System.out.println("Grade2 lyfcycle end in constructor");
    }
}
