/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseconverter;

import java.util.Scanner;

/**
 *
 * @author Kosta Nikopoulos
 */
public class CaseConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Input
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String words = console.nextLine();
        System.out.print("Please chose the case you want to convert: ");
        char caseType = console.next().charAt(0);
        //Output
        System.out.println("1. 'l' or 'L' for lowercase");
        System.out.println("2. 'u' or 'U' for uppercase");
        System.out.println("3. 't' or 'T' for titlecase");
        System.out.println("u");
        System.out.println(" ");
        System.out.printf("%-40s:%10s\n", "Original Word", words);
        System.out.printf("%-40s:%10s\n",
           "Calling the first convertCase method: ", convertCase(words));
        System.out.printf("%-40s:%10s\n",
           "Calling the second convertCase method: ", convertCase(words, caseType));  
    }
    /**
     * Converting to TitleCase
     * @param words the word first inputed
     * @return the word in TitleCase
     */
    public static String convertCase(String words) {
        return String.valueOf(Character.toTitleCase(words.charAt(0))) 
                + words.substring(1);
    }
    /**
     * convert the characters of the word into lower, upper ,or title case
     * @param words the word first inputed
     * @param caseType the case of the characters(lower, upper, or title case)
     * @return the character in the specified case
     */
    public static String convertCase(String words, char caseType) {
        switch (caseType) {
            case 'l':
            case 'L':
                return words.toLowerCase();
            case 'u':
            case 'U':
                return words.toUpperCase();
            case 't':
            case 'T':
                return String.valueOf(Character.toTitleCase(words.charAt(0))) 
                + words.substring(1);
        }
        return convertCase(words, caseType);          
    }
}
