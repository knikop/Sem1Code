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
public class Bill {
    //Data members
    private Combo combo;
    private Customer customer;
    private double originalPrice;
    private double discountedPrice;
    private Tax tax;
    private double finalPrice;
        
    //Default Constructor
    public Bill(){
        this.combo = null;
        this.customer = null;
        this.originalPrice = 0;
        this.discountedPrice = 0;
        this.tax = null;
        this.finalPrice = 0;
    }
    //Other Constructor
    public Bill(Dish dish, Beverage beverage, Customer customer, Tax tax){
        this.customer = customer;
        this.combo = new Combo(dish, beverage);
        this.originalPrice = combo.calcComboPrice(finalPrice, originalPrice);
        this.discountedPrice = calcPriceWithDiscount();
        this.tax = tax;
        this.finalPrice = calcFinalPrice() + tax.getTotalTax();
    }
    //Copy Constructor
    public Bill(Bill bill){
        this.combo = bill.combo;
        this.customer = bill.customer;
        this.originalPrice = bill.originalPrice;
        this.discountedPrice = bill.discountedPrice;
        this.tax = bill.tax;
        this.finalPrice = bill.finalPrice;
    }
    /*
    *Calculates the discount price
    */
    public double calcPriceWithDiscount(){
        switch (customer.getVipLevel()) {
            case 0:
                return combo.calcComboPrice(finalPrice, originalPrice);
            case 1:
                return combo.calcComboPrice(finalPrice, originalPrice)*9.5;
            case 2:
                return combo.calcComboPrice(finalPrice, originalPrice)*0.9;
            case 3:
                return combo.calcComboPrice(finalPrice, originalPrice)*0.85;
            default:
                break;
        }
        return combo.calcComboPrice(finalPrice, originalPrice);
    }
    /*
    *Calculates the tax added onto the price
    */
    public double calcTax(){
        double fedTax = 0;
        double proTax = 0;
        double totalTax;
        totalTax = ((fedTax *0.05) + (proTax * 0.1));
        return totalTax;
    }
    /*
    *To calculate the final price that the customer has to pay
    */
    public double calcFinalPrice(){
        return discountedPrice + calcTax();
    }
    /*
    *Uptade the customer's points
    */
    public int updatePoints(){
        if(finalPrice != 10) {
            return customer.getPoint();
        }
        return customer.getPoint();
    }
    
    public boolean equals(Bill bill){
        return this.combo.equals(bill.combo) && 
               this.customer.equals(bill.customer) &&
               this.originalPrice == bill.originalPrice &&
               this.discountedPrice == bill.discountedPrice &&
               this.tax.equals(bill.tax) &&
               this.finalPrice == bill.finalPrice;
    }
    @Override
    public String toString(){
        return "" + combo+"\n******************************\n"+customer+
                "\nOriginalPrice:$" + originalPrice + "\nDiscountedPrice:$"
                +tax+ "\nFinalPrice: $" + finalPrice+ "";
    }
    //The getters and setters
    public Combo getCombo(){
        return combo;
    }
    public void setCombo(Combo combo){
        this.combo = combo;
    }
    public Customer getCustomer(){
        return customer;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    public double getOriginalPrice(){
        return originalPrice;
    }
    public void setOriginalPrice(double originalPrice){
        this.originalPrice = originalPrice;
    }
    public double getDiscountPrice(){
       return discountedPrice;
    }
    public void setDiscountPrice(double discountedPrice){
        this.discountedPrice = discountedPrice;
    }
    public Tax getTax(){
        return tax;
    }
    public void setTax(Tax tax){
        this.tax = tax;
    }
    public double getFinalPrice(){
        return finalPrice;
    }
}