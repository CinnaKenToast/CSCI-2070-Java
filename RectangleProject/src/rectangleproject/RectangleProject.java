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
public class RectangleProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangle box = new Rectangle();
        
        box.setLength(10.0);
        box.setWidth(5.0);
        
        System.out.println("The length of the box is " + box.getLength());
        System.out.println("The width of the box is " + box.getWidth());
        System.out.println("The area of the box is " + box.getArea());
        
    }
    
}
