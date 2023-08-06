package com.springcore.lifeCycleWithInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App7 {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/lifeCycleWithInterface/lifeCycleInterfaceConfig.xml");
        context.registerShutdownHook();
        Courses course = (Courses) context.getBean("courses");
        System.out.println(course);
    }  
}
