package Main;

//Cube class must implement the methods in the ThreeDimensionalShape interface
public class Cube implements ThreeDimensionalShape{
	
	//Declaring variable
	private double side;
	
	//Initializing private variables using constructor
	public Cube(double side) {
		this.side = side;
	}
	
	//Overrides method in ThreeDimensionalShape Interface
	//Calculating Surface Area of Cube
	@Override
	public double getArea() {
		return 6 * Math.pow(side, 2);
	}
	
	//Overrides method in ThreeDimensionalShape Interface
	//Calculating Volume of Sphere
	@Override
	public double getVolume() {
		return Math.pow(side, 3);
	}
	
	@Override
	public String toString() {
		return "a cube of side length " + side;
	}
}
