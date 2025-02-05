package com.wipro.java.interface1;

// Tiger class implements the Animal interface
public class Tiger implements Animal {
    
    // Implementing the makeSound method from the Animal interface
    public void makeSound() {
        System.out.println("Roar");  // Prints the sound "Roar" made by the tiger
    }
    
    // Main method to test the functionality of the Tiger class
    public static void main(String a[]) {
        Animal tiger1 = new Tiger();  // Create an Animal reference pointing to a Tiger object
        tiger1.makeSound();  // Call the makeSound method on the Tiger object
    }
}
