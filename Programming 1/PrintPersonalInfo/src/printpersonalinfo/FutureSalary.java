/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printpersonalinfo;

import java.util.Scanner;

/**
 *
 * @author Kosta Nikopoulos
 */
public class FutureSalary {
    
    /*
    ask the user the initial salary     e.e.:3500
    ask the user the annualincrease ratio       e.e.: 0.02
    ask the user after how many years the salary she/he want to check       e.e.: 1o
    */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter your initial salary: ");
        double intSalary = console.nextDouble();
        System.out.print("Please enter the annual increase ratio: ");
        double increaseRatio = console.nextDouble();
        System.out.println("After how many years:");
        int year = console.nextInt();
    }
}
