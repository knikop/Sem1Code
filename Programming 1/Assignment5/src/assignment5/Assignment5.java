/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author Kosta Nikopoulos
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Task1
        System.out.println(generateAlphabetString(3, 'u'));
        System.out.println(generateAlphabetString(6, 'l'));
        System.out.println(generateAlphabetString(-3, 'L'));
        System.out.println(generateAlphabetString(27, 'U'));
        //Task2
        System.out.println(hideCharacter("hello", 3));
        System.out.println(hideCharacter("java", 1));
        System.out.println(hideCharacter("hmmm", 4));
        System.out.println(hideCharacter("hmmm", -3));
        //Task3
        System.out.println(containsIgnoreCase("hello",'H'));
        System.out.println(containsIgnoreCase("java",'A'));
        System.out.println(containsIgnoreCase("hmmm",'A'));
        System.out.println(containsIgnoreCase("",'a'));
        System.out.println(containsIgnoreCase("WoW!",'!'));
        //Task4
        System.out.println(encode("hello", 1));
        System.out.println(encode("java", -1));
        System.out.println(encode("hmmm", 3));
        System.out.println(encode("Yeah!", -2));
        System.out.println(encode("", 5));
    }
    /**
     * To generate a string of alphabetical letters and output them in the indicated case
     * @param num the number of alphabetical letters that will be generated
     * @param caseType whether the letter will be uppercase or lowercase
     * @return the string of letters in the appropriate case type
     */
    public static String generateAlphabetString(int num, char caseType) {
        if (num <= 0) 
            return "";
        char ch = ' ';
            if (caseType == 'l'|| caseType == 'L') 
                ch = 'a';
            else if (caseType == 'u' || caseType == 'U')            
                ch= 'A';
            char temp = ch;
            String s = "";
            for (int i = 0; i < num; i++) {   
                if (i%26 == 0) 
                ch = temp;
                    s= s + ch;
                ch ++;
        }
    return s;     
    }
    /**
     * To hide the characters and display them as dashes while the index value is visible
     * @param str  the string that will be hidden 
     * @param idx  the index value that will remain visible
     * @return  the modified string
     */
    public static String hideCharacter(String str, int idx) {
	int len = str.length();
	if(idx>=len || idx<0){
	System.out.println(str);
	} else {
	for(int i=0; i<len; i++) {
	if(i!=idx) {
	System.out.print("-");
	} else {
	System.out.print(str.charAt(idx));
	}
        }
        }
    return "";
    }
    /**
     * Checks if the string has a character or not and ignores the case of the char and string
     * @param str  the string being used 
     * @param c  the character being checked 
     * @return true if the string contains the character and false if its not contained
     */
    public static boolean containsIgnoreCase(String str ,char c) {
        for(int i=0;i<str.length();i++) {  
        if(Character.toUpperCase(str.charAt(i))==Character.toUpperCase(c)) {
        return true;
        }
        }
        return false;
    }
    /**
     * Encoding each character were the letter is shifted by 1 position
     * @param strin  the word being encoded
     * @param delta  the number of position the letter is moving
     * @return  the encode word
     */
    public static String encode(String strin, int delta) {
        String encyrpted = "";
        for (char letter : strin.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                encyrpted += (char) ('A' + ((int) (letter) + delta - 'A') % 26);
            } else if (Character.isLowerCase(letter)) {
                encyrpted += (char) ('a' + ((int) (letter) + delta - 'a') % 26);
            } else {
                encyrpted += letter;
            }
        }
        return encyrpted;
    }
}