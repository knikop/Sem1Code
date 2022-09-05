/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printpersonalinfo;

/**
 *
 * @author Kosta Nikopoulos
 */
public class PrintPersonalInfo {
        public static void main(String[] args) {
        String name = "Yi Wang";
        int age = 33;
        String nation = "China";
        String Department = "CS";
        String position = "Teacher";
        
            System.out.printf("%-15s%s\n\n","Attribute", "Value");
            System.out.printf("%-15s%s\n", "Name: ", name);
            System.out.printf("%-15s%d\n", "Age: ", age);
            System.out.printf("%-15s%s\n", "Nationality: ", nation);
            System.out.printf("%-15s%s\n", "Department: ", Department);
            System.out.printf("%-15s%s\n", "Position: ", position);
                                                          
                 
            
                
    }
    
}
