package com.wipro.java.collection;

// Class to store movie details
public class Movie1 {
    private String name; // Movie name
    private double rating; // Movie rating
    private int year; // Movie release year

    // Constructor to initialize movie details
    public Movie1(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Method to get the movie name
    public String getName() {
        return name;
    }

    // Method to get the movie rating
    public double getRating() {
        return rating;
    }

    // Method to get the movie release year
    public int getYear() {
        return year;
    }
}