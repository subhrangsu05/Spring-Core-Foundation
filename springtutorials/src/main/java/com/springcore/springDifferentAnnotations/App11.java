package com.springcore.springDifferentAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App11 {
    public static void main(String[]args){
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/springDifferentAnnotations/differentSpringAnnotationConfig.xml");
        Samosa samosa = context.getBean("samosa",Samosa.class);
        System.out.println(samosa);
    }
}
