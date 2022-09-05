/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author Kosta Nikopoulos
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int month = 8;
        int year = 3000;
        int numDays = 0;
        
        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        ||(year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
                default:
                    System.out.println("Invalid month.");
                    break;
        }
        System.out.println("Number of Days = " + numDays);
}
    /**
     * To calculate the number of days in the month given
     * @param month the number of days in a month
     * @param year the you wanted to check
     * @return the number of days in that month
     */
    public static int calcDays(int month,int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month ==8
                    || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }else if (isLeapYear(year)) {
            return 28;
        } else {
            return 29;
        }
    }
    
    /**
     * To check if a year is a leap year or not
     * @param year the year you want to check
     * @return if the year given is a leap year
     */
    public static boolean isLeapYear(int year) {
       if(year % 100 != 0)
           return true;
       else if(year % 4 != 0)
           return false;
       else if(year % 400 != 0)
           return false;
       return true;
    }     
}