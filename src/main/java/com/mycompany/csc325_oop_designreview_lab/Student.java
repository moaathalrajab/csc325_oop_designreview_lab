package com.mycompany.csc325_oop_designreview_lab;

/**
 * Student class.
 *
 * @author MoaathAlrajab, Jonathan Espinal
 */
public class Student extends Human {

    private double gpa;

    /**
     * Parameterized constructor.
     *
     * @param name Name of student
     * @param age Age of student
     */
    public Student(String name, short age) {
        super(name, age);
    }

    /**
     * Returns the student's address.
     *
     * @return Student address string.
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

    /**
     * Returns the GPA.
     *
     * @return The GPA as a double.
     */
    public double getGPA() {
        return gpa;
    }

    /**
     * Set the GPA.
     *
     * @param gpa The GPA of the student as a double.
     */
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    // ToDo 1: Make this class a child of Human - DONE
    // ToDo 2: Fix the resulting errors - DONE
    // ToDo 3: Add a field for GPA and create setter and getter - DONE
    // ToDo 4: Add comments to your code - DONE
}
