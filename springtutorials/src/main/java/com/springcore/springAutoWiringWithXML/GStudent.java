package com.springcore.springAutoWiringWithXML;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class GStudent {
    private String StudentName;
    private int StudentId;
    //getter
    public String getStudentName(){
        System.out.println(StudentName);
        return StudentName;
    }
    public int getStudentId(){
        System.out.println(StudentId);
        return StudentId;
    }
    //setter
    public void setStudentName(String StudentName){
        this.StudentName = StudentName;
    }
    public void setStudentId(int StudentId){
        this.StudentId = StudentId;
    }
    @Override
    public String toString(){
        return "student name is: "+StudentName+" and the id of the stduent is: "+StudentId;
    }
    @PostConstruct
    public void start1(){
        System.out.println("GStudent lyfcycle start");
    }
    @PreDestroy
    public void end1(){
        System.out.println("GStudent lyfcycle end");
    }
}
