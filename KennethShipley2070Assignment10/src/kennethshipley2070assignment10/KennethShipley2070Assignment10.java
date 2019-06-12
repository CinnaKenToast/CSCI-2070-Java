//Kenneth Shipley
//CSCI 2070-08
//March 20, 2018
//This program creates a car object from a class to drive a car at a speed for set time defined by the user
package kennethshipley2070assignment10;

import java.util.Scanner;

/**
 *
 * @author rockm
 */
public class KennethShipley2070Assignment10 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double gas;
        double MPG;
        double speed;
        double time;
        
        System.out.println("Welcome to Ken's Rent-A-Car");
        System.out.print("How many gallons do you want your gas tank to hold: ");
        gas = scan.nextDouble();
        System.out.print("What is the fuel effiency (in MPG) of your car: ");
        MPG = scan.nextDouble();
        
        Car car = new Car(gas, MPG);
        
        System.out.printf("You have rented a new car that has %.1f gallons of gas with a fuel efficiency of %.1f MPG%n", gas, MPG);
        
        System.out.println();
        
        while(car.getFuel() != 0){
            System.out.print("Enter the speed (in miles per hour) at which you will drive the car: ");
            speed = scan.nextDouble();
            System.out.print("Enter the time (in hours) that you drove the car: ");
            time = scan.nextDouble();
            
            System.out.printf("The car drove a distance of %.1f miles.%n", car.drive(speed, time));
            System.out.printf("The car odometer is at %.1f miles.%n", car.getOdometer());
            System.out.printf("There is %.1f gallons of gas left in the tank.%n", car.getFuel());
            System.out.println();
 
        }
        
        
    }
    
}
