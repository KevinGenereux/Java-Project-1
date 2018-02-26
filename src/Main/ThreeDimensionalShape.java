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

//Creating an interface for the Cube and Sphere classes
//These classes have to implement the methods in this interface
public interface ThreeDimensionalShape extends Shape {
	double getArea();
	double getVolume();
}
