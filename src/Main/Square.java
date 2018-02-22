package Main;

//Square class must implement the methods in the TwoDimensionalShape interface
public class Square implements TwoDimensionalShape{
	
	//Declaring variable
    private final double side;
    
    //Initializing private variable using constructor
    public Square(double side) {
        this.side = side;
    }
    
    //Overrides method in TwoDimensionalShape Interface
  	//Calculating perimeter of square
    @Override
    public double getPerimeter(){
        return 4 * side;
    }
    
    //Overrides method in TwoDimensionalShape Interface
  	//Calculating area of circle
    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
	public String toString() {
		return String.format("The perimeter of the square is: %.2f \n The area of the square is: %.2f", getPerimeter(), getArea());
	}
}