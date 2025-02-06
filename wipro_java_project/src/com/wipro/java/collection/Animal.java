package com.wipro.java.collection;  // This defines the package for the class

import java.util.*;  // This imports the necessary classes for using lists and sorting

public class Animal {  // This is the Animal class that represents an animal object
    private String name; // This stores the name of the animal
    private int age;     // This stores the age of the animal

    // This is the constructor to create an Animal object with a name and age
    public Animal(String name, int age) {
        this.name = name;  // Set the animal's name
        this.age = age;    // Set the animal's age
    }

    // This is a method that returns the name of the animal
    public String getName() {
        return name;  // Return the name
    }

    // This is a method that returns the age of the animal
    public int getAge() {
        return age;   // Return the age
    }

    // This method is used to print the animal's details (name and age) in a readable format
    @Override
    public String toString() {
        return name + " " + age;  // Combine the name and age into a single string
    }

    // Main method where the program starts
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();  // Create a list to store Animal objects

        // Add animals to the list with names and ages
        animals.add(new Animal("Lion", 5));  // Add a Lion that is 5 years old
        animals.add(new Animal("Elephant", 10));  // Add an Elephant that is 10 years old
        animals.add(new Animal("Zebra", 6));  // Add a Zebra that is 5 years old
        animals.add(new Animal("Giraffe", 7));  // Add a Giraffe that is 7 years old

        // Sort the list of animals by age using the AnimalComparable class
        Collections.sort(animals, new AnimalComparable());  // Sorting animals by age

        // Print out the list of animals sorted by age
        System.out.println("Animals after sorting by age Using Comparable:");
        for (Animal animal : animals) {  // Go through each animal in the sorted list
            System.out.println(animal);  // Print the animal's name and age
        }

        // Sort the list of animals by name using the AnimalComparator class
        Collections.sort(animals, new AnimalComparator());  // Sorting animals by name

        // Print out the list of animals sorted by name
        System.out.println("\nAnimals after sorting by name using Comparator:");
        for (Animal animal : animals) {  // Go through each animal in the sorted list
            System.out.println(animal);  // Print the animal's name and age
        }
    }
}
