package com.mycompany.csc325_oop_designreview_lab;

import com.mycompany.csc325_oop_designreview_lab.Student;
import com.mycompany.csc325_oop_designreview_lab.Student;

/**
 *
 * @author Thuan Luu
 */
public class Freshman extends Student {

    /**
     * constructor with parameters.
     *
     * @param name Student's name.
     * @param age Student's age.
     * @param address Student's address.
     * @param credits Number of credits completed.
     */
    public Freshman(String name, int age, String address, int credits) {
        super(name, (short) age, address);
        this.credits = credits;
    }
    

     /**
     * A string containing all information currently stored about the student.
     *
     * @return String representation of the student object.
     */
    @Override
    public String toString() {
        return "Freshman: " + getName() + ", age: " + getAge() + " Address: " + getAddress() + ", " + getCredits() + " credits, " + getGPA() + " GPA ";
    }

}
