/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ellipse;

import java.util.Random;

/**
 *Ellipse class
 * @author Kosta Nikopoulos
 */
public class Ellipse {
  
    double majorAxis;
    double minorAxis;
    
    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }
    //randomlilly generate 2 numbers
    public Ellipse() {
        Random random = new Random();
        this.majorAxis = random.nextInt(6)+5;
        this.minorAxis = random.nextInt(6)+5;
    }
    //the copy constructor
    public Ellipse(Ellipse second) {
         this.minorAxis = second.minorAxis;
         this.majorAxis = second.majorAxis;
    }
    public double getMajorAxis() {
        return majorAxis;
    }
    public void setMajorAxis(double majorAxis) {
        if(isAxisValid(majorAxis)){
            this.majorAxis = majorAxis;
        }else{
            System.out.println("The new value has to be a positive.");
        }
    }
    public double getMinorAxis() {
        return minorAxis;
    }
    public void setMinorAxis(double minorAxis) {
        if (isAxisValid(minorAxis)) {
            this.minorAxis = minorAxis;
        }else{
            System.out.println("The new value has to be a positive.");
        }
    }
    //Calculate the area of the axices
    public double calcArea() {
        return Math.PI * this.minorAxis * this.majorAxis;
    }
    //Calculate the perimeter of the axices
    public double calcPerimeter() {
        return 2*Math.PI*Math.sqrt((Math.pow(this.minorAxis, 2) + Math.pow(this.majorAxis, 2)) / 2);
    }
    public boolean isCircle() {
        return this.majorAxis == minorAxis;
    }
    //Checks to see if the Axis works properly
    public boolean isAxisValid(double axis) {
        return axis <= 0;
    }
    /**
     *Checks to see if the axis are equal to each other or not  
     * @param object the object
     * @return the comparison of the major and minor axis
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) 
            return true;
        if (object == null||getClass() !=object.getClass())
            return false;
        Ellipse ellipse = (Ellipse) object;
        return Double.compare(ellipse.majorAxis, majorAxis) == 0 &&
                Double.compare(ellipse.minorAxis, minorAxis) == 0;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.majorAxis) ^ (Double.doubleToLongBits(this.majorAxis) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.minorAxis) ^ (Double.doubleToLongBits(this.minorAxis) >>> 32));
        return hash;
    }
    /**
     *Checks to see if the ellipse is a circle
     * @return Whether the ellipse is a circle or not
     */
    @Override
    public String toString() {
        if (isCircle()) {
            return "majorAxis   :" + majorAxis +
                    "\n minorAxis :" + minorAxis +
                    "\n Area :" + calcArea() +
                    "\n Perimeter;" + calcPerimeter() + 
                    "\n This ellipse is a circle.";
        }else{
             return "majorAxis   :" + majorAxis +
                    "\n minorAxis :" + minorAxis +
                    "\n Area :" + calcArea() +
                    "\n Perimeter;" + calcPerimeter() + 
                    "\n This ellipse is not a circle.";
        }
    }
}