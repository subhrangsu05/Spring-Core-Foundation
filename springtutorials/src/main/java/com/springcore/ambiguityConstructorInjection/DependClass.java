package com.springcore.ambiguityConstructorInjection;

public class DependClass {
    private int a;
    private int b;
    public DependClass(double a, double b){
        this.a =(int)a;
        this.b = (int)b;
        System.out.println("double constructor is working");
    }
    public DependClass(int a, int b){
        this.a =a;
        this.b = b;
        System.out.println("integer constructor is working");
    }
    
    public String sum(){
        return "The sum will be "+(a+b);
    }
}
