/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;

/**
 *
 * @author Kosta Nikopoulos
 */
public class Tax {
    //Data members
    private double fedTax;
    private double proTax;
    private double totalTax;

    //Default Constructor
    public Tax(){
        this.fedTax = 0;
        this.proTax = 0;
        this.totalTax = 0;
    }
    //Other Constructor
    public Tax(double fedTax, double proTax, double totalTax){
        this.fedTax = fedTax;
        this.proTax = proTax;
        this.totalTax = totalTax;
    }
    //Copy Constructor
    public Tax(Tax tax){
        this.fedTax = tax.fedTax;
        this.proTax = tax.proTax;
        this.totalTax = tax.totalTax;
    }

    public boolean equals(Tax tax){
        return this.fedTax == tax.fedTax &&
               this.proTax == tax.proTax &&
               this.totalTax == tax.totalTax;
    }

    @Override
    public String toString(){
        String str = "";
        str += String.format("%s %s\n", "Fed Tax", fedTax);
        str += String.format("%s %s\n", "Pro Tax", proTax);
        str += String.format("%s %s\n", "Total Tax", totalTax);
        return str;
    }
    //The getters and setters
    public double getfedTax(){
        return fedTax;
    }

    public void setFedTax(double fedTax){
        this.fedTax = fedTax;
    }
    public double getproTax(){
        return proTax;
    }

    public void setProTax(double proTax){
        this.proTax = proTax;
    }

    public double getTotalTax(){
        return totalTax;
    }

    public void setTotalTax(double totalTax){
        this.totalTax = totalTax;
    }   
}