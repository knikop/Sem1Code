/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplestatisticcalculator;

import java.util.Scanner;

/**
 *
 * @author Kosta Nikopoulos
 */
public class SimpleStatisticCalculator {
   
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //Input
        System.out.print("Please input 5 numbers seperated by space: ");
        String numList = console.nextLine();
        //Calculations
        //Extract each of the 5 numbers
        String firstNumber = numList.substring(0, 1);
        String secondNumber = numList.substring(2, 3);
        String thirdNumber = numList.substring(4, 5);
        String fourthNumber = numList.substring(6, 7);
        String fifthNumber = numList.substring(8, 9);
       //Convert each of the previously extracted numbers into integers 
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);
        double num3 = Double.parseDouble(thirdNumber);
        double num4 = Double.parseDouble(fourthNumber);
        double num5 = Double.parseDouble(fifthNumber);
        //Calculate the average
        double mean = (num1 + num2 + num3 + num4 + num5) / 5;
        //Calcutale min and max
        double a = Math.max(num1, num2);
        double b = Math.max(num3, num4);
        double c = Math.max(num5, a);
        double max = Math.max(c, b);
        double d= Math.max(num1, num2);
        double e = Math.max(num3, num4);
        double f = Math.max(num5, d);
        double min = Math.max(f, e);
        //calculate the standard deviation
        double sum = 0;
        sum = sum + (Math.pow(Math.abs(num1 - mean), 2));
        sum = sum + (Math.pow(Math.abs(num2 - mean), 2));
        sum = sum + (Math.pow(Math.abs(num3 - mean), 2));
        sum = sum + (Math.pow(Math.abs(num4 - mean), 2));
        sum = sum + (Math.pow(Math.abs(num5 - mean), 2));
        double sd = Math.sqrt(sum / 5);
        //Output
        System.out.printf("%-15s%10%.2f, %.2f, %.2f, %.2f, %.2f\n", "Numbers",
                ": ", num1, num2, num3, num4, num5);
        System.out.printf("%-15s%10%.2f\n", "Mean", ": ", mean);
        System.out.printf("%-15s%10%.2f\n", "Minimum", ": ", min);
        System.out.printf("%-15s%10%.2f\n", "Maximum", ": ", max);
        System.out.printf("%-20s%5%.2f\n", "Standard Deviation", ": ", sd);
    }  
}
        
   

          
