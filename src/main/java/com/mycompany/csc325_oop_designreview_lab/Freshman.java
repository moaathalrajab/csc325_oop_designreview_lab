/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * Freshman student class. Subclass of class Student.
 *
 * @author Jonathan Espinal
 */
public class Freshman extends Student {

    private int credits;

    /**
     * Parameterized constructor.
     *
     * @param name Student's name.
     * @param age Student's age.
     * @param credits Number of credits completed.
     */
    public Freshman(String name, int age, int credits) {
        super(name, (short) age);
        this.credits = credits;
    }

    /**
     * Gets the number of credits in the student's record.
     *
     * @return The number of credits.
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Sets the number of credits in the student's record.
     *
     * @param credits The number of credits.
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * A string containing all information currently stored about the student.
     *
     * @return String representation of the student object.
     */
    @Override
    public String toString() {
        return "Freshman"
                + "\nName: " + this.name
                + "\nAge: " + this.age
                + "\nAddress: " + this.address
                + "\nCredits: " + this.getCredits()
                + "\nGPA: " + this.getGPA()
                + "\n";
    }
}
