package com.wipro.java.oops.polymorphism;

// Coupe class extends Car, demonstrating inheritance
public class Coupe extends Car {
    
    // Main method to test the functionality
    public static void main(String a[]) {
        
        
        Car c2 = new Coupe();// Creating an instance of Coupe but referencing it with Car (Polymorphism)
        
        
        c2.setCarName("Curve");// Setting car name using the inherited setter method
        c2.setBrand("TATA");// Setting brand using the inherited setter method
        c2.showdetails(); // Displaying car details using the inherited method
    }
}
