//Kenneth Shipley
//CSCI 2070-08
//January 23, 2018
//This program converts square feet to a unit of "apsu"

package kennethshipley2070assignment02;

import java.util.Scanner;

/**
 * @author rockm
 */
public class KennethShipley2070Assignment02 {

    public static void main(String[] args) {
        
       int apsu = 96587;
       int length;
       int width;
       
       Scanner scan = new Scanner(System.in);
       
       System.out.println("This is Ken's sqaure feet to apsu converter");
       System.out.println("1 apsu = " + apsu + " square feet");
       
       System.out.print("Enter a length for a plot of land: ");
       length = scan.nextInt();
       
       System.out.print("Enter a width for a plot of land: ");
       width = scan.nextInt();
       
       int area = length * width;
       
       System.out.println("The plot of land you created has a total area of " + area + " square feet.");
    
       System.out.println("The plot of land has a total area of " + (area/apsu) + " apsu");
    }
}
