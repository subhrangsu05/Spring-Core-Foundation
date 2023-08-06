package com.springcore.StereoTypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App13 {
    public static void main(String[]args){
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/StereoTypeAnnotations/StereoTypeConfig.xml");
        Parent paa = context.getBean("parent",Parent.class);
        System.out.println(paa.hashCode());
        Parent paa1 = context.getBean("parent",Parent.class);
        System.out.println(paa1.hashCode());
    }
}
