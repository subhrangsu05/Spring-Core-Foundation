package com.springcore.springDifferentAnnotations;
import java.util.List;
public class PotatoStuff {
    private List<String> stuffingIngredients;
    public PotatoStuff(List<String> stuffingIngredients){
        this.stuffingIngredients = stuffingIngredients;
    }
    public List<String> Ingredient(){
        return stuffingIngredients;
    }
}
