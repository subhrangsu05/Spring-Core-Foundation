package com.springcore.springDifferentAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Samosa {
    @Autowired
    @Qualifier("expenses1")
    private PotatoStuff stuffingIngredient;
    private ExtraExpenses depreciation;
    @Autowired
    public Samosa(ExtraExpenses depreciation){
        this.depreciation = depreciation;
    }
    @Override
    @Qualifier("expenses2")
    public String toString(){
        return "The ingredients of samosa are "+stuffingIngredient.Ingredient() + "\n The depreciation list are "+depreciation.getExpenses();
    }
}
