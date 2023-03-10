package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Thuan Luu
 */
public class Senior extends Student {

    private final int minCredits = 85;
   
    /**
     * constructor with parameters.
     *
     * @param name Student name.
     * @param age Student age.
     * @param address Students address.
     * @param credits Number of credits completed.
     */
    public Senior(String name, int age, String address, int credits) {
        super(name, (short) age, address);
        this.credits = credits;

        // If the seniors credit is less than 85 a warning will display to
        // the console.
        if (credits < minCredits) {
            System.out.println("WARNING: Students credits is below the 85 credit minimum.");
        }
    }

    /**
     * A string containing all information currently stored about the student.
     *
     * @return String representation of the student object.
     */
    @Override
    public String toString() {
        return "Senior: " + getName() + ", age: " + getAge() + " Address: " + getAddress() + ", " + getCredits() + " credits, " + getGPA() + " GPA ";
    }

}
