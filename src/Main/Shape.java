package Main;

// abstract interface for shapes
public abstract interface Shape {
	// both 2D and 3D shapes have area, so it should be in the shape interface
    public abstract double getArea();
}