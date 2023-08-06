package com.springcore.springAutoWiringWithAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App10 {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/springAutoWiringWithAnnotation/AnnotattionAutoWiringConfig.xml");
        College college = context.getBean("college",College.class);
        System.out.println(college);
    }
}
