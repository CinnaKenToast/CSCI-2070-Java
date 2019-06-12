/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kennethshipley2070assignment07;

import java.util.Scanner;

/**
 *
 * @author rockm
 */
public class KennethShipley2070Assignment07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        final double tax = 0.07;
        final double lowTip = 0.15;
        final double medTip = 0.18;
        final double highTip = 0.2;
        Scanner scan = new Scanner(System.in);    
       
        double entree, drink, dessert, price;
        
        System.out.println("You are using Ken's tip calculator");
        System.out.println("----------------------------------");
        
        System.out.print("Entree Price: ");
        entree = scan.nextDouble();
        System.out.print("Drink Price: ");
        drink = scan.nextDouble();
        System.out.print("Dessert Price: ");
        dessert = scan.nextDouble();
        
        scan.nextLine();
        
        price = entree + drink + dessert;
        
        System.out.print("Name of Server: ");
        String serverName = scan.nextLine();
        
        System.out.printf("      Entree $%6.2f%n", entree);
        System.out.printf("       Drink $%6.2f%n", drink);
        System.out.printf("     Dessert $%6.2f%n", dessert);
        System.out.printf("       Total $%6.2f%n", price);
        
        double taxPrice = price * tax;
        System.out.printf("         Tax $%6.2f%n", taxPrice);
        
        double billTotal =  price + taxPrice;
        System.out.printf("Total w/ Tax $%6.2f%n", billTotal);
        
        double lowTipPrice = billTotal * lowTip;
        double medTipPrice = billTotal * medTip;
        double highTipPrice = billTotal * highTip;
        
        System.out.printf("     Low Tip $%6.2f%n", lowTipPrice);
        System.out.printf("  Medium Tip $%6.2f%n", medTipPrice);
        System.out.printf("    High Tip $%6.2f%n", highTipPrice);
        System.out.printf("Your server: %s%n", serverName);
    }
    
}
