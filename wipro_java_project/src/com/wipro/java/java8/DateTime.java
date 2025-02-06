package com.wipro.java.java8;

import java.time.LocalDate;

public class DateTime {

    // Function to demonstrate date adjustments based on the requirements
    public static void adjustDates() {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Today's date is: " + currentDate);  // Print today's date

        // To get the first day of the next month
        LocalDate firstDayNextMonth = currentDate.withDayOfMonth(1).plusMonths(1);
        System.out.println("The first day of the next month is: " + firstDayNextMonth);  // Print the first day of the next month

        // To get the next Saturday
        LocalDate nextSaturday = currentDate.with(java.time.DayOfWeek.SATURDAY).plusDays(1);  // Set the date to next Saturday
        System.out.println("The next Saturday after today is: " + nextSaturday);  // Print the next Saturday date

        // To get the first day of the current month
        LocalDate firstDayThisMonth = currentDate.withDayOfMonth(1);  // Set the date to the first day of the current month
        System.out.println("The first day of this month was: " + firstDayThisMonth);  // Print the first day of this month

        // To get the last day of the current month
        LocalDate lastDayThisMonth = currentDate.withDayOfMonth(currentDate.lengthOfMonth());  // Set the date to the last day of this month
        System.out.println("The last day of this month will be: " + lastDayThisMonth);  // Print the last day of this month
    }

    // Main method to run the code
    public static void main(String[] args) {
        adjustDates();  // Call the adjustDates function to show date changes
    }
}

