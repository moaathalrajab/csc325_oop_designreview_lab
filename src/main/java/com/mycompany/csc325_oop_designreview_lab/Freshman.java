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
public class Freshman extends Student{
    
    private int credits; 
    
    /**
     * Default Constructor
     * @param name
     * @param age
     * @param gpa
     * @param credits 
     */
    public Freshman(String name, int age, double gpa, int credits) {
        super(name, age, gpa);
        this.credits = credits;
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
     * @param credits 
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * ToString Method
     * @return credits 
     */
    @Override
    public String toString() {
        return "Freshman{" + "credits=" + credits + '}';
    }
    
    
    
}
