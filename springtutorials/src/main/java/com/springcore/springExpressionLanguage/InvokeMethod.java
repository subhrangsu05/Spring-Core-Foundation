package com.springcore.springExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InvokeMethod {
    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double rootValue;
    public void setRootValue(double rootValue){
        this.rootValue = rootValue;
    }
    public String toString(){
        return "The Square root will be: "+rootValue;
    }
}
