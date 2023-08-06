package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {
    public static void main(String[]args){
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/constructorInjection/constructorConfig.xml");
        // ReferenceConstructor data = (ReferenceConstructor) context.getBean("referenceConstructor");
        // System.out.println(data.getCourse());
        Person data = (Person) context.getBean("person");
        System.out.println(data);
    }
}
