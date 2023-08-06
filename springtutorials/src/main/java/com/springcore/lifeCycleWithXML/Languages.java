package com.springcore.lifeCycleWithXML;
import java.util.List;
public class Languages {
    private List<String> languages;
    public Languages(List<String> languages){
        this.languages = languages;
        System.out.println("Inside Constructor method");
    }
    public List<String> TOString(){
        return languages;
    }
    public void init(){
        System.out.println("Inside init method");
    }
    public void destroy(){
        System.out.println("Inside destroy method");
    }
}
