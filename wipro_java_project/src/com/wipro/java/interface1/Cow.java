package com.wipro.java.interface1;

// Cow class implements the Animal interface
public class Cow implements Animal {
    
    // Implementing the makeSound method from the Animal interface
    public void makeSound() {
        System.out.println("humba");  // Prints the sound "humba" made by the cow
    }
    
    // Main method to test the functionality of the Cow class
    public static void main(String a[]) {
        Animal cow1 = new Cow();  // Create an Animal reference pointing to a Cow object
        cow1.makeSound();  // Call the makeSound method on the Cow object
    }
}
