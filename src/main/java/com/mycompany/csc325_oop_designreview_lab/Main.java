/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import com.mycompany.csc325_oop_designreview_lab.school.Freshman;
import com.mycompany.csc325_oop_designreview_lab.school.Senior;
import com.mycompany.csc325_oop_designreview_lab.school.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author MoaathAlrajab
 * @author MatthewDeSouza
 */
public class Main {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Separate the creation of the Student List into its own helper method to organize driving the code.
        List<Student> list = createStudentList();

        // Iterate through the student list, prompting the user to set the gpa for each student within the list.
        for (Student student : list) {
            System.out.printf("Please enter the gpa for %s: ", student.getName());
            // Unchecked InputMismatchException here should the input not be of type Number.
            student.setGpa(input.nextFloat());
            // Consume the newline character.
            input.nextLine();
        }

        // Not required: additional code to set the address of the students in the list.
        for (Student student : list) {
            System.out.printf("Please enter the address for %s: ", student.getName());
            student.setAddress(input.nextLine());
        }

        // Print the students from the list utilizing a method reference.
        list.forEach(System.out::println);
    }

    private static List<Student> createStudentList() {
        List<Student> list = new ArrayList<>();

        // Add students here.
        list.add(new Freshman("James", (short) 20, 12));
        list.add(new Senior("John", (short) 30, 90));
        return list;
    }

}