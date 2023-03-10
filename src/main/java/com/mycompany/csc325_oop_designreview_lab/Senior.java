/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Michael LaNasa
 */
public class Senior extends Student{
    /*
    constructor takes in the minimum 2 parameters for name and age
    */
    public Senior(String name, int age) {
        super(name, age);
    }
    
    /*
    constructor takes in 3 parameters for name, age, and credits
    if credits are below 85 system will print an error message
    */
    public Senior(String name, int age, int credits) {
        super(name, age);
        if(credits>=85)
            this.setCredits(credits);
        else
            System.out.println( "Invalid Senior class creation."
                    + "\nSeniors must have a minimum of 85 credits.");
    }
    
    /* 
    toString method
    Returns Senior member variables in tidy String format
    */
    @Override
    public String toString() {
        return super.toString() + "Senior Credits: " + this.getCredits() + "\n";
    }
}
