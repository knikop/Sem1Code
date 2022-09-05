/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthyearcalculator;

import java.util.Scanner;

/**
 *
 * @author Kosta Nikopoulos
 */
public class BirthYearCalculator {

    public static void main(String[] args) {
        //Input
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter your birth year: ");
        String birthYear = console.nextLine();
        //Calculations
        /**use the first 2 digits, convert them into integers and add
         *  then + 1 to calculate the century.
         */
        String firstTwoDigits = birthYear.substring(0,2);
        int century = Integer.parseInt(firstTwoDigits) + 1;
        /**use the 3rd digit, then convert it into an integer
         * then add + 0 as the 4th digit.
         */
        String firstDecadeDigit = birthYear.substring(2,3);
        int decade =  Integer.parseInt(firstDecadeDigit + 0);
        //Output
        System.out.printf("%-15s%s%s\n", "Birth Year", ": ", birthYear);
        System.out.printf("%-15s%s%s\n", "Century", ": ", century);
        System.out.printf("%-15s%s%s\n", "Decade", ": ", decade);
        }   
}
