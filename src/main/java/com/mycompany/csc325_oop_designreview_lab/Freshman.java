/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author mattl
 */
public class Freshman extends Student { // Freshman class is a child of Student
    private final int credits; // Field for credits

    // Constructor for Freshman class
    public Freshman(String name, short age, double GPA, int credits) {
        super(name, age, GPA); // Calls the Student constructor
        this.credits = credits;
    }

    // toString method for Freshman class
    @Override
    public String toString() {
        return "Freshman { Name: " + getName() + ", Age: " + getAge() + ", GPA: " + getGPA() + ", Credits: " + credits + " }";
    }
}

