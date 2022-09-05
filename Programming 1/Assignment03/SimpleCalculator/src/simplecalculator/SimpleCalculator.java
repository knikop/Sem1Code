/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import java.util.Scanner;

/**
 *
 * @author Kosta Nikopoulos
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Input
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter two numbers, separates by space: ");
        double num1 = console.nextDouble();
        double num2 = console.nextDouble();
        System.out.print("Please enter the operator (+, -, *, or /): ");
        char oper = console.next().charAt(0);
        console.nextLine();
        System.out.print("Please enter a formular, eg.: \"3.14 * 2\": ");
        String formula = console.nextLine();
        //Output
        System.out.println(" ");
        System.out.printf("%-15s: %.2f + %.2f = %.2f\n", 
                "Calling the first method", num1, num2, calcResult(num1, num2));
        System.out.printf("%-15s: %.2f %s %.2f = %.2f\n", 
        "Calling the second method", num1, oper, num2, calcResult(num1, num2, oper));
         System.out.printf("%-15s: %.2f %s %.2f = %.2f\n", 
                "Calling the third method", num1, oper, num2, calcResult(formula));
    }
    /**
     * Getting the result of the addition of 2 numbers
     * @param num1: the first number
     * @param num2: the second number
     * @return the result of the addition
     */
    public static double calcResult(double num1, double num2){
        return (num1 + num2); 
    }
    /**
     * Getting the result of the operation between 2 numbers
     * @param num1: the first number
     * @param num2: the second number
     * @param oper : the operation used in the equation
     * @return the results to the operations
     */
    public static double calcResult(double num1, double num2, char oper){
        switch (oper){ 
            case  '+':
             return num1 + num2;
            case '-':
             return num1 - num2;
            case  '*':
             return num1 * num2;
            case '/':
             return num1 / num2;
        }
        return calcResult(num1, num2, oper);
    }
    /**
     * String formula
     * @param formula first number divided by second number
     * @return The result of the division
     */
    public static double calcResult(String formula){
        String num1Form = formula.substring(0,formula.indexOf(" "));
        String operForm = formula.substring(formula.indexOf(" ") + 1);
        String num2Form = formula.substring(formula.indexOf(" ") + 2,
            formula.length());
        double num1FormDouble = Double.parseDouble(num1Form);
        char operFormChar = operForm.charAt(0);
        double num2FormDouble = Double.parseDouble(num2Form);
        
        switch (operFormChar) {
            case '-':
                return  num1FormDouble - num2FormDouble;
            case '/':
                return num1FormDouble / num2FormDouble;
            case '*':
                return num1FormDouble * num2FormDouble;
            default:
                return num1FormDouble + num2FormDouble;       
        }        
    }
}
