package com.springcore.springStandaloneCollections;
import java.util.List;
public class Person {
    private  List<String> friends;
    public Person(List<String> friends){
        this. friends = friends;
    }
    public List<String> tooString(){
        return friends;
    }
}
