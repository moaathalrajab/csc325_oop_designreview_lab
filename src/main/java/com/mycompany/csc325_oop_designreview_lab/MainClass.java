package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author Thuan Luu
 */
public class MainClass {

    public static void main(String[] args) {
        
        //Constructor calls
        Freshman std1 = new Freshman("Sarah", 15,"42 Michagan Dr",12);
        Senior std2 = new Senior("John", 18,"34 Pine Ave",90);

        //Create scanenr for input
        Scanner input = new Scanner(System.in);

        //Take inputs
        System.out.println("Set the gpa for students");
        System.out.println("Enter a number to set the GPA of student #1: ");
        double grade1 = input.nextDouble();
        System.out.println("Enter a number to set the GPA of student #2: ");
        double grade2 = input.nextDouble();

        //Set Student GPAs
        std1.setGPA(grade1);
        std2.setGPA(grade2);

        //Print results with calls to toString()
        System.out.println(std1);
        System.out.println(std2);
    }

}
