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
public class Beverage {
    //Data members
    private String beverageId;
    private String beverageName;
    private double price;
    private int volume;
      
    private static int nextId = 1;
        
    //Default Constructor
    public Beverage() {
        this.beverageId =  null;
        this.beverageName = null;
        this.price = 0;
        this.volume = 0;
    }
    //Other Constructor
    public Beverage(String beverageName, double price, int volume){
        this.beverageId = generateId();
        this.beverageName = beverageName;
        this.price = price;
        this.volume = volume;
    }
    //Copy Constructor
    public Beverage(Beverage beverage){
        this.beverageId = beverage.beverageId;
        this.beverageName = beverage.beverageName;
        this.price = beverage.price;
        this.volume = beverage.volume;
    }
    /*
    *Generate the Beverage Ids
    */
    private String generateId(){
        String firstBeverage = "BOO";
        nextId++;
        firstBeverage += nextId;
        return firstBeverage;
    }
    /*
    *Calculate the price of the beverages
    */
    public double calcPrice(){
        if(volume < 500)
            return price;
        else
            return price*0.6;
    }
      
    public boolean equals(Beverage beverage){
        return this.beverageId.equals(beverage.beverageId) &&
               this.beverageName.equals(beverage.beverageName) &&
               this.price == (beverage.price) &&
               this.volume == (beverage.volume);
    }
        
    @Override
    public String toString(){
        String str = "";
        str += String.format("%s %s\n", "Beverage ID :", beverageId);
        str += String.format("%12s %s\n", "Beverage Name :", beverageName);
        str += String.format("%12s %s\n", "Beverage Price :", price);
        str += String.format("%12s %s\n", "Beverage :", volume);
        return str;
    }
    //The getters and setters
    public String getBeverageId(){
        return beverageId;
    }   
    public void setBeverageId(String beverageId){
        this.beverageId = beverageId;
    }  
    public String getBeverageName(){
        return beverageName;
    }    
    public void setBeverageName(String beverageName){
        this.beverageName = beverageName;
    }
    public double getPrice(){
        return price;
    }   
    public void setPrice(double price){
        this.price = price;
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }    
}