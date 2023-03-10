/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Michael LaNasa
 */
public class Freshman extends Student{
    /*
    constructor takes in the minimum 2 parameters for name and age
    */
    public Freshman(String name, int age) {
        super(name, age);
    }
    
    /*
    constructor takes in 3 parameters for name, age, and credits
    if credits are below 85 system will print an error message
    */
    public Freshman(String name, int age, int credits) {
        super(name, age, credits);
    }
    
    /* 
    toString method
    Returns Freshman member variables in tidy String format
    */
    @Override
    public String toString() {
        return super.toString() + "Freshman Credits: " + this.getCredits() + "\n";
    }
}
