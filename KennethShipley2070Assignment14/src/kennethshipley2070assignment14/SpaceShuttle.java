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
public class SpaceShuttle extends SpaceCraft{
    private
    final int engines;
    
    public SpaceShuttle(String name, int seats, int engines){
        super(name, seats);
        this.engines = engines;
    }
    
    public int getEngines(){
        return engines;
    }
    
    @Override
    public String toString(){
        String s = "Name: " + name + " Seats: " + seats + " Engines:  " + engines + "\n";
        return s;
    }
}
