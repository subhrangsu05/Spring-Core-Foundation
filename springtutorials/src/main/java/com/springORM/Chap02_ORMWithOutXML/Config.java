package com.springORM.Chap02_ORMWithOutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

@Configuration
public class Config {
    @Bean("ds")
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springorm");
        ds.setUsername("root");
        ds.setPassword("password@123");
        return ds;
    }
    @Bean("factory")
    public LocalSessionFactoryBean getLocalSessionFactoryBean(){
        LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
        // factory.setDataSource("ds");
        
        return factory;
    }
    @Bean("hibernateTemplate")
    public HibernateTemplate getHibernateTemplate(){
        HibernateTemplate hibernateTemplate = new HibernateTemplate();
        // hibernateTemplate.setSessionFactory("factory");
        return hibernateTemplate;
    }
    
}
