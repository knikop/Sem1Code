/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author Kosta Nikopoulos
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int digitScore = 85;
        char letterScore = toLetterScore(digitScore);
        printMessage(letterScore);
    }
    /**
     * To To take the digitScore in a range of 0 to 100 and 
     * then it will calculate the letterScore
     * @param digitScore the score that will be converted into a letter
     * @return the letter conversion of the score
     */
    public static char toLetterScore(double digitScore) {
        if(digitScore >= 90 && digitScore <=100){
            return 'A';
        }else if(digitScore >= 80 && digitScore > 90) {
            return 'B';
        }else if(digitScore >= 70 && digitScore > 80){
            return 'C';
        }else if(digitScore >= 60 && digitScore > 70){
            return 'D';
        }else if(digitScore > 60 && digitScore <= 0) {
            return 'F';
        }
        return toLetterScore(digitScore);
    }
    /**
     * To take a letter representing a number and print it as a message
     * @param letterScore The message that will be printed
     */
    public static void printMessageSwitch(char letterScore) {
        switch (letterScore) {
            case 'a':
                System.out.println("Excellent");
                break;
            case 'b':
            case 'c':
                System.out.println("well done");
                break;
            case 'd':
                System.out.println("You passed");
                break;
            case 'f':
                System.out.println("Mission Failed: You'll get' em next time");
                break;
        }
    }
    /**
     * To take the letterScore and 
     * then print a message based on the score of a person/student
     * @param letterScore The letter that will be printed as a word(i.e. Excellent)
     */
    public static void printMessage(char letterScore) {
        if(letterScore == 'a')
            System.out.println("Excellent");
        else if(letterScore == 'b' || letterScore == 'c')
            System.out.println("Well done");
        else if(letterScore == 'd')
            System.out.println("You passed");
        else if(letterScore == 'f')
            System.out.println("Mission Failed: You'll get' em next time");
    }
}