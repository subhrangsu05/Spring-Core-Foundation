package com.springcore.springAutoWiringWithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class College {
    @Autowired
    private Faculty faculty;
    @Override
    public String toString(){
        return "The faculty name is "+faculty.returnName()+", who belongs to "+faculty.returnDepartment()+" department";
    }
}
