/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human { // Student class is a child of Human
    private double GPA; // Field for GPA

    // Fixed constructor of the Student class
    public Student(String name, short age, double GPA) {
        super(name, age); // Calls the Human constructor
        this.GPA = GPA;
    }

    // Setter and getter for GPA
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    // toString method
    @Override
    public String toString() {
        return "Student { Name: " + getName() + ", Age: " + getAge() + ", GPA: " + GPA + " }";
    }

    @Override
    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


