package com.wipro.java.oops.polymorphism;

// Class representing a Shape with attributes and methods
public class Shape {

    // Private instance variables for encapsulation
    private String shapeName;  // Stores the name of the shape
    private float radius;     // Stores the radius (only for Circle)
    private float length;     // Stores the length (only for Rectangle)
    private float width;      // Stores the width (only for Rectangle)

   

    // Getter and Setter methods for Shape Name
    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    // Getter and Setter methods for Circle (radius)
    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    // Getter and Setter methods for Rectangle (length and width)
    public double getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    
    // Overriding the toString() method to provide a string representation of the Shape object
    @Override
    public String toString() {
        return "Shape [shapeName=" + shapeName + ", radius=" + radius + ", length=" + length + ", width=" + width + "]";
    }

    // Method to display shape details (Overridden in subclasses)
    public void showDetails() {
        System.out.println("Shape Name: " + getShapeName());
        System.out.println("Radius: " + getRadius());
        System.out.println("Length: " + getLength());
        System.out.println("Width: " + getWidth());
    }
}
