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

//Circle class must implement the methods in the TwoDimensionalShape interface
public class Circle implements TwoDimensionalShape{
	
	//Declaring variable
	private final double radius;
	
	//Initializing private variable using constructor
	public Circle (double radius) {
		//this keyword is used to refer to instance variables in the current class
		this.radius = radius;
	}
	
	//Overrides method in TwoDimensionalShape Interface
	//Calculating perimeter of circle
	//P = 2 * PI * r
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	//Overrides method in TwoDimensionalShape Interface
	//Calculating area of circle
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public String toString() {
		return "a circle of radius " + radius;
	}
}

