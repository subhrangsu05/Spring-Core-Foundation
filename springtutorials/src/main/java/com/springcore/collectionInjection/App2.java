package com.springcore.collectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/collectionInjection/collectionConfig.xml");
        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println("The employee name is :" +employee1.getEmpName());
        System.out.println("The employee Phone number are is :" +employee1.getEmpPhones());
        System.out.println("The employee Addresses are :" +employee1.getEmpAddresses());
        System.out.println("The employee Courses & their durations are :" +employee1.getEmpCourses());
    }
}
