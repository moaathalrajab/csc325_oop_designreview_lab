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

        //Initialize Student GPA
        protected double gpa;
        
        // ToDo 1: Make this class a child of Human (DONE)
        /**
         * Default Constructor for Student, extends Human Class.
         * @param name
         * @param age 
         */
        public Student(String name, int age, double gpa) {
            super(name, age);
            this.gpa = gpa;
        }
	// ToDo 2: Fix the resulting errors (Done)

        // ToDo 3: Add a field for GPA and create setter and getter (Done)
        /**
         * Accessor Method
         * @return gpa
         */
        public double getGpa() {
            return gpa;
        }

        /**
         * Mutator Method
         * @param gpa 
         */
        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
        
        /**
         * Accessor Method
         * @return address
         */
        public String getAddress(){
            return address;
        }
        
        /**
         * Mutator Method
         * @param address 
         */
        public void setAddress(String address){
            this.address = address;
        }
        
        
        // ToDo 4: Add comments to your code (Done)

        /**
         * To String Method
         * @return 
         */
        @Override
        public String toString() {
            return "Student{" + "gpa=" + gpa + '}';
        }

    
}
