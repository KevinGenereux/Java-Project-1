package Main;

//Creating an interface for the Cube and Sphere classes
//These classes have to implement the methods in this interface
public interface ThreeDimensionalShape extends Shape {
	double getArea();
	double getVolume();
}
