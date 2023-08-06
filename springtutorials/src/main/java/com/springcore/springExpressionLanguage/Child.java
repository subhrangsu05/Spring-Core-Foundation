package com.springcore.springExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Child {
    @Value("10")
    private  int x;
    @Value("#{5+10}")
    private int y;
    public void setChild(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "x: "+x+", y: "+y;
    }
}
