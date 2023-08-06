package com.springORM.Chap01_ORMConnectivity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    private String ProductName;
    private String ProductCompany;
    public Product(String ProductName, String ProductCompany){
        this.ProductName = ProductName;
        this.ProductCompany = ProductCompany;
    }
    public Product(){
        
    }
    @Override
    public String toString(){
        return "The product is: "+ProductName + " and this product belongs to "+ProductCompany+ "Comapany";
    }
}

