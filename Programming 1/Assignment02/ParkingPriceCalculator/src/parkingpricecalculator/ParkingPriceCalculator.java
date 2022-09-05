/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingpricecalculator;

import java.util.Scanner;

/**
 *
 * @author Kosta Nikopoulos
 */
public class ParkingPriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Input
        Scanner console = new Scanner(System.in);
        System.out.print("Please input the number of minutes your car has"
                         + " parked: ");
        int minutes = console.nextInt();
        //Calculations
        // minToHrs stands for minutes to hours
        int minToHrs = (minutes/60) + 1;
        double parkingPrice = minToHrs * 2;
        //Output
        System.out.printf("%-30s:%5d\n", "Parking time in minutes", minutes);
        System.out.printf("%-30s:%3d\n", "Parking time in minutes", minToHrs);
        System.out.printf("%-30s:%6.2f\n", "Price", parkingPrice);
        }    
}
