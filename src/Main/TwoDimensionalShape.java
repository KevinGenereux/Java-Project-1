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

//Creating an interface for the Square, Triangle, and Circle classes
//These classes have to implement the methods in this interface
public interface TwoDimensionalShape extends Shape {
	double getPerimeter();
    double getArea();
}
