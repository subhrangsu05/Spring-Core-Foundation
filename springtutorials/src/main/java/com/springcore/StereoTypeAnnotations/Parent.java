package com.springcore.StereoTypeAnnotations;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Parent {
    @Value("Amit Sinha")
    private String parentName;
    @Value("#{parentAddress}") //--> Spring Expression Language @Value("#{expression}")
    private List<String> parentAddress;
    public void setParentName(String parentName){
        this.parentName = parentName;
    }
    public void setParentAddress(List<String>parentAddress){
        this.parentAddress = parentAddress;
    }
    @Override
    public String toString(){
        return "My father name is: "+parentName+"\nMy father visited many places such like: "+parentAddress;
    }
}
