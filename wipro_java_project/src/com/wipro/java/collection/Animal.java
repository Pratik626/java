package com.wipro.java.collection;

import java.util.*;

class Animal implements Comparable<Animal> {
    private String name; // Name of the animal
    private int age;     // Age of the animal

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Compare animals based on age (Using Comparable)
    public int compareTo(Animal a) {
        return Integer.compare(this.age, a.age); // Compare ages
    }

    //using Getters get the name 
    public String getName() {
        return name;
    }
    
    //using Getters get the age
    public int getAge() {
        return age;
    }

    // Override toString for easy display
    @Override
    public String toString() {
        return name + " " + age;
    }

    // Using Comparator to compare animals based on name (Alphabetical Order)
    public static class AnimalNameComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal a1, Animal a2) {
            return a1.getName().compareTo(a2.getName()); // Compare by name alphabetically
        }
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", 5));
        animals.add(new Animal("Elephant", 10));
        animals.add(new Animal("Zebra", 5));
        animals.add(new Animal("Giraffe", 7));

        // Sort the list based on age using Comparable
        Collections.sort(animals);

        // Print the sorted list by age
        System.out.println("Animals after sorting by age by using Comparable:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Sort the list based on name using the AnimalNameComparator (Comparator)
        Collections.sort(animals, new AnimalNameComparator());

        // Print the sorted list by name
        System.out.println("\nAnimals after sorting by name by using Comparator:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
