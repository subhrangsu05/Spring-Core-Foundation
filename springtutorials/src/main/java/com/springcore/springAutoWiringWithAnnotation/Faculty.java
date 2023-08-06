package com.springcore.springAutoWiringWithAnnotation;

public class Faculty {
    private String name;
    private String department;
    public Faculty(String name,String department){
        this.name = name;
        this.department = department;
    }
    public String returnName(){
        return name;
    }
    public String returnDepartment(){
        return department;
    }
}
