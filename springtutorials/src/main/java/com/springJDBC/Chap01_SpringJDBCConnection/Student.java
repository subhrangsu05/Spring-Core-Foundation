package com.springJDBC.Chap01_SpringJDBCConnection;
public class Student{
    private int id;
    private String name, city;
    // setter
    public void setId(int id){
        this.id = id;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setCity(String city){
        this.city = city;
    }
    //getter
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
}
