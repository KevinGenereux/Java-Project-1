package Main;

//Creating an interface for the Square, Triangle, and Circle classes
//These classes have to implement the methods in this interface
public interface TwoDimensionalShape extends Shape {
	double getPerimeter();
    double getArea();
}
