package com.springcore.RemoveXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App15 {
    public static void main(String[]args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Demo damm = context.getBean("getDemo",Demo.class);
        System.out.println(damm);
        damm.show();
    }
}
