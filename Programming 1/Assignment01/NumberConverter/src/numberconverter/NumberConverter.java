/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberconverter;

import java.util.Scanner;



/**
 *
 * @author Kosta Nikopoulos
 */
public class NumberConverter {

        public static void main(String[] args) {
        //Input
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a 4-digit Octal number: ");
        int octalNum = console.nextInt();
        
        //Calculations
        int firstDigit = octalNum % 10;
        int secondDigit = octalNum / 10 % 10;
        int thirdDigit = octalNum / 100 % 10;
        int fourthDigit = octalNum / 1000 % 10;
        int decimalNum = (int) (  fourthDigit * Math.pow(8, 3)
                            + thirdDigit * Math.pow(8,2) 
                            + secondDigit * Math.pow(8,1) 
                            + firstDigit * Math.pow(8,0));
        //Output
        System.out.printf("%-15s%d\n", "Octal Number    :", + octalNum);
        System.out.printf("%-15s%d\n", "Decimal Number  :", + decimalNum);
    }   
}
