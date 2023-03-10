/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 * @author Michael LaNasa
 */
public class Student extends Human {
    // Add fields for GPA and credits
    private double GPA;
    private int credits;
    
    // ToDo 1: Make this class a child of Person
    // ToDo 1: Make this class a child of Human
    // completed by using 'extends' keyword in class header    

    // ToDo 2: Fix the resulting errors
    // fix errors by creating constructor method 
    //and overriding abstract methods
    
    /*
    constructor takes in the minimum 2 parameters
    */
    public Student(String name, int age) {
        super(name, age);
    }
    
    /*
    constructor that takes 3 parameters
    */
    public Student(String name, int age, int credits) {
        super(name, age);
        this.credits = credits;
    }
    
    /*
    Getter method for address member variable
    Overrides abstract method getAddress from parent class to fix error
    Returns Student address
    */
    @Override
    public String getAddress() {
        return this.address;
    }
    
    /* 
    Setter method for adddress member variable
    Overrides abstract method setAddress from parent class to fix error 
    */
    @Override
    public void setAddress(String address) {
        this.setAddress(address);
    }

    // ToDo 3: Add a field for GPA and create setter and getter
    /* 
    Getter method for GPA member variable
    Returns Student GPA
    */
    public double getGPA(){
        return this.GPA;
    }
    
    /* 
    Setter method for GPA member variable
    */  
    public void setGPA(double g) {
        this.GPA = g;
    }
	
    // ToDo 4: Add comments to your code
    
    /*
    Getter method for credits member variable
    Returns Student credits
    */
    public int getCredits() {
        return this.credits;
    }
    
    /*
    Setter method for credits member variable
    */
    public void setCredits(int c) {
        this.credits = c;
    }
}
