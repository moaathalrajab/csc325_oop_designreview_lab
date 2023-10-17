package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{
    //field for credits
    protected short credits;
    //parametric constructor inherits from student
    public Senior(String name, short age, short credits) {
        super(name, age);
        if (credits < 85){
            System.out.println("Invalid credits for senior status");
            System.exit(0);
        }
        this.credits = credits;
    }

    //toString method
    @Override
    public String toString() {
        return super.toString() + " Student credits: " + credits;
    }

}
