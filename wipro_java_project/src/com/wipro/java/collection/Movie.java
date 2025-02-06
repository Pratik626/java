package com.wipro.java.collection;

import java.util.Collections;
import java.util.ArrayList;

class Movie implements Comparable<Movie> {
    private String n; // Name of the movie
    private double r; // Rating of the movie
    private int y;    // Year of the movie

    // Constructor
    public Movie(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    // Compare movies based on rating
    public int compareTo(Movie m) {
        return Double.compare(this.r, m.r); // Compare ratings
    }

    // Getters
    public String getName() {
        return n;
    }

    public double getRating() {
        return r;
    }

    public int getYear() {
        return y;
    }

    public static void main(String[] args) {
        ArrayList<Movie> l = new ArrayList<>();
        l.add(new Movie("Star Wars", 8.7, 1977));
        l.add(new Movie("John Wick", 8.9, 2023));
        l.add(new Movie("The Life of Jackal", 9.2, 2024));

        // Sort the list based on rating
        Collections.sort(l);

        // Print the sorted list
        System.out.println("Movies after sorting by rating:");
        for (Movie m : l) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());
        }
    }
}