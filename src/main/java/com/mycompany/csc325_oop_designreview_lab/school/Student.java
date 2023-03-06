
package com.mycompany.csc325_oop_designreview_lab.school;

/**
 * Parent class to students at varying levels of completion in university.
 * Constructor is intended to be called when constructing child objects.
 *
 * @author MoaathAlrajab
 * @author MatthewDeSouza
 */
public class Student extends Human {
    protected int credits;
    private float gpa;

    public Student(String name, short age, int credits) {
        // Call to super supplying parent class variables
        super(name, age);
        this.credits = credits;

    }

    // Mutators and Accessors
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getGpa() {
        return gpa;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\t\"name\": %s%n".formatted(getName()) +
                "\t\"age\": %d%n".formatted(getAge()) +
                "\t\"address\": %s%n".formatted(getAddress()) +
                "\t\"credits\": %d%n".formatted(getCredits()) +
                "\t\"gpa\": %.2f%n".formatted(getGpa()) +
                "}";
    }
}