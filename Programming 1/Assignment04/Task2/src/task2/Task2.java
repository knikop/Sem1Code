/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Random;

/**
 *
 * @author Kosta Nikopoulos
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
    }
    /**
     * To calculate the average of the numbers defined by the integer plugged in
     * @param num the integer used in the equation
     * @return the average of the scores generated from the integer
     */
    public static double calcAverageScore(int num) {
        Random rand = new Random();
        int div = num;
        double score = 0;
        double total = 0;
        for (int i = 0; 1 < num; i++) {
            score = rand.nextInt(101);
            if (score >= 40) { 
                total = total + score;
            }else {
                div = div - 1;                          
            }
        }
        return total / div;
    }
}
