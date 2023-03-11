package com.mycompany.csc325_oop_designreview_lab;

/**
 * @author erickcruz
 */
public class Freshman extends Student {

    private double gradePointAverage;

    /**
     * This is a default constructor for the Freshman class which extends from
     * the Student class. Creates a blank instance of the Freshman class.
     */
    public Freshman() {
        super("", (short) 0, 0);
        address = "";
    }

    /**
     * This is a constructor for the Freshman class which extends the Student
     * class. Creates an instance of a Freshman. Takes in parameters for the
     * Freshman's information.
     *
     * @param name,   the freshman's name
     * @param age,    the freshman's age
     * @param credit, the freshman's credits
     */
    public Freshman(String name, short age, int credit) {
        super(name, age, credit);
        address = "";
        gradePointAverage = 0;
    }

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
     * This is a toString method that prints out the students information.
     */
    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Address: " + address + "\n" + "Credits: " + credit
                + "\n"
                + "GPA: " + gradePointAverage;
    }

}
