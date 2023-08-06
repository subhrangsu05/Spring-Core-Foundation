package com.springJDBC.Chap03_SpringJDBCRowMappers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
public class App3 {
    public static void main(String[]args){
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/springJDBC/Chap03_SpringJDBCRowMappers/Chap3Config.xml");
        Persondao persondao = context.getBean("persondao",Persondao.class);
        List<Person> result = persondao.allDetails();
        for(Person rowDetails:result){
            System.out.println(rowDetails);
        }
    }
}
