package com.springORM.Chap02_ORMWithOutXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[]args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

    }
}
