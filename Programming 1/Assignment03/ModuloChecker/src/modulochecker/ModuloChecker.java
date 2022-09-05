/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulochecker;

import java.util.Scanner;

/**
 *
 * @author Kosta Nikopoulos
 */
public class ModuloChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Step 1
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a number and a base, separated by space: ");
        int num = console.nextInt();
        int base = console.nextInt();
        //Step 2
        if(isDivisible(num))
            System.out.println(num + " is divisible by " + 3);
        else if(isDivisible(num, base))
            System.out.println(num + " is divisible by " + base);
        else 
            System.out.println(num + " is not divisible");     
        //Step 3
        System.out.println(" ");
        System.out.print("Please enter an English letter: ");
        char letter = console.next().charAt(0);
        console.nextLine();       
        System.out.print("Please enter a number and an English letter base, separated by space: ");
        int numBase = console.nextInt();
        char letterBase = console.next().charAt(0);   
        //Step 4 (the ifs and the elses)
        if (isDivisible(letter, numBase))
            System.out.printf("\n'%c' %s %d\n", letter, "is divisible by", numBase);
        else
            System.out.printf("\n'%c' %s %d\n", letter, "is not divisible by", numBase);
        if (isDivisible(letter, letterBase))
            System.out.printf("'%c' %s '%c'\n", letter, "is divisible by", letterBase);
        else
            System.out.printf("'%c' %s '%c'\n", letter, "is not divisible by", letterBase);
    }  
    /**
     * takes an English letter and convert it into a number
     * @param c the letter being converted
     * @return the number as a result of the conversion
     */
    public static int letterToNumber(char c){
        c = Character.toLowerCase(c);
        return c - 'a';
    }
    /**
     * takes a number and sees if it can be divided by 3
     * @param num the number being used/inputed
     * @return the result of the division
     */
    public static boolean isDivisible(int num){
        return num % 3 == 0;
    }
    /**
     * takes a number and a base and checks if it can be divided by the base
     * @param num the first number
     * @param base the second number
     * @return the result of the divided base
     */
    public static boolean isDivisible(int num, int base){
        return num % base == 0;
    }
    /**
     * takes an English letter and then into a number and the checks if its divisible by 3
     * @param letter the letter thats being converted
     * @return the number thats the result of if its divided by 3
     */
    public static boolean isDivisible(char letter){
        return letterToNumber(letter) % 3 == 0;
    }
    /**
     * takes an English letter, converts it into a number and checks if said number can be divided by the base
     * @param letter the letter being converted
     * @param numBase the base number
     * @return the result of the division by the base numbers
     */
    public static boolean isDivisible(char letter, int numBase){
        return letterToNumber(letter) % numBase == 0;
    }
    /**
     * takes an English letter and converts it into a number and checks if that number is able to be divided by the base
     * @param letter the letter that is being converted into a number 
     * @param base the number that is used to divide the letter
     * @return the result of the letterToNumber method division
     */
    public static boolean isDivisible(char letter, char base){
        return letterToNumber(letter) % letterToNumber(base) == 0;
    }
}    

