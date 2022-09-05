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
public class Dish {
    //Data members
    private String dishId;
    private String dishName;
    private char size;
    private double price;
    private boolean spicy;
       
    private static int nextId = 1;
        
    //Default Constructor
    public Dish(){
        this.dishId = null;
        this.dishName = null;
        this.size = 0;
        this.price = 0;
        this.spicy = false;
    }
    //Other Constructor
    public Dish(String dishName, char size, double price, boolean spicy){
        this.dishId = null;
        this.dishName = dishName;
        this.size = size;
        this.price = price;
        this.spicy = spicy;
    }
    //Copy Constructor
    public Dish(Dish dish){
        this.dishId = dish.dishId;
        this.dishName = dish.dishName;
        this.size = dish.size;
        this.price = dish.price;
        this.spicy = dish.spicy;      
    }
    /*
    *Generate the Dish Ids 
    */
    private String generateId(){
        String firstDish = "DOO";
        nextId++;
        firstDish += nextId;
        return firstDish;
    }
    /*
    *Calculate the price of the dishes
    */
    public double calcDishPrice(){
        switch(size){
            case 0:
                return price * 1.2;
            case 1:
                return price;
            case 2:
                return price * 0.6;
            case 3:
                return price * 0.4;
        }
        return calcDishPrice();
    }
        
    public boolean equals(Dish dish){
        return this.dishId.equals(dish.dishId) &&
               this.dishName.equals(dish.dishName) &&
               this.size == (dish.size) &&
               this.price == (dish.price) &&
               this.spicy == (dish.spicy);
    }
        
    @Override
    public String toString(){
        String str = "";
        str += String.format("%s %s\n", "Dish ID :", dishId);
        str += String.format("%12s %s\n", "Dish Name :", dishName);
        str += String.format("%12s %s\n", "Dish Size:", size);
        str += String.format("%12s %s\n", "Dish Price :", price);
        str += String.format("%12s %s\n", "Spicy :", spicy); 
        return str;
    }
    //The getters and setters
      
    public String getDishId(){
        return dishId;
    } 
    public void setDishId(String dishId){
        this.dishId = dishId;
    }
    public String getDishName(){
        return dishName;
    }   
    public void setDishName(String dishName){
        this.dishName = dishName;
    }
    public char getSize(){
        return size;
    }    
    public void setSize(char size){
        this.size = size;
    }
    public double getPrice(){
        return price;
    }    
    public void setPrice(double price){
        this.price = price;
    }
    public boolean getSpicy(){
        return spicy;
    }    
    public void setSpicy(boolean spicy){
        this.spicy = spicy;
    }        
}