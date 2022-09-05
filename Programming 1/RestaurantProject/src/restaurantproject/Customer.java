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
public class Customer {
    //Data members
    private String customerId;
    private String name;
    private int vipLevel;
    private int point;

    private static int nextId = 1;

    //Default constructor
    public Customer(){
        this.customerId = null;
        this.name = null;
        this.vipLevel = 0;
        this.point = 0;
    }
    //Other Constructor
    public Customer(String name, int vipLevel, int point){
        this.customerId = null;
        this.name = name;
        this.vipLevel = vipLevel;
        this.point = point;
    }
    //Copy Constructor
    public Customer(Customer customer){
        this.customerId = customer.customerId;
        this.name = customer.name;
        this.vipLevel = customer.vipLevel;
        this.point = customer.point;
    }
    /*
    *Generate the Customer Ids
    */
    private String generateId(){
        String firstCustomer = "COO";
        nextId++;
        firstCustomer += nextId;
        return firstCustomer;
    }
    /*
    *Update the customer's VIP Level
    */
    public boolean vipLevel(){
        switch (point) {
            case 1:
                vipLevel = 50;
                break;
            case 2:
                vipLevel = 80;
                break;
            case 3:
                vipLevel = 100;
                break;
            default:
                return false;
        }
        return true;
    }
    public boolean equals(Customer customer){
        return this.customerId.equals(customer.customerId) &&
               this.name.equals(customer.name) &&
               this.vipLevel == customer.vipLevel &&
               this.point == customer.point;
    }
    @Override
    public String toString(){
        String str = "";
        str += String.format("%s, %s\n", "Customer ID", customerId);
        str += String.format("%s, %s\n", "Name", name);
        str += String.format("%s, %s\n", "VIP Level", vipLevel);
        str += String.format("%s, %s\n", "Points", point);
        return str;
    }
    //The getters and setters
    public String getCustomerId(){
        return customerId;
    }
    public void setCustonerId(String customerId){
        this.customerId = customerId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getVipLevel(){
        return vipLevel;
    }
    public void setVipLevel(int vipLevel){
        this.vipLevel = vipLevel;
    }
    public int getPoint(){
        return point;
    }
    public void setPoint(int point){
        this.point = point;
    }
}