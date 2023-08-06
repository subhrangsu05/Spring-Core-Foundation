package com.springcore.springAutoWiringWithXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class App9 {
    public static void main(String[]args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/springAutoWiringWithXML/XMLAutoWiringConfig.xml");
        Grade gd = context.getBean("grade",Grade.class);
        System.out.println(gd);
        context.registerShutdownHook();
        Grade2 gd1 = context.getBean("grade2",Grade2.class);
        System.out.println(gd1);
    }
}
