package com.springJDBC.Chap03_SpringJDBCRowMappers;

public class Person {
    private int Id;
    private String Name;
    private String CompanyName;
    public Person(int Id, String Name, String CompanyName){
        this.Id= Id;
        this.Name= Name;
        this.CompanyName = CompanyName;
    }
    public String toString(){
        return "Id: '"+Id+"' Name: '"+Name+"' CompanyName: '"+CompanyName;
    }
}
