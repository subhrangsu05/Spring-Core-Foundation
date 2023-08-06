package com.springJDBC.Chap02_SpringJDBCRowMapper;

public class Employee {
    private int id;
    private String name;
    private String companyName;
    public Employee(int id, String name,String companyName){
        this.id = id;
        this.name = name;
        this.companyName = companyName;
    }
    // getter
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCompanyName(){
        return companyName;
    }
    public String toString(){
        return "Id: "+id+" Name: "+name+" Company Name: "+companyName;
    }
}
