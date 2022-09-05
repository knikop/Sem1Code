/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

/**
 *Calender class
 * @author Kosta Nikopoulos
 */
public class Calendar {
    int year;
    int month;
    int day;
    /**
     * Default constructor
     */
    public Calendar(){
        this.year = 2020;
        this.month = 1;
        this.day = 1;
    }
    /**
     * Constructor with year, month, and day
     * @param year
     * @param month
     * @param day 
     */
    public Calendar(int year,int  month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    /**
     * Copy constructor
     * @param cal the abbreviated term for Calendar 
     */
    public Calendar(Calendar cal) {
        this.year = cal.year;
        this.month = cal.month;
        this.day = cal.day;
    }
    /*
    *takes in a month and returns the days in said month
    */
    private int getDaysInMonth(int month, int year) {
        int[] daysInMonth = new int[12];
        
             daysInMonth[0] = 31;
       // for the month of February (since february has 29 days if its a leap year)
        if (isLeapYear(year))
         daysInMonth[1] = 29;
        else
         daysInMonth[1] = 28;
        daysInMonth[2] = 31;
        daysInMonth[3] = 30;
        daysInMonth[4] = 31;
        daysInMonth[5] = 30;
        daysInMonth[6] = 31;
        daysInMonth[7] = 31;
        daysInMonth[8] = 30;
        daysInMonth[9] = 31;
        daysInMonth[10] = 30;
        daysInMonth[11] = 31;

        return daysInMonth[month - 1];
    }
    /*
    *Increases the day
    */
    public void increaseDay(){
        day++;
        if (day>getDaysInMonth(month, year)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }
    /*
    *Increases the month
    */
    public void increaseMonth() {
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
    }
    /*
    *Increases the year
    */
    public void increaseYear(){
        year++;
    }
    /*
    *checks to see if the year is a leap year or not
    */
    public boolean isLeapYear(int year){
        return ((year % 4 == 0&&year%100!=0)||(year%400==0));
    }
    /**
     * returns the year
     * @return the year inputed 
     */
    public int getYear(){
        return year;
    }
    /**
     * Sets the year
     * @param year sets the year to the year inputed
     */
    public void setYear(int year){
        this.year = year;
    }
    /**
     * returns the month
     * @return the year inputed 
     */
    public int getMonth(){
        return month;
    }
    /**
     * Sets the month
     * @param month sets the month to the month inputed
     */
    public void setMonth(int month){
        this.month = month;
    }
    /**
     * returns the day
     * @return the day inputed
     */
    public int getDay(){
        return day;
    }
    /**
     * Sets the day
     * @param day sets the day to the day inputed
     */
    public void setDay(int day){
        this.day = day;
    }
    /**
     * Prints the month, the day and then the year
     * @return the String month/day/year
     */
    @Override
    public String toString(){
        return month+"/"+day+"/"+year;
    }
    /**
     *Checks to see if day, month and year are equal or not
     * @param object the object
     * @return The day, month ,& year on another calendar
     */
    @Override
    public boolean equals(Object object){
        if (this == object) {
            return true;
        }if(object == null){
            return false;
        }
        Calendar other = (Calendar) object;
        return day == other.day&&month == other.month&&year == other.year;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.year;
        hash = 29 * hash + this.month;
        hash = 29 * hash + this.day;
        return hash;
    }
}