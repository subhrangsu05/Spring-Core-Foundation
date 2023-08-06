package com.springJDBC.Chap02_SpringJDBCRowMapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[]args){
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/springJDBC/Chap02_SpringJDBCRowMapper/Chap2Config.xml");
        EmployeeDao employeedao = context.getBean("employeedao",EmployeeDao.class);
        Employee employee = context.getBean("employee",Employee.class);
        int inssertResult = employeedao.insert(employee);
        System.out.println("Inserted rows..."+inssertResult);
        Employee employee2 = employeedao.getEmployeeDetails(10258);
        
        System.out.println(employee2);
    }
}
