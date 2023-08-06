package com.springcore.referenceInjection;

public class RefDetails {
    private String name;
    private Details address;
    //getter
    public String getName(){
        return name;
    }
    public Details getAddress(){
        return address;
    }
    // setter
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(Details address){
        this.address = address;
    }
}
