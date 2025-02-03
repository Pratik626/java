package com.wipro.java.oops.polymorphism;

// Class representing a Car with attributes and methods
public class Car {
    
    // Private instance variables for encapsulation
    private String CarName; // Stores the name of the car
    private String Brand;   // Stores the brand of the car
    
    // Overriding the toString() method to provide a string representation of the Car object
    @Override
    public String toString() {
        return "Car [CarName=" + CarName + ", Brand=" + Brand + "]";
    }

    // Getter method to retrieve the car name
    public String getCarName() {
        return CarName;
    }

    // Setter method to set the car name
    public void setCarName(String carName) {
        CarName = carName; // Assigns the parameter value to the instance variable
    }

    // Getter method to retrieve the car brand
    public String getBrand() {
        return Brand;
    }

    // Setter method to set the car brand
    public void setBrand(String brand) {
        Brand = brand; // Assigns the parameter value to the instance variable
    }

    // Method to display car details
    public void showdetails() {
        System.out.println("Car Name  : " + getCarName() + "  Brand: " + getBrand());
    }
}
