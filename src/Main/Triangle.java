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

//Triangle class must implement the methods in the TwoDimensionalShape interface
public class Triangle implements TwoDimensionalShape {
	
	//Declaring variables
    private final double side1, side2, side3;
    
  //Initializing private variables using constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    //Overrides method in TwoDimensionalShape Interface
  	//Calculating perimeter of triangle
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
    //Overrides method in TwoDimensionalShape Interface
  	//Given three triangle lengths, the area of a triangle can be calculated using Heron's Formula
    //A = sqrt(s(s-a)(s-b)(s-c))
    //a, b, and c are the three side lengths of the triangle
    //s is the semi-perimeter of the triangle: s = (a+b+c)/2
    @Override
    public double getArea() {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }
    
    @Override
    public String toString() {
		return "a triangle of side lengths " + side1 + ", "+ side2 + ", "+ side3;
	}
}