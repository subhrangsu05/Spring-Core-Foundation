package com.springcore.lifeCycleWithInterface;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;
import java.util.Map;
public class Courses implements InitializingBean,DisposableBean {
    private Map<String,String> courses;
    public Courses(Map<String,String> courses){
        this.courses = courses;
    }
    // public void setCourse(Map<String,String> courses){
    //     this.courses = courses; 
    // }
    // public Map<String,String> getCourses(){
    //     return courses;
    // }
    @Override
    public String toString(){
        return "Our Courses and their durations are "+courses;
    }
    public void afterPropertiesSet() throws Exception{
        System.out.println("Inside in Init");
    }
    public void  destroy() throws Exception {
        System.out.println("Inside in Destroy");
    }
} 
