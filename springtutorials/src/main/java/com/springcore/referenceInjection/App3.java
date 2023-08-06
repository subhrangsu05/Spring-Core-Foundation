package com.springcore.referenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[]arr){
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/referenceInjection/referenceConfig.xml");
        RefDetails refobj = (RefDetails)context.getBean("refdetails");
        System.out.println("My name is: "+refobj.getName()+ " and I'm from "+refobj.getAddress().getAddress());
    }
}
