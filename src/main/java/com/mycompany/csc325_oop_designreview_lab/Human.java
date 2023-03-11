/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Human {
	protected String name;
	protected String address;
	protected short age;

	/**
	 * Default constructor that creates an empty instance of the Human class.
	 */
	protected Human() {
		name = "";
		age = 0;
	}

	/**
	 * Constructor that only takes in two parameters
	 * 
	 * @param name, the name of the human
	 * @param age,  the age of the human
	 */
	protected Human(String name, short age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * The getter method that returns the name of the human.
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * This setter method allows the name of the human to be set.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This is an abstract method that will esentially be overriden in the children
	 * classes and will return the adress of the human.
	 * 
	 * @return
	 */
	public abstract String getAddress();

	/**
	 * This is an abstract method that will esentially be overriden in the children
	 * classes and will set the adress of the human.
	 * 
	 * @param address
	 */
	public abstract void setAddress(String address);

	/**
	 * This is the getter method that returns the humans age
	 * 
	 * @return
	 */
	public short getAge() {
		return age;
	}

	/**
	 * This is the setter method that allows users to set the name of the human.
	 * 
	 * @param age
	 */
	public void setAge(Short age) {
		this.age = age;
	}
}