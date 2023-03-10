/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import com.mycompany.csc325_oop_designreview_lab.Student;

/**
 *
 * @author Owner
 */
public class Senior extends Student {
    //Initialize Credits
    private int credits; 
    
    /**
     * Default Constructor
     * @param name
     * @param age
     * @param gpa
     * @param credits 
     */
    public Senior(String name, int age, double gpa, int credits) {
        super(name, age, gpa);
        
        if(credits > 85)
            this.credits = credits;
        else{
            System.out.println("Invalid Senior.");
        }
    }

    /**
     * Accessor Method
     * @return credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Mutator Method
     * Student must have over 85 credits to be a senior.
     * @param credits 
     */
    public void setCredits(int credits) {
        if(credits > 85)
            this.credits = credits;
        else{
            System.out.println("Invalid Senior.");
        }
    }

    /**
     * ToString Method
     * @return string
     */
    @Override
    public String toString() {
        return "Senior{" + "credits=" + credits + '}';
    }
    
    
    
}
