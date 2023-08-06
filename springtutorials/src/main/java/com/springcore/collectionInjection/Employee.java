package com.springcore.collectionInjection;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Employee {
    private String empName;
    private List <String> empPhones;
    private Set <String> empAddresses;
    private Map <String,String> empCourses;

    // getter
    public String getEmpName(){
        return empName;
    }
    public List <String> getEmpPhones(){
        return empPhones;
    }
    public Set <String> getEmpAddresses(){
        return empAddresses;
    }
    public Map <String, String> getEmpCourses(){
        return empCourses;
    }

    // setter
    public void setEmpName(String empName){
        this.empName = empName;
    }
    public void setEmpPhones(List<String> empPhones){
        this.empPhones = empPhones;
    }
    public void setEmpAddresses(Set <String> empAddresses){
        this.empAddresses = empAddresses;
    }
    public void setEmpCourses(Map<String,String> empCourses){
        this.empCourses = empCourses;
    }
}
