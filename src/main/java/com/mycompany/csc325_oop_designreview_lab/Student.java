/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 * @author erickcruz
 */
public class Student extends Human {
	// private field member that holds the students gpa.

	protected int credit;
	protected double gradePointAverage;

	// ToDo 1: Make this class a child of Human
	public Student() {
		super("", (short) 0);
		this.address = "";
		this.credit = 0;
		this.gradePointAverage = 0;
	}

	/**
	 * This is a constructor that inherits from the Human class. This creates an
	 * instance of the Student class.
	 *
	 * @param name,   the name of the student
	 * @param age,    the age of the student
	 * @param credit, the student's credit.
	 */
	public Student(String name, short age, int credit) {
		super(name, age);
		this.address = "";
		this.credit = credit;
		this.gradePointAverage = 0;
	}
	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create setter and getter
	/**
	 * This is the setter method for the Students GPA it takes in a double
	 * parameter and sets it.
	 *
	 * @param gradePointAverage, int that is going to be the students GPA
	 */
	public void setGPA(double gradePointAverage) {
		this.gradePointAverage = gradePointAverage;
	}

	/**
	 * This is the getter method for the Students GPA.
	 *
	 * @return gradePointAverage
	 */
	public double getGPA() {
		return this.gradePointAverage;
	}

	/**
	 * Overrides the setAddress() method in the Human class This is the setter
	 * method that sets the address for the student.
	 */
	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Overrides the getAddress() method in the Human class This is the getter
	 * method that returns the address for the student.
	 */
	@Override
	public String getAddress() {
		return address;
	}

	// ToDo 4: Add comments to your code
}
