package com.springcore.lifeCycleWithXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class App6 {
    public static void main(String[]args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/lifeCycleWithXML/lifeCycleConfig.xml");
        Languages lang = (Languages) context.getBean("language");
        System.out.println(lang.TOString());
        context.registerShutdownHook();
    }
}
