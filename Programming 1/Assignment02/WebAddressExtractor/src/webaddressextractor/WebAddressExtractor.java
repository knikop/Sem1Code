/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webaddressextractor;

import java.util.Scanner;

/**
 *
 * @author Kosta Nikopoulos
 */
public class WebAddressExtractor {

    public static void main(String[] args) {
        //Input
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter your email address: ");
        String webAdress = console.nextLine();
        //Index
        int dot1 = webAdress.indexOf(".");
        int dot2 = webAdress.indexOf(".", dot1 + 1);
        //Strings(header/companyName/extension)
        String header = webAdress.substring(0, dot1);
        String companyName = webAdress.substring(dot1 + 1, dot2);
        String extension = webAdress.substring(dot2 + 1);
        //Output
        System.out.printf("%-15s%s%s\n", "Adress", ": ", webAdress.toLowerCase());
        System.out.printf("%-15s%s%s\n", "Heading", ": ", header.toLowerCase());
        System.out.printf("%-15s%s%s\n", "Company", ": ", companyName.toLowerCase());
        System.out.printf("%-15s%s%s\n", "Extension", ": ", extension.toLowerCase());
        }    
}
