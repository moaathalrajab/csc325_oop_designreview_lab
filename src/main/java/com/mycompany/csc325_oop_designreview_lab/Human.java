package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author Thuan Luu
 */
public abstract class Human {

    protected String name; // The name of the student
    protected String address; // The address of the student
    protected short age; // The age of the student

    /**
     * constructor with parameters.
     *
     * @param name Student's name.
     * @param age Student's age.
     * @param address Student's address.
     */
    public Human(String name, short age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * Returns the name of the student
     *
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the address of the student
     *
     * @return the address of the student
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the student
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the age of the student
     *
     * @return the age of the student
     */
    public short getAge() {
        return age;
    }

    /**
     * Sets the age of the student
     *
     * @param age
     */
    public void setAge(short age) {
        this.age = age;
    }
}
