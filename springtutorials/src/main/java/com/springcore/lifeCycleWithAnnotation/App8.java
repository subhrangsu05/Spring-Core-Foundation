package com.springcore.lifeCycleWithAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class App8 {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/lifeCycleWithAnnotation/lifeCycleAnnotationConfig.xml");
        Offices ofc = (Offices) context.getBean("offices");
        System.out.println(ofc);
        context.registerShutdownHook();
    }
}
