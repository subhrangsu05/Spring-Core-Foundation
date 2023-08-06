package com.springcore.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/setterInjection/setterConfig.xml");
        // Student 1:
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);
        // Student 2:
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student2);
    }
}
