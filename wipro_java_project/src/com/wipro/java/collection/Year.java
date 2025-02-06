package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Comparator class to sort movies by release year in ascending order
class Year implements Comparator<Movie1> {
    // Method to compare two movies based on their release year
    public int compare(Movie1 m1, Movie1 m2) {
        return m1.getYear() - m2.getYear(); // Sort in ascending order (oldest first)
    }

    public static void main(String[] args) {
        // Creating a list to store movie objects
        ArrayList<Movie1> movies = new ArrayList<>();
        
        // Adding movie details to the list
        movies.add(new Movie1("Force Awakens", 8.3, 2015));
        movies.add(new Movie1("Star Wars", 8.7, 1977));
        movies.add(new Movie1("Empire Strikes Back", 8.8, 1980));
        
        // Sorting movies based on release year using the Year comparator
        Collections.sort(movies, new Year());
        
        // Displaying the sorted movies
        System.out.println("Movies sorted by year:");
        for (Movie1 m : movies) {
            // Printing year, name, and rating of each movie
            System.out.println(m.getYear() + " " + m.getName() + " " + m.getRating());
        }
    }
}
