package com.wipro.java.oops;

public class ProjectLead extends Employee {

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String a[]) {
		
		// child object is instantiated from child constructor
		// Parent  Class consumes the Properties and behaviors of child class
		
		
		Employee emp = new ProjectLead();
		emp.setEmpID(1311);
		emp.seteName("Pratik");
		emp.setDesignation("Banglore");
		emp.setSalary(1250.99f);
		
		System.out.println(emp.getEmpID());
		System.out.println(emp.geteName());
		System.out.println(emp.getDesignation());
		System.out.println(emp.getSalary());
		
	}

}
