/**
 * 
 */
package com.wipro.java.oops;

/**
 * @author Pratik1311
 */
// No Constructor
// Getter have return value
// setter have no return value
//Properties are determined using private fields
//Values or behaviors are determined through setters
// toString()will convert the entire animal class with properties and behaviors

//POJO: plain and old java object access through getter/setter
public class Animal {
	
	
	//Private Properties = Structure
	private String species;
	private String name;
	private String types;// it shows 
	

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = "Aquatic";//name of the Animal
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = "Shark";
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = "carnivores";
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + ", name=" + name + ", types=" + types + "]";
	}
	
}
