/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 * @author Michael LaNasa
 */
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of Student class

                // Todo 7: Create two classes for Freshman and Senior 

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 7: Add a toString method for Student class
		// ToDo 9: Add a toString method for Freshman class

		Student std1= new Student("James", 20);
                // ToDo 10: Add a toString method for Senior class

		Student frsh1 = new Freshman("James", 20, 12); // name, age, credits

                Student std2 = new Senior("John", 30, 90);

		// ToDo 8: Set the gpa of the student using the scanner and user
		// ToDo 11: Set the gpa of the student using the scanner and user
		// 			input and then print the output.

                // create scanner object for user input
                Scanner s = new Scanner(System.in);
                
                // print instructions for user
                System.out.println("Enter GPA for student 1:");
                // store user input in variable
                double gpa = s.nextDouble();
                // set student GPA to user input
                std1.setGPA(gpa);
                
                // repeat instructions for student 2
                System.out.println("Enter GPA for student 2:");
                gpa = s.nextDouble();
                // set student GPA to user input
                std2.setGPA(gpa);
                
		System.out.println(std1);

                System.out.println(std2);

		// ToDo 9: add comments and explain your code
		// ToDo 12: add comments and explain your code

		// ToDo 10: submit using a pull request.
		// ToDo 13: submit using a pull request.
	}

}

