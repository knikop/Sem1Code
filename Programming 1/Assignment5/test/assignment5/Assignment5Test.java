/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kosta Nikopoulos
 */
public class Assignment5Test {
    
    public Assignment5Test() {
    }

    /**
     * Test of main method, of class Assignment5.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Assignment5.main(args);        
    }

    /**
     * Test of generateAlphabetString method, of class Assignment5.
     */
    @Test
    public void testGenerateAlphabetString() {
        System.out.println("generateAlphabetString");
        int num = 0;
        char caseType = ' ';
        String expResult = "";
        String result = Assignment5.generateAlphabetString(num, caseType);
        assertEquals(expResult, result);
    }

    /**
     * Test of hideCharacter method, of class Assignment5.
     */
    @Test
    public void testHideCharacter() {
        System.out.println("hideCharacter");
        String str = "";
        int idx = 0;
        String expResult = "";
        String result = Assignment5.hideCharacter(str, idx);
        assertEquals(expResult, result);       
    }

    /**
     * Test of containsIgnoreCase method, of class Assignment5.
     */
    @Test
    public void testContainsIgnoreCase() {
        System.out.println("containsIgnoreCase");
        String str = "";
        char c = ' ';
        boolean expResult = false;
        boolean result = Assignment5.containsIgnoreCase(str, c);
        assertEquals(expResult, result);        
    }

    /**
     * Test of encode method, of class Assignment5.
     */
    @Test
    public void testEncode() {
        System.out.println("encode");
        String strin = "";
        int delta = 0;
        String expResult = "";
        String result = Assignment5.encode(strin, delta);
        assertEquals(expResult, result);        
    }  
}