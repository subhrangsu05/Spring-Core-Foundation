package com.springORM.Chap02_ORMWithOutXML;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;
    public void setHibernateTemplate( HibernateTemplate hibernateTemplate){
        this.hibernateTemplate = hibernateTemplate;
    }
    public int Insert (Student student){
        int rowCount = (Integer) hibernateTemplate.save(student);
        return rowCount;
    }
}
