package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Checked_UncheckedException {

    public static void main(String[] args) {
        
        // Checked Exception: FileNotFoundException
        try {
            File file = new File("wrong-file-path.txt"); // Invalid file path
            FileReader reader = new FileReader(file); // This will cause FileNotFoundException (Checked Exception)
        } 
        
        
        catch (FileNotFoundException e) { // Handling the checked exception
            System.out.println("Checked Exception - FileNotFoundException: " + e.getMessage());
        }

        // Unchecked Exception: NullPointerException
        try {
            String str = null;
            System.out.println("Length of string: " + str.length()); // This will cause NullPointerException (Unchecked Exception)
        }
        
        catch (NullPointerException e) { // Handling the unchecked exception
            System.out.println("Unchecked Exception - NullPointerException: " + e.getMessage());
        }

        // Finally block to confirm that the program continues
        finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program execution continued successfully.");
    }
}
