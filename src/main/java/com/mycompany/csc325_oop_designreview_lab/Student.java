/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {


	// ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors

    //implemented abstract methods
    public Student(String eName, short eAge){
        super(eName, eAge);

    }
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

	// ToDo 3: Add a field for GPA and create a setter and a getter
    //field for gpa
    protected double gpa;

    //setters and getters for gpa
    public double getGpa(){
        return this.gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    //toString method
    @Override
    public String toString() {
        return "Student name: " + getName() + " Student age: " + getAge() + " Student GPA: " + getGpa();
    }

    // ToDo 4: Add comments to your code
    //added comments to code
}
