package com.wipro.java.oops;

public class Library {

    public static void main(String[] args) {

        // Using polymorphism to create different materials without constructors
        LibraryMaterial book = new Book();
        book.setTitle("The Java Programming Language"); // Setting data using setter
        book.setAuthorOrPublisher("James Gosling");
        ((Book) book).setPageCount(300); // Setting pageCount for the Book using setter

        LibraryMaterial magazine = new Magazine();
        magazine.setTitle("Tech Today");
        magazine.setAuthorOrPublisher("Tech Media");
        ((Magazine) magazine).setIssueMonth("January 2025"); // Setting issueMonth for the Magazine using setter

        // Accessing each object using the LibraryMaterial reference
        book.getDetails();   // Output: Book details
        magazine.getDetails(); // Output: Magazine details
    }
}
