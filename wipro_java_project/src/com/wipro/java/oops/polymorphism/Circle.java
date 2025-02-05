package com.wipro.java.oops.polymorphism;

// Circle class extends Shape, demonstrating inheritance
public class Circle extends Shape {

    // Main method to test the functionality
    public static void main(String[] args) {
        Shape s1 = new Circle(); // Creating an instance of Circle but referencing it with Shape (polymorphism)
        s1.setShapeName("Circle"); // Setting shape name using the inherited setter method
        s1.setRadius(5.0f); // Setting radius for the Circle (using setter)
        s1.showDetails(); // Displaying shape details using the inherited method
    }
}
