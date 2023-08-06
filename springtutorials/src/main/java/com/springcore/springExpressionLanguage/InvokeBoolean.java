package com.springcore.springExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InvokeBoolean {
    @Value("#{5>2}")
    private boolean isActive;
    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }
    @Override
    public String toString(){
        return "Status is: "+isActive;
    }
}
