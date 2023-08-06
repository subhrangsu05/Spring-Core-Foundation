package com.springcore.constructorInjection;

public class Person {
    private String name;
    private int id;
    private ReferenceConstructor course;
    public Person(String name, int id, ReferenceConstructor course){
        this.name = name;
        this.id = id;
        this.course = course;
    }
    @Override
    public String toString(){
        return "The id of "+name+" is : "+id+". He has done "+course.getCourse()+" courses.";
    }
}
