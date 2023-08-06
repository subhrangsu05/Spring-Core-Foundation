package com.springcore.ambiguityConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5 {
    public static void main(String[]arr){
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/ambiguityConstructorInjection/ambiguityConstructorConfig.xml");
        DependClass data = (DependClass) context.getBean("dependclass");
        System.out.println(data.sum());
    }
    
}
