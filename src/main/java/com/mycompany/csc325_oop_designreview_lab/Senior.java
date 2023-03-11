package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author erickcruz
 */
public class Senior extends Student {

    private double gradePointAverage;

    /**
     * This is a default constructor for the Senior class, creates an empty
     * instance of the class.
     */
    public Senior() {
        super("", (short) 0, 0);
        address = "";
    }

    /**
     * This constructor takes in parameters to fill out the seniors information.
     *
     * @param name
     * @param age
     * @param gradePointAverage
     * @throws Exception if the credits is less than 85 than an exception is
     *                   thrown
     */
    public Senior(String name, short age, int credit) throws Exception {
        super(name, age, credit);

        if (credit < 85) {
            Exception e = new Exception("Seniors must have more than 85 credits");
            throw e;
        }

        this.address = "";
        this.gradePointAverage = 0;
    }

    /**
     * Sets the GPA of the studnets
     *
     * @param gradePointAverage
     */
    @Override
    public void setGPA(double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    /**
     * This getter method returns the students GPA.
     */
    @Override
    public double getGPA() {
        return gradePointAverage;
    }

    /**
     * This is a toString method that prints out the students information.
     */
    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Address: " + address + "\n" + "Credits: " + credit
                + "\n" + "GPA: " + gradePointAverage;
    }

}
