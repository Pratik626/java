/**
 * Employee POJO class demonstrating encapsulation.
 */
package com.wipro.java.oops;

/**
 * @author Pratik1311
 */
// POJO: Plain Old Java Object with encapsulated fields accessed through getter/setter
public class Employee {

    // Private instance variables
    private int empID;
    private String eName;
    private String designation;
    private float salary; // Corrected variable name to follow camelCase

    // Getter and Setter methods

    /**
     * Gets the employee ID.
     * @return Employee ID
     */
    public int getEmpID() {
        return empID;
    }

    /**
     * Sets the employee ID.
     * @param empID Employee ID
     */
    public void setEmpID(int empID) {
        this.empID = empID; // Corrected: Now using the parameter value
    }

    /**
     * Gets the employee name.
     * @return Employee name
     */
    public String geteName() {
        return eName;
    }

    /**
     * Sets the employee name.
     * @param eName Employee name
     */
    public void seteName(String eName) {
        this.eName = eName; // Corrected: Now using the parameter value
    }

    /**
     * Gets the employee designation.
     * @return Employee designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Sets the employee designation.
     * @param designation Employee designation
     */
    public void setDesignation(String designation) {
        this.designation = designation; //Now using the parameter value
    }

    /**
     * Gets the employee salary.
     * @return Employee salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * Sets the employee salary.
     * @param salary Employee salary
     */
    public void setSalary(float salary) {
        this.salary = salary; //Now using the parameter value
    }

    // Overriding toString() to display employee details
    @Override
    public String toString() {
        return "Employee [empID=" + empID + ", eName=" + eName + ", designation=" + designation + ", Salary=" + salary+ "]";
    }

}
