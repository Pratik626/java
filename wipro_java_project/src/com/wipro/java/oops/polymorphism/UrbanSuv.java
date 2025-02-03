package com.wipro.java.oops.polymorphism;

// UrbanSuv class extends Car, demonstrating inheritance
public class UrbanSuv extends Car {

    // Main method to test the functionality
    public static void main(String a[]) {

      
        Car c1 = new UrbanSuv(); // Creating an instance of UrbanSuv but referencing it with Car (polymorphism)
        c1.setCarName("BMW X7");// Setting car name using the inherited setter method
        c1.setBrand("BMW");// Setting brand using the inherited setter method
        c1.showdetails(); // Displaying car details using the inherited method
    }
}
