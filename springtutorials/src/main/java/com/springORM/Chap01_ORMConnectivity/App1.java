package com.springORM.Chap01_ORMConnectivity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/springORM/Chap01_ORMConnectivity/ORMConfig.xml");
        Productdao productdao = context.getBean("productdao",Productdao.class);
        Product product = new Product("MS Office", "Microsoft crop.");
        int resultInsert = productdao.Insert(product);
        System.out.println("Insert data row is..."+resultInsert); 
    }
}
