package com.wipro.java.oops;

public class Manager extends Employee{

	public Manager() {
		
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String a[]) {
		
		// child object is instantiated from child constructor
		// Parent  Class consumes the Properties and behaviors of child class
		
		
		Employee emp = new Manager();
		emp.setEmpID(1234);
		emp.seteName("Sanjay");
		emp.setDesignation("Pune");
		emp.setSalary(3000f);
		
		System.out.println(emp.getEmpID());
		System.out.println(emp.geteName());
		System.out.println(emp.getDesignation());
		System.out.println(emp.getSalary());
		
	}

}
