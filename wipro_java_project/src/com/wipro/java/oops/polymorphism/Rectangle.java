package com.wipro.java.oops.polymorphism;

// Rectangle class extends Shape, demonstrating inheritance
public class Rectangle extends Shape {

    // Main method to test the functionality
    public static void main(String[] args) {
        Shape s2 = new Rectangle(); // Creating an instance of Rectangle but referencing it with Shape (polymorphism)
        s2.setShapeName("Rectangle"); // Setting shape name using the inherited setter method
        s2.setLength(4.0f); // Setting length for the Rectangle (using setter)
        s2.setWidth(6.0f); // Setting width for the Rectangle (using setter)
        s2.showDetails(); // Displaying shape details using the inherited method
    }
}
