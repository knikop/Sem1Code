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
public class Combo {
    //Data members
    private Dish dish;
    private Beverage beverage;

    //Default Constructor
    public Combo(){
        this.dish = null;
        this.beverage = null;
    }
    //Other Constructor
    public Combo(Dish dish, Beverage beverage){
        this.dish = dish;
        this.beverage = beverage;
    }
    //Copy Constructor
    public Combo(Combo combo){
        this.dish = combo.dish;
        this.beverage = combo.beverage;
    }
    /*
    *Calculate the price of the combos
    */
    public double calcComboPrice(double calcPrice, double calcDishPrice){
        double BeverageDishCombo = (calcPrice + calcDishPrice)*0.9;
        return BeverageDishCombo;
    }

    public boolean equals(Combo combo){
        return  
            this.dish.equals(combo.dish) && 
            this.beverage.equals(combo.beverage);
    }

    @Override
    public String toString(){
        return "Dish:\n" +dish +"\nBeverage:\n" +beverage+ "";
    }
    //The getters and setters
    public Dish getDish(){
        return dish;
    }
    public void setDish(Dish dish){
        this.dish = dish;
    }
    public Beverage getBeverage(){
        return beverage;
    }
    public void setBeverage(Beverage beverage){
        this.beverage = beverage;
    }
}