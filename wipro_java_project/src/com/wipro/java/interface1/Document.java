package com.wipro.java.interface1;

// Document class implements two interfaces: Showable and Printable
public class Document implements Showable, Printable {

    // Overriding the print method from Printable interface
    public void print() {
        System.out.println("print");  // Prints "print"
    }

    // Overriding the show method from Showable interface
    public void show() {
        System.out.println("show");  // Prints "show"
    }

    // Main method to test the functionality of the Document class
    public static void main(String a[]) {
        Document doc1 = new Document();  // Create a new Document object
        doc1.show();  // Call the show method
        doc1.print();  // Call the print method
    }
}
