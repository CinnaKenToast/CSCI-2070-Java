/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kennethshipley2070assignment14;

/**
 *
 * @author rockm
 */
public abstract class SpaceCraft {
    protected
    final String name;
    final int seats;
    
    public SpaceCraft(String name, int seats){
        this.name = name;
        this.seats = seats;
    }
    
    public String getName(){
        return name;
    }
    
    public int getSeats(){
        return seats;
    }
    
    @Override
    public String toString(){
        String s = "Name: " + name + " Seats: " + seats + "\n";
        return s;
    }
    
}
