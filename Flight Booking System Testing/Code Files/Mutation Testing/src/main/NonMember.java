/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.lang.Math;
/**
 *
 * @author Syed Aiman Hussaini (500902560)
 */
public class NonMember extends Passenger {
    
    Flight f = new Flight(0, "Toronto", "London", "8:36", 470, 652.26);
    
    public NonMember(String name, int age) {
        super(name, age);   
    }
    
    
    /**
     *
     * @param p
     * @return
     */
    @Override
    public double applyDiscount(double p) {
    
        if(age > 65) {
        
            p = p*90;
            p = Math.round(p);
            p = p/100;
            
            return p; 
        }
        
        else return p;
        
    }
    
}
