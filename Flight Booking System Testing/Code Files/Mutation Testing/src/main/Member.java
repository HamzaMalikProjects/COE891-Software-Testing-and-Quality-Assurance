/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Syed Aiman Hussaini (500902560)
 */
public class Member extends Passenger {
    
    Flight f = new Flight(0, "Toronto", "London", "8:36", 470, 652.26);

    private int yearsOfMembership;

    public Member(String name, int age) {   
        super(name, age);
    }
    
    public Member(String name, int age, int yearsOfMembership) {  
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;         
    } 
    
    @Override
    public double applyDiscount(double p) {
        
        double discount;
        
        if(yearsOfMembership > 5)
            discount = 0.5;
        
        else if(yearsOfMembership > 1 && yearsOfMembership <= 5)
            discount = 0.9;
        
            else
                discount = 1;
        
        
        double price = p*discount;
        
        return price;
                }
    
}
