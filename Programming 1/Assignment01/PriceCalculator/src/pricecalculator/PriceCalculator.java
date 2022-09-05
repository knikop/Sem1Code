/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricecalculator;

import java.util.Scanner;

/**
 *
 * @author Kosta Nikopoulos
 */
public class PriceCalculator {

        public static void main(String[] args) {
        //Input
        Scanner console = new Scanner(System.in);
        System.out.print("Please the item price: ");
        double price = console.nextDouble();
        System.out.print("Please enter the discount ratio (5 for 5%): ");
        double discount = console.nextDouble();
        
        //Calculations
        double disDecimal = price * ( discount / 100 );
        double disPrice = price - disDecimal;
        double federal = 0.05;
        double provincial = 0.09975;
        double fedTax = disPrice * federal;
        double provTax = disPrice * provincial;
        double finalPrice = disPrice + fedTax + provTax;
        
        //Output
        System.out.printf("%-20s: %.2f\n", "Original Price", price );
        System.out.printf("%-20s: %.2f%%\n", "Discount Ratio", discount );
        System.out.printf("%-20s: %.2f\n", "Price Before Tax", disPrice );
        System.out.printf("------------------------------------------\n" );
        System.out.printf("%-20s: %.2f\n", "Federal Tax", fedTax );
        System.out.printf("%-20s: %.2f\n", "Provincial Tax", provTax );
        System.out.printf("%-20s: %.2f\n", "Final Price", finalPrice); 
    }    
}
