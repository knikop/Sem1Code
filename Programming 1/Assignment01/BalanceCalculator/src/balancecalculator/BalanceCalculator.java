/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancecalculator;

import java.util.Scanner;

/**
 *
 * @author Kosta Nikopoulos
 */
public class BalanceCalculator {
   
        public static void main(String[] args) {
        //Input
        Scanner console = new Scanner(System.in);
        
        System.out.print("Please enter the initial balance: ");
        double initialBalance = console.nextDouble();
        System.out.print("Please enter the annual interest rate (2 for 2%): ");
        double air = console.nextDouble();
        //air ------- stands for annual interest rate
        System.out.print("Please enter the number of years the client wants"
                         + " to save the money in the bank for: ");
        int year = console.nextInt();
        
        //Calculations
        double futureBalance =  initialBalance * Math.pow((100 + air)/100, year); 
        
       //Output
        System.out.printf("%-30s:%.2f\n", "Initial Balance ", initialBalance);
        System.out.printf("%-30s:%.2f%%\n", "Annual Interest Rate ", air);
        System.out.printf("%-30s:%d\n", "Saving years", year);
        System.out.println("------------------------------------------\n");
        System.out.printf("%-30s:%.2f\n",
                  String.format("Balance after 5 years ", year), futureBalance);
    }    
}
