/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author mattl
 */
public class Senior extends Student { // Senior class is a child of Student
    private int credits; // Field for credits

    // Constructor for Senior class
    public Senior(String name, short age, double GPA, int credits) {
        super(name, age, GPA); // Calls the Student constructor
        if (credits >= 85) { // Seniors must have a minimum of 85 credits
            this.credits = credits;
        } else {
            throw new IllegalArgumentException("Senior students must have a minimum of 85 credits.");
        }
    }

    // toString method for Senior class
    @Override
    public String toString() {
        return "Senior { Name: " + getName() + ", Age: " + getAge() + ", GPA: " + getGPA() + ", Credits: " + credits + " }";
    }
}
