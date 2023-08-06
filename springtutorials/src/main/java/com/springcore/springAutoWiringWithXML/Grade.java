package com.springcore.springAutoWiringWithXML;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Grade {
    private GStudent gstudent;
    // getter
    public GStudent getgstudent(){
        return gstudent;
    }
    // setter
    public void setgstudent(GStudent gstudent){
        this.gstudent  = gstudent;
    }
    @Override
    public String toString(){
        return "The "+gstudent;
    }
    @PostConstruct
    public void start(){
        System.out.println("Grade lyfcycle start");
    }
    @PreDestroy
    public void end(){
        System.out.println("Grade lyfcycle end");
    }
}
