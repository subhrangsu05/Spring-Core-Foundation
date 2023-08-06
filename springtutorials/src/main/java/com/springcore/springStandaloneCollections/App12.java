package com.springcore.springStandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App12 {
    public static void main(String[]args){
        ApplicationContext context = new ClassPathXmlApplicationContext ("/com/springcore/springStandaloneCollections/StandardCollectionConfig.xml");
        Person person = context.getBean("person",Person.class);
        System.out.println(person.tooString().getClass().getName());
    }
}
