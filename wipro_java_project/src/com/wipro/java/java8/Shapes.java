package com.wipro.java.java8;

// Functional Interface defining the shape-related operations
@FunctionalInterface
interface ShapeOperations {

	// Abstract method for calculating area (enforced by the functional interface)
	public void computeArea();

	// Default method to display the shape information
	default void showShapeInfo() {
		System.out.println("This is a geometrical shape.");
	}

	// Default method to calculate and print the area of a square
	default void computeSquareArea(double side) {
		double squareArea = side * side;
		System.out.println("Area of Square ( " + side +" )^2 = " + squareArea);
	}

	// Static method to calculate the area of a rectangle
	static double getRectangleArea(double length, double breadth) {
		double rectArea = length * breadth;
		System.out.println(" Area of the Rectangle : (" + length + " * " + breadth + ") = " + rectArea);
		return rectArea;
	}

	// Static method to display a general message about shapes
	static void printGeneralMessage() {
		System.out.println("Shapes play a crucial role in mathematics and design.");
	}
}

// Main class implementing the ShapeOperations interface
public class Shapes implements ShapeOperations {

	// Implementing the abstract method (if needed, area logic can go here)
	@Override
	public void computeArea() {
		// Placeholder: Could be overridden by specific shape classes (e.g., Circle, Rectangle, etc.)
		System.out.println("Computing area (abstract method).");
	}

	// Main method to execute and test shape operations
	public static void main(String[] args) {
		// Create an instance of the Shape class
		Shapes shape = new Shapes();
		
		// Calling abstract Method.
		shape.computeArea();
		
		// Display shape information using default method
		shape.showShapeInfo();

		// Compute square area using the default method
		shape.computeSquareArea(6); // Example: Side length = 6

		// Calling static method from the interface to compute and display the rectangle area
		double rectFinalArea = ShapeOperations.getRectangleArea(7, 4); // Example: Length = 7, Breadth = 4
		System.out.println("Final Computed Rectangle Area: " + rectFinalArea);

		// Calling the static method to display a general message about shapes
		ShapeOperations.printGeneralMessage();
	}
}
