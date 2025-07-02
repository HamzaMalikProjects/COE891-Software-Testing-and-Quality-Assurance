/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;
import java.util.ArrayList;
/**
 *
 * @author Syed Aiman Hussaini (500902560)
 */
public class Manager {
    
    ArrayList<Flight> flightArray = new ArrayList<>();
    
    public void createFlights(Flight f) {
        flightArray.add(f);
    }
    
    public void displayAvailableFlights(String origin, String destination) {
        
        System.out.println("\nList of Available Flights: \n");
        
        for (int i = 0; i < flightArray.size(); i++) {
            
            if (flightArray.get(i).getOrigin().equals(origin) && flightArray.get(i).getDestination().equals(destination)) {
                         
                if(flightArray.get(i).getNumberOfSeatsLeft() > 0) {
                                       
                    System.out.println(flightArray.get(i));
                    
                }
                
            }
                  
        }
        
    } 
    
    public Flight getFlight(int flightNumber) {
        
        Flight c = null;                // If there is no flight number that matches, this method returns null.
        
        for(int i = 0; i < flightArray.size(); i++) {
            
            if(flightArray.get(i).getFlightNumber() == flightNumber) {
                
                c = flightArray.get(i);
            }
            
        }
         
      return c;
    }
    
    
    
    public void bookSeat(int flightNumber, Passenger p) {
        
        for(int i = 0; i < flightArray.size(); i++) {
        
            if(flightArray.get(i).getFlightNumber() == flightNumber) {
            
                if(flightArray.get(i).bookASeat() == true) {

                    Ticket t = new Ticket(p, flightArray.get(i), p.applyDiscount(flightArray.get(i).getOriginalPrice()));
                    System.out.println("Ticket booked successfully.\n\nTicket Details: \n");
                    System.out.println(t.toString());

                }
                
                else System.out.println("Sorry, that flight is fully booked. Please choose a different flight.");
                
            }
        
        }
        
    }
    
    public static void main(String[] args) {
    
        Manager m = new Manager();
        Flight f1 = new Flight(0, "Toronto", "London", "Feb 5 @ 8:36", 470, 652.26);
        Flight f7 = new Flight(6, "Toronto", "London", "Feb 9 @ 4:30", 12, 614.11);
        Flight f2 = new Flight(1, "Vancouver", "Helsinki", "Feb. 4 @ 3:00", 32, 1022.68);
        Flight f3 = new Flight(2, "Paris", "Barcelona", "Feb. 10 @ 6:27", 4, 520);
        Flight f4 = new Flight(3, "Bali", "Oslo", "Feb. 29 @ 17:46", 4, 520);
        Flight f5 = new Flight(4, "Albuquerque", "Luxembourg", "Mar. 1 @ 13:12", 4, 520);
        Flight f8 = new Flight(7, "Albuquerque", "Luxembourg", "Mar. 12 @ 16:12", 4, 468.99);
        Flight f9 = new Flight(8, "Albuquerque", "Luxembourg", "Mar. 16 @ 19:12", 4, 454.12);
        Flight f6 = new Flight(5, "Cairo", "Warsaw", "Feb. 13 @ 7:52", 4, 520);
        Passenger p1 = new Member("Jenna", 32, 6); 
        Passenger p3 = new Member("Angela", 47, 3); 
        Passenger p4 = new Member("Steve", 51, 1); 
        Passenger p2 = new NonMember("Paul", 66);
        Passenger p5 = new NonMember("Rainn", 48);
        Passenger p6 = new NonMember("John", 39);
        
        
        m.createFlights(f1);
        m.createFlights(f2);
        m.createFlights(f3);
        m.createFlights(f4);
        m.createFlights(f5);
        m.createFlights(f6);
        m.createFlights(f7);
        m.createFlights(f8);
        m.createFlights(f9);
        f1.setNumberOfSeatsLeft(1);
        m.displayAvailableFlights("Toronto", "London");
        System.out.println("------------------------------------------------------------");
        m.bookSeat(0, p2);
        System.out.println("---------------------------------------------------");
        m.displayAvailableFlights("Vancouver", "Helsinki");
        System.out.println("-------------------------------------------------");
        m.bookSeat(1, p1);
        System.out.println("-----------------------------------------------");
        m.bookSeat(0, p1);
        System.out.println("----------------------------------------------------------");
        m.displayAvailableFlights("Toronto", "London");
        System.out.println("---------------------------------------");
        m.displayAvailableFlights("Albuquerque", "Luxembourg");
        System.out.println("------------------------------");
        m.bookSeat(4, p3);
        System.out.println("----------------------------------------");
        m.bookSeat(8, p5);
        System.out.println("--------------------------------------------");
        m.displayAvailableFlights("Albuquerque", "Athens");
        System.out.println("-------------------------------------------------------------");
        m.bookSeat(2, p4);
        System.out.println("-------------------------------------------------------------");

    }
    
}
