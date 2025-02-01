/**
 * 
 */
package com.wipro.java;

/**
 * @author Pratik1311
 */
public class Flower {
	
	
	// properties and behaviours
	//name,color,fragrance--> prop
	//Rose,red,sweet-- behaviour
	//sunflower,yellow
	
	String flowerName;
	String flowerColor;
	
	
	Flower(String name, String color){
		this.flowerName=name;
		this.flowerColor=color;
	}
	
	void display() {
		System.out.println("Flower name is : "+flowerName+" Flower color is: "+flowerColor);
	}
	
	public static void main(String args[]) {
		
		Flower flowerobj1 = new Flower("Sunflower", "yellow");
		Flower flowerobj2 = new Flower("Rose","Red");
		flowerobj1.display();
		flowerobj2.display();
	}
		
	}


