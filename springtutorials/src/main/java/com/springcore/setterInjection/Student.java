package com.springcore.setterInjection;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    //Getter 
    public int getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getStudentAddress(){
        return studentAddress;
    }
    //Setter
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setStudentAddress(String studentAddress){
        this.studentAddress = studentAddress;
    }
    @Override
    public String toString(){
        return "["+studentId+","+studentName+","+studentAddress+"]";
    }
}
