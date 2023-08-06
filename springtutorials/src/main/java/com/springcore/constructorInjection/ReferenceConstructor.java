package com.springcore.constructorInjection;
import java.util.List;
public class ReferenceConstructor {
    private List <String> course;
     public ReferenceConstructor(List <String> course){
        this. course = course;
     }
     public List<String> getCourse(){
        return course;
     }
}
