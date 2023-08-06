package com.springcore.springExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App14 {
    public static void main(String[]args){
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/springcore/springExpressionLanguage/springSELConfig.xml");
        Child child = context.getBean("child",Child.class);
        System.out.println(child);

        // Invoke Methods & varibales:
        InvokeMethod im = context.getBean("invokeMethod",InvokeMethod.class);
        System.out.println(im);
        // Invoke Objects:
        InvokeObject io = context.getBean("invokeObject", InvokeObject.class);
        System.out.println(io);
        // Invoke boolean
        InvokeBoolean bool = context.getBean("invokeBoolean", InvokeBoolean.class);
        System.out.println(bool);
    }
}
