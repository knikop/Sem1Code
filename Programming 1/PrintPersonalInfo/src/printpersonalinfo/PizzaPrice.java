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
public class PizzaPrice {

    public static void main(String[] args) {
        
        //input
        Scanner console = new Scanner(System.in);
        System.out.print("How many kinds of meat/cheese do you want:");
        int meat = console.nextInt();
        System.out.println("How many kinds of vege do you want:");
        int vege = console.nextInt();
        System.out.println("How far do you live (km): ");
        double distance = console.nextDouble();
        
        //processing
        double doughtBasePrice = 2 ;
        double meatBasePrice =  3;
        double vegeBasePrice =  1.5;              //pro: re-use the code
                                                    //con: longer, uses more memory
        
        double distanceBasePrice = 0.732;        
        double containerPrice = 0.5;
        double finalPrice = doughtBasePrice + meat * meatBasePrice + 
                vege * vegeBasePrice + distance * distanceBasePrice;
              
        //output
        
        System.out.printf("%-15s%d\n", "Meat/Cheese", meat);
        System.out.printf("%-15s%d\n", "Vege", vege);
        System.out.printf("%-15s%.1f\n", "Distance", distance);
        System.out.println("----------------------------");
        System.out.printf("%-15s%5.2f\n", "Final Price", finalPrice);                              
    }   
}
