//Kenneth Shipley
//CSCI 2070-08
//January 30, 2018
//This program can caculate the fewest amount of coins 
//to make up any given amount of cents
package kennethshipley2070assignment04;

import java.util.Scanner;

/**
 *
 * @author rockm
 */
public class KennethShipley2070Assignment04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quaterValue = 25;
        int dimeValue = 10;
        int nickelValue = 5;
        int pennyValue = 1;
        
        Scanner scan = new Scanner(System.in);
        int cents;
        int numQuarters;
        int numDimes;
        int numNickels;
        int numPennies;
        
        System.out.println("This is Ken's magic coin counter");
        System.out.println("--------------------------------");
        
        System.out.print("Amount of cents: ");
        cents = scan.nextInt();
        
        numQuarters = cents / quaterValue;
        cents = cents % quaterValue;
        numDimes = cents / dimeValue;
        cents = cents % dimeValue;
        numNickels = cents / nickelValue;
        cents = cents % nickelValue;
        numPennies = cents / pennyValue;

        System.out.println("Quaters (25¢): " + numQuarters);
        System.out.println("Dimes (10¢): " + numDimes);
        System.out.println("Nickels (5¢): " + numNickels);
        System.out.println("Pennies (1¢): " + numPennies);
    }
    
}
