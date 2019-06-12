//Kenneth Shipley
//CSCI 2070-08
//January 29, 2018
//This program calculates the tip for a customer's bill
package kennethshipley2070assignment03;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author rockm
 */
public class KennethShipley2070Assignment03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        final double tax = 0.07;
        final double lowTip = 0.15;
        final double medTip = 0.18;
        final double highTip = 0.2;
        Scanner scan = new Scanner(System.in);    
        
        double price;
        String serverName;
        
        System.out.println("You are using Ken's tip calculator");
        System.out.println("----------------------------------");
        
        System.out.print("Price of meal: ");
        price = scan.nextDouble();
        
        System.out.print("Name of Server: ");
        serverName = scan.nextLine();
        
        scan.nextLine();
        
        System.out.println("Bill Price: " + numberFormat.format(price));
        
        double taxPrice = price * tax;
        System.out.println("Sales Tax: " + numberFormat.format(taxPrice));
        
        double billTotal =  price + taxPrice;
        System.out.println("Bill Total: " + numberFormat.format(billTotal));
        
        double lowTipPrice = billTotal * lowTip;
        double medTipPrice = billTotal * medTip;
        double highTipPrice = billTotal * highTip;
        
        System.out.println("Suggest tip (15%): " + numberFormat.format(lowTipPrice));
        System.out.println("Suggest tip (18%): " + numberFormat.format(medTipPrice));
        System.out.println("Suggest tip (20%): " + numberFormat.format(highTipPrice));
                
        
        
        
        
    }
    
}
