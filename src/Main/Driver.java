package Main;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		int choice = 1;
		Scanner s = new Scanner(System.in);
		
		while (choice != 3) {
			System.out.println("What would you like to do?\n" 
					+ "1 - Use the default shapes\n"
					+ "2 - Enter data for shapes\n" 
					+ "3 - Exit the Program\n");
			choice = Integer.parseInt(s.nextLine());

			switch (choice) {
			case 1:
				Shape[] shapes = new Shape[5];
				shapes[0] = new Circle(5);
				shapes[1] = new Square(5);
				shapes[2] = new Triangle(3, 4, 5);
				shapes[3] = new Sphere(5);
				shapes[4] = new Cube(5);
				testShapes(shapes, s);
				break;
			case 2:
				enterManualData(s);
			}
		}
		
	}
	
	public static void enterManualData(Scanner s) {
		double[] sides = new double[2];
		Shape[] shapes = new Shape[5];
		
		System.out.println("What should the radius of the circle be?");
		shapes[0] = new Circle(Double.parseDouble(s.nextLine()));
		
		System.out.println("What should the side length of the square be?");
		shapes[1] = new Square(Double.parseDouble(s.nextLine()));
		
		System.out.println("What should the first side length of the triangle be?");
		sides[0] = Double.parseDouble(s.nextLine());
		System.out.println("What should the second side length of the triangle be?");
		sides[1] = Double.parseDouble(s.nextLine());
		System.out.println("What should the third side length of the triangle be?");
		shapes[2] = new Triangle(sides[0], sides[1], Double.parseDouble(s.nextLine()));
		
		System.out.println("What should the radius of the sphere be?");
		shapes[3] = new Sphere(Double.parseDouble(s.nextLine()));
		System.out.println("What should the side lenth of the cube be?");
		shapes[4] = new Cube(Double.parseDouble(s.nextLine()));
		
		testShapes(shapes,s);
	}
	
	
	public static void testShapes(Shape[] shapes, Scanner s) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Shape " + i + ": " + shapes[i].toString());
			if (shapes[i] instanceof TwoDimensionalShape) {
				System.out.println("Area: " + shapes[i].getArea());
				System.out.println("Perimeter: " + ((TwoDimensionalShape)shapes[i]).getPerimeter());
			}
			else if (shapes[i] instanceof ThreeDimensionalShape) {
				System.out.println("Volume: " + ((ThreeDimensionalShape)shapes[i]).getVolume());
				System.out.println("Surface Area: " + shapes[i].getArea());
				
			}
		}
		
		System.out.println("Press Enter to continue");
		s.nextLine();
		
	}
	
	
}