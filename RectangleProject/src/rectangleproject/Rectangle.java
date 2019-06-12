/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleproject;

/**
 *
 * @author rockm
 */
public class Rectangle {
    private double length;
    private double width;
    
    /**
     * Sets the length of a rectangle.
     * 
     * Precondition: len must be positive
     * Postcondition: length is set to len
     * 
     * @param len  the value to set as length.
     */
    public void setLength(double len){
        length = len;
    }
    
    /**
     * Sets the width of a rectangle.
     * 
     * Precondition: wid must be positive
     * Postcondition: width is set to wid
     * 
     * @param wid the value to set as width.
     */
    public void setWidth(double wid){
       width = wid;
    }
    
    /**
     * Gets the length of a rectangle.
     * 
     * Precondition: none
     * Postcondition: none
     *
     * @return the length of the rectangle.
     */
    public double getLength(){
        return length;
    }
    
    /**
     * Gets the width of a rectangle.
     * 
     * Precondition: none
     * Postcondition: none
     * 
     * @return the width of the rectangle.
     */
    public double getWidth(){
        return width;
    }
    
    /**
     * Computes the area of a rectangle then returns it.
     * 
     * Precondition: none
     * Postcondition: none
     * 
     * @return the area of the rectangle.
     */
    public double getArea(){
        return length * width;
    }
}
