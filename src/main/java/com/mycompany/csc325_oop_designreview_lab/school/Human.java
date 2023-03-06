package com.mycompany.csc325_oop_designreview_lab.school;

/**
 * Abstract class for Student to inherit methods and class variables from.
 *
 * @author MoaathAlrajab
 * @author MatthewDeSouza
 */
public abstract class Human {
    private String name;
	protected String address;
	private short age;

	/**
	 * Protected constructor intended for usage within the child classes.
	 *
	 * @param name Name of student.
	 * @param age Age of student.
	 */
	protected Human(String name, short age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String getAddress();
	
	public abstract void setAddress(String address);

	public short getAge() {
		return age;
	}
	
	public void setAge(short age) {
		this.age = age;
	}
}
