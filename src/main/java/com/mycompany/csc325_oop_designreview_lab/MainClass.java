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

		// ToDo 6: Fix the constructor of Student class

                // Todo 7: Create two classes for Freshman and Senior 

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 7: Add a toString method for Student class
		// ToDo 9: Add a toString method for Freshman class

		Student std1= new Student("James", (short)20);
                // ToDo 10: Add a toString method for Senior class

		Student std2= new Freshman("James", (short)20, 12); // name, age, credits

                Student std3 = new Senior("John", (short)30, 90);

		// ToDo 8: Set the gpa of the student using the scanner and user
		// ToDo 11: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
                
                //Creating a scanner
                Scanner scnr = new Scanner(System.in);
                
                //Asking to enter GPA of first student
                System.out.println("Please enter the student GPA: ");
                double x = scnr.nextInt();
                std3.setGPA(x);
                
                //Asking to enter GPA of the second student
                System.out.println("Please enter the student GPA: ");
                double y = scnr.nextInt();
                std3.setGPA(y);
                
		System.out.println(std2);

                System.out.println(std3);

		// ToDo 9: add comments and explain your code
		// ToDo 12: add comments and explain your code

		// ToDo 10: submit using a pull request.
		// ToDo 13: submit using a pull request.
	}

}

