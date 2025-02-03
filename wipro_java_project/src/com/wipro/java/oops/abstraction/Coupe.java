package com.wipro.java.oops.abstraction;

public class Coupe extends Car {
	
	public void ignition() {
		System.out.println("My Curve has to be started by switching on the ignition ");
		
	}
	
	public void driving() {
		System.out.println("I can Drive my car");
	}

	public static void main(String a[]) {
		Car tataCar = new Coupe();
		tataCar.ignition();
		tataCar.driving();
	}

}
