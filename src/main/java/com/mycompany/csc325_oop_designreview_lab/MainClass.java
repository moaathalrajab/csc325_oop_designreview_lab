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
                Scanner scan = new Scanner(System.in);
		// ToDo 5: Fix the error (Done)

		// ToDo 6: Fix the constructor of Student class (Done)

                // Todo 7: Create two classes for Freshman and Senior (Done)

                // ToDo 8: The senior class should have a minimum of 85 credits  (Done)

		// ToDo 7: Add a toString method for Student class (Done)
		// ToDo 9: Add a toString method for Freshman class (Done)
                
                //Create a Student Object
		Student std1= new Student("James", 20, 3.7);
                // ToDo 10: Add a toString method for Senior class (Done)
                //Create a Freshman object
		Student fresh1 = new Freshman("James", 20, 3.0, 17); // name, age, gpa, credits for freshman
                
                //Create a Senior object
                Student senior1 = new Senior("John", 30, 3.6, 90); // name, age, gpa, credits for senior

		// ToDo 8: Set the gpa of the student using the scanner and user (Done)
                //Ask user to set Freshman GPA
                System.out.println("Set the gpa for Freshman.");
                double gpa = scan.nextDouble();
                fresh1.setGpa(gpa);
                
                //Ask user to set Senior GPA
                System.out.println("Set the gpa for Senior.");
                gpa = scan.nextDouble();
                senior1.setGpa(gpa);
		// ToDo 11: Set the gpa of the student using the scanner and user (Done)
		// 			input and then print the output.
                
                //Output Freshman and Senior Information
                System.out.println(fresh1.getGpa());
                System.out.println(senior1.getGpa());

		System.out.println(fresh1);

                System.out.println(senior1);

		// ToDo 9: add comments and explain your code
		// ToDo 12: add comments and explain your code

		// ToDo 10: submit using a pull request.
		// ToDo 13: submit using a pull request.
	}

}

