package com.wipro.java.oops.inheritance;

public class Developer extends Employee {

	public Developer() {
		// TODO Auto-generated constructor stub
	}
	
public static void main(String a[]) {
		
		// child object is instantiated from child constructor
		// Parent  Class consumes the Properties and behaviors of child class
		
		
		Employee emp = new Developer();
		emp.setEmpID(1125);
		emp.seteName("Nikhil");
		emp.setDesignation("Banglore");
		emp.setSalary(6759.75f);
		
		System.out.println(emp.getEmpID());
		System.out.println(emp.geteName());
		System.out.println(emp.getDesignation());
		System.out.println(emp.getSalary());
		
	}

}
