package com.springcore.springExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InvokeObject {
    @Value("#{new java.lang.String('Cognizant Technology Solutions')}")
    private String companyName;
    public void setUserName(String companyName){
        this.companyName = companyName;
    }
    public String toString(){
        return "The object is: "+companyName;
    }
}
