package org.example.SampleClass;

import org.example.classes.Human;

public class Student {
    private int studentAge;
    private College college;
    private  int studentyear;
    public void action(){
        System.out.println("coding..");
    }

    Student(int studentAge,College collegename,int studentYear){
        System.out.println("student object created");
        this.studentyear=studentYear;
        this.studentAge=studentAge;
        this.college=collegename;
    }

    public void setStudentAge(int age){
        System.out.println("setter called");
        studentAge=age;
    }

    public int getStudentAge(){
        return this.studentAge;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public void printCollege(){
        System.out.println(college.getCollege());
    }

    public void printstudentyear(){
        System.out.println(this.studentyear);
    }
}
