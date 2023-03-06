package com.mycompany.csc325_oop_designreview_lab.school;

/**
 * Child {@link Student} object intended for students who are Seniors in university.
 * @author MatthewDeSouza
 */
public class Senior extends Student {
    private static final int MINIMUM_CREDITS = 85;

    /**
     * Public constructor to create a Senior object. Throws an {@link IllegalArgumentException} should
     * the minimum credit requirement is not met upon instantiation.
     *
     * @param name Name of the senior.
     * @param age Age of the senior.
     * @param credits Number of credits the senior has completed.
     */
    public Senior(String name, short age, int credits) {
        super(name, age, credits);
        if (credits < MINIMUM_CREDITS) {
            throw new IllegalArgumentException("Seniors must have at least %d credits!".formatted(MINIMUM_CREDITS));
        }
    }

    @Override
    public void setCredits(int credits) {
        if (credits < MINIMUM_CREDITS) {
            throw new IllegalArgumentException("Seniors must have at least %d credits!".formatted(MINIMUM_CREDITS));
        }
        this.credits = credits;
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
