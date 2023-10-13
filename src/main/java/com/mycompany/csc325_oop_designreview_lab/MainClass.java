/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

                // Todo 7: Create two classes for Freshman and Senior 

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 9: Add a toString method for the Student class
		// ToDo 10: Add a toString method for the Freshman class

		Student std1= new Student("James",(short)20); //added code to parse int to short
                // ToDo 11: Add a toString method for the Senior class

		Freshman std2= new Freshman("James", (short)20, (short)12); // name, age, credits

                Senior std3 = new Senior("John", (short)30, (short)90);//fixed code to instantiate senior

		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
	 	Scanner scnr = new Scanner(System.in);//reads user input
		System.out.print("Please input student 2's GPA: ");
		std2.setGpa(scnr.nextDouble());//assigns user input
	 	System.out.print("Please input student 3's GPA: ");
	 	std3.setGpa(scnr.nextDouble());

		 //print results
		System.out.println(std2);

		System.out.println(std3);

		// ToDo 13: add comments and explain your code

		// ToDo 14: submit using a pull request.
	}

}

