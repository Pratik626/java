package com.wipro.java.exception; // Updated package declaration

class ExceptionHandling {
    // Static variable: allocated once and remains unless the class is unloaded
    static int num1 = 100; // Class-level declaration

    public static void main(String[] args) {
        int num2 = 0, result;

        try {
            // This line will cause ArithmeticException (division by zero)
            // result = num1 / num2; // Uncommenting this will throw an exception

            // Another example: division by zero using a different value
            int result1 = 500 / 0;  // This will cause ArithmeticException
        } 
       
        catch (Exception e) {  // Generic exception handler (for other errors)
            System.out.println("Exception occurred: " + e.toString());
        }
        finally { 
            System.out.println("This block always executes.");
        }

        System.out.println("Remaining code executed successfully.");
    }
}
