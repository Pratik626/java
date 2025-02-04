package com.wipro.java.oops;

// Book class extends LibraryMaterial
public class Book extends LibraryMaterial {

    private int pageCount;

    // Constructor for Book class (without using super() constructor)
    public Book() {
        super();  // Calling the parent class constructor (LibraryMaterial)
    }

    // Getter and Setter methods for pageCount
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    // Implementing getDetails() for polymorphism
    @Override
    public void getDetails() {
        System.out.println("Book Title: " + getTitle() + ", Author: " + getAuthorOrPublisher() + ", Pages: " + pageCount);
    }
}
