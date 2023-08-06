package com.springJDBC.Chap04_SpringJavaConfig;

public class Skill {
    private String Name,Skills;
    public Skill(String Name, String Skills){
        this.Name = Name;
        this.Skills = Skills;
    }
    // Getter
    public String getName(){
        return Name;
    }
    public String getSkills(){
        return Skills;
    }
    @Override
    public String toString(){
        return Name + " has "+Skills+" knowledge";
    }
}
