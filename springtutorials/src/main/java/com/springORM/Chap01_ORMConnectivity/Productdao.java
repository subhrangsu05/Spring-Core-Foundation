package com.springORM.Chap01_ORMConnectivity;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class Productdao {
    private HibernateTemplate hibernateTemplate;
    public void setHibernetTemplate(HibernateTemplate hibernateTemplate){
        this.hibernateTemplate = hibernateTemplate;
    }
    public Productdao(){

    }
    // @Transactional
    public int Insert(Product product){
        int rowCount = (Integer)hibernateTemplate.save(product);
        return rowCount;
    }

    public Product getDetails(String ProductName){
        Product product = (Product) hibernateTemplate.get(Product.class,ProductName);
        return product;
    }

    public List<Product> getAllDetails(){
        List<Product> product = hibernateTemplate.loadAll(Product.class);
        return product;
    }
    
    public void Delete(String ProductName){
        Product product = (Product)hibernateTemplate.get(Product.class,ProductName);
        hibernateTemplate.delete(product);
    }

    public void Update(Product product){
        hibernateTemplate.update(product);
    }
}
