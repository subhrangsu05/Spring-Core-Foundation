package com.springJDBC.Chap04_SpringJavaConfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App4 {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Skilldao skilldao = context.getBean("skilldao",Skilldao.class);
        Skill skill = new Skill("Swarnadip Dey","Pega Developer");
        int insertRow = skilldao.Insert(skill);
        System.out.println("Inserted Row...."+insertRow);
        List<Skill> result = skilldao.select();
        for(Skill rowDetails:result){
            System.out.println(rowDetails);
        }
    }
}
