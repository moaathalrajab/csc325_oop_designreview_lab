package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    //field for credits
    protected short credits;
    //parametric constructor inherits from student
    public Freshman(String name, short age, short credits) {
            super(name, age);
            this.credits = credits;
    }

    //toString method
    @Override
    public String toString() {
        return super.toString() + " Student credits: " + credits;
    }
}
