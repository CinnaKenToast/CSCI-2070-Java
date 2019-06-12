/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kennethshipley2070assignment10;

/**
 *
 * @author rockm
 */
public class Car {
    private double fuel;
    private final double MPG;
    private double odometer;
    
    public Car(double gas, double mpg){
        fuel = gas;
        MPG = mpg;
        odometer = 0;
    }
    
    public double getFuel(){
        return fuel;
    }
    
    public double getOdometer(){
        return odometer;
    }
    
    public double drive(double speed, double time){
        double distance = speed * time;
        double gasRequired = distance / MPG;
        double maxDistance = MPG * fuel;
        
        if(distance < maxDistance){
            fuel = fuel - gasRequired;
            odometer = odometer + distance;
        }
        else{
            distance = maxDistance;
            odometer = odometer + distance;
            fuel = 0;
        }
        return distance;
    }
    
    
    
}
