package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Thuan Luu
 */
public class Student extends Human {
    
    protected int credits; // Students credit
    private double GPA; // Students GPA
    
    /**
     * constructor with parameters.
     *
     * @param name Name of student
     * @param age Age of student
     * @param address
     */
    public Student(String name, short age, String address) {
        super(name, age, address);
    }


     /**
     * Returns the GPA for the student
     *
     * @return the GPA for the student
     */
    public double getGPA() {
        return GPA;
    }
    
     /**
     * sets the GPA for the student
     *
     * @param GPA sets GPA.
     */
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    
    /**
     * Returns the credits for the student
     *
     * @return the credits for the student.
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Sets the credits for the student
     *
     * @param credits the credits of the student
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    /**
     * Returns the student's address.
     *
     * @return the student's address.
     */
    @Override
    public String getAddress() {
        return address;
    }

    /**
     * Sets the student address.
     *
     * @param address The address of the student.
     */
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

}
