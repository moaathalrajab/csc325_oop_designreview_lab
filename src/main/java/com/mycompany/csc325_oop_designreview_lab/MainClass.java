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
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter GPA for Freshman James: ");
        double freshmanGPA = scanner.nextDouble();
        Freshman freshman = new Freshman("James", (short) 20, freshmanGPA, 12);

        System.out.print("Enter GPA for Senior John: ");
        double seniorGPA = scanner.nextDouble();
        System.out.print("Enter credits for Senior John: ");
        int seniorCredits = scanner.nextInt();
        System.out.println(freshman); // toString print of freshman

        // toString print of senior, catches exception if credits bellow 85
        try {
            Senior senior = new Senior("John", (short) 30, seniorGPA, seniorCredits);
            System.out.println(senior);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
