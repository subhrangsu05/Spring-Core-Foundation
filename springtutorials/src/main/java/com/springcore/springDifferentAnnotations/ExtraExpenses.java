package com.springcore.springDifferentAnnotations;
import java.util.List;
public class ExtraExpenses {
    private List<String> expenses;
    public ExtraExpenses(List<String> expenses){
        this.expenses = expenses;
    }
    public List<String> getExpenses(){
        return expenses;
    }
}
