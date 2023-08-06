package com.springcore.RemoveXML;

import org.springframework.stereotype.Component;

public class Demo {
    private Depends depends;
    public void setDepends(Depends depends){
        this.depends = depends;
    }
    public void show(){
        this.depends.display();
        System.out.println("Showing...");
    }
}
