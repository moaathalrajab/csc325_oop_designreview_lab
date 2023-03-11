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
	// ToDo 1: Make this class a child of Person
	// ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors
    
        //Fields specific for the Student class
        private String address;
        private double gpa;
        
        /**
         * Basic constructor for Student object
         * @param name
         * @param age 
         */
        public Student(String name, short age) {
            super(name, age);
        }
        
        /**
         * Returns address field
         * @return 
         */
        @Override
        public String getAddress() {
            return this.address;
        }
        
        /**
         * Setter for address field
         * @param address 
         */
        @Override
        public void setAddress(String address) {
            this.address = address;
        }

	// ToDo 3: Add a field for GPA and create setter and getter
        
        /**
         * Setter for GPA field
         * @param gpa 
         */
        public void setGPA(double gpa) {
            this.gpa = gpa;
        }
        
        /**
         * Getter for GPA field
         * @return 
         */
        public double getGPA() {
            return this.gpa;
        }
	
	// ToDo 4: Add comments to your code
        
        /**
         * Overridden toString method
         * @return 
         */
        @Override
        public String toString() {
            String result = "Name: " + super.getName() + " Age: " + super.getAge() + " Address: " + address + " GPA: " + gpa;
            return result;
        }
}
