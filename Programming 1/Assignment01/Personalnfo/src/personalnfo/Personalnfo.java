/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalnfo;

import java.util.Scanner;

/**
 *
 * @author Kosta Nikopoulos
 */
public class Personalnfo {

        public static void main(String[] args) {
        //Input
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name = console.nextLine();
        System.out.print("Please enter your age:");
        int age = console.nextInt();
        System.out.print("Please enter your gender:");
        console.nextLine();
        String gender = console.nextLine();
        System.out.print("Please enter your department:");
        String department = console.nextLine();
        System.out.print("Please enter the value of PI (3.1415926):");
        double pi = console.nextDouble();

        //output
        System.out.printf("%-15s: %8s\n", "Name", name);
        System.out.printf("%-15s: %3d\n", "Age", age);
        System.out.printf("%-15s: %5s\n", "Gender", gender);
        System.out.printf("%-15s: %3s\n", "Department", department);
        System.out.printf("%-15s: %5.2f\n", "PI", pi);
    }   
}
