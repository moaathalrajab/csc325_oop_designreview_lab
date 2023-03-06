package com.mycompany.csc325_oop_designreview_lab.school;

/**
 * Child {@link Student} object intended for students who are Freshman in university.
 *
 * @author MatthewDeSouza
 */
public class Freshman extends Student {
    /**
     * Public constructor to create a Freshman object.
     *
     * @param name Name of the freshman.
     * @param age Age of the freshman.
     * @param credits Number of credits the freshman has completed.
     */
    public Freshman(String name, short age, int credits) {
        super(name, age, credits);
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
