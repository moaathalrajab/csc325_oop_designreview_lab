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

	public static void main(String[] args) throws Exception {

		// Creating instances of both the freshman and senior classes
		Freshman std1 = new Freshman("James", (short) 20, 12); // name, age, credits
		Senior std2 = new Senior("John", (short) 30, 90);

		// Printing out the students information using the toString method.
		System.out.println(std1);
		System.out.println();
		System.out.println(std2);

		// Creating an instance of the Scanner class to get user input
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter GPA for student 1: ");
		double userInput = scnr.nextDouble();
		std1.setGPA(userInput); // Setting student 1s GPA using user input.
		System.out.println(std1);

		System.out.println();

		System.out.println("Enter GPA for student 2: ");
		double userInputTwo = scnr.nextDouble();
		std2.setGPA(userInputTwo); // Setting student 1s GPA using user input.
		System.out.println(std2);

		System.out.println();
		scnr.close();

		// Testing if you can create an instance of Senior with less than 85 credits
		System.out.println("Testing if a senior can have less than 85 credits");
		Senior std3 = new Senior("Mike", (short) 22, 80);

	}

}
