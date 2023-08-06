package com.springJDBC.Chap01_SpringJDBCConnection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App1 {
    public static void main(String[]args){
        System.out.println("My program is being started......");
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/springJDBC/Chap01_SpringJDBCConnection/jdbcConfig.xml");
        StudentDao studentdao = context.getBean("studentdao",StudentDao.class);
        Student student  = new Student();

        // Insert Query:-
        student.setId(310);
        student.setName("Tanmoy Roy");
        student.setCity("Chingri Ghata");
        int insertResult = studentdao.insert(student);
        System.out.println("count of inserted rows are "+insertResult);

        // Update Query:-
        student.setId(101);
        student.setName("Subhrangsu Sinha");
        int updateResult = studentdao.update(student);
        System.out.println("count of updated rows are "+updateResult);
        
        // Delete Query:-
        student.setId(205);
        int deleteResult = studentdao.delete(student);
        System.out.println("count of deleted rows are "+deleteResult);
        System.out.println("End of my program .....");
    }
}
