/*
 * Noah Sissons
 * Kevin Genereux
 * Matthew Giorno
 * 0661206
 * ENGI 2570
 * Project 1
 * February 26 2018
 */
package Main;

//Circle class must implement the methods in the ThreeDimensionalShape interface
public class Sphere implements ThreeDimensionalShape {
	
	//Declaring variable
	private double radius;
	
	//Initializing private variables using constructor
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	//Overrides method in ThreeDimensionalShape Interface
	//Calculating Surface Area of Sphere
	@Override
	public double getArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	//Overrides method in ThreeDimensionalShape Interface
	//Calculating Volume of Sphere
	@Override
	public double getVolume() {
		return 4 / 3 * Math.PI * Math.pow(radius, 3);
	}
	
	@Override
	public String toString() {
		return "a sphere of radius " + radius;
	}
}
