/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author Kosta Nikopoulos
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test 
        System.out.println(calcFutureSalary(3000, 12));        
    }
    /**
     * To calculate the future salary of a worker
     * If you work less than 5 years, then every year your salary will increase by 2%
     * If you work 5 or more years, then every year your salary will increase by 5%
     * @param currentSalary The Initial salary that you begin with
     * @param year number of years in the future that you want to calculate 
     * @return the future salary of the worker after the number of years
     */
    public static double calcFutureSalary(double currentSalary, int year) {
        if (year < 3) {
            return currentSalary * Math.pow(1 + 0.03, year);
        } else if (year >= 3 && year < 10) {
            return currentSalary * Math.pow(1 + 0.03, 2) * Math.pow(1 + 0.05, year - 2);
        } else if (year >= 10) {
            return currentSalary * Math.pow(1 + 0.03, 2) * Math.pow(1 + 0.05, year - 2) * Math.pow(1 + 0.08, year - 9);
        }
        return currentSalary;
    }
}
