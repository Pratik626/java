package com.wipro.java.oops;

// Magazine class extends LibraryMaterial
public class Magazine extends LibraryMaterial {

    private String issueMonth;

    // Constructor for Magazine class (without using super() constructor)
    public Magazine() {
        super();  // Calling the parent class constructor (LibraryMaterial)
    }

    // Getter and Setter methods for issueMonth
    public String getIssueMonth() {
        return issueMonth;
    }

    public void setIssueMonth(String issueMonth) {
        this.issueMonth = issueMonth;
    }

    // Implementing getDetails() for polymorphism
    @Override
    public void getDetails() {
        System.out.println("Magazine Title: " + getTitle() + ", Publisher: " + getAuthorOrPublisher() + ", Issue: " + issueMonth);
    }
}
