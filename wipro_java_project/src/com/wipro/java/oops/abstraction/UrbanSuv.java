package com.wipro.java.oops.abstraction;

public class UrbanSuv extends Car {
	

	public void ignition() {
		System.out.println("Bmw has been started");
	}
	
	public void drive() {
		System.out.println("My BMW is ready for drive");
	}
	
	public static void main(String a[]) {
		Car suv = new UrbanSuv();
		suv.ignition();
		suv.driving();
	}

	@Override
	void driving() {
		// TODO Auto-generated method stub
		
	}

}
