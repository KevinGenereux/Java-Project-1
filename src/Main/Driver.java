package Main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		// set up user interface
		int choice = 1;
		Scanner s = new Scanner(System.in);
		
		// main event loop
		while (choice != 3) {
			
			// choose what shapes will be used
			System.out.println("What would you like to do?\n" 
					+ "1 - Use the default shapes\n"
					+ "2 - Enter data for shapes\n" 
					+ "3 - Exit the Program\n");
			choice = safeScanInt(s);
	

			// switch to interpret user input
			switch (choice) {
			case 1: // use default shapes
				// create array for shapes, and fill with simple shapes
				Shape[] shapes = new Shape[5];
				shapes[0] = new Circle(5);
				shapes[1] = new Square(5);
				shapes[2] = new Triangle(3, 4, 5);
				shapes[3] = new Sphere(5);
				shapes[4] = new Cube(5);
				
				// method to print various information about the shapes
				testShapes(shapes, s);
				break;
				
			case 2: // enter data for the shapes
				// do this in a separate method
				enterManualData(s);
			}
		}
		
	}
	
	// method to prompt, accept, and process user input about making one custom shape of each type
	public static void enterManualData(Scanner s) {
		double[] sides = new double[2];
		Shape[] shapes = new Shape[5];
		
		// circle
		System.out.println("What should the radius of the circle be?");
		shapes[0] = new Circle(safeScanDouble(s));
		
		// square
		System.out.println("What should the side length of the square be?");
		shapes[1] = new Square(safeScanDouble(s));
		
		// triangle
		System.out.println("What should the first side length of the triangle be?");
		sides[0] = safeScanDouble(s);
		System.out.println("What should the second side length of the triangle be?");
		sides[1] = safeScanDouble(s);
		System.out.println("What should the third side length of the triangle be?");
		shapes[2] = new Triangle(sides[0], sides[1], safeScanDouble(s));
		
		// sphere
		System.out.println("What should the radius of the sphere be?");
		shapes[3] = new Sphere(safeScanDouble(s));
		
		// cube
		System.out.println("What should the side lenth of the cube be?");
		shapes[4] = new Cube(safeScanDouble(s));
		
		testShapes(shapes,s);
	}
	
	// method to print information about an array of shapes
	public static void testShapes(Shape[] shapes, Scanner s) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("\nShape " + i + ": " + shapes[i].toString());
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
	
	// error guarded nextDouble method
	public static double safeScanDouble(Scanner s) {
		// declare and initialize variables
		double toReturn = 0;
		boolean err = false;
		
		// do while to loop until valid input is entered
		do {
			try {
				toReturn = s.nextDouble();
				err = false;
				
				// not accepting negative values
				if (toReturn < 0) {
					err = true;
				}
			} catch (InputMismatchException e) {
				err = true;
			}
			if (err)
				System.out.println("Invalid input, try again!\n");
			s.nextLine();
		} while (err);
		return toReturn;
	}
	
	// error guarded nextInt method
	public static int safeScanInt(Scanner s) {
		// declare and initialize variables
		int toReturn = 0;
		boolean err = false;
		
		// do while to loop until valid input is entered
		do {
			try {
				toReturn = s.nextInt();
				err = false;
			} catch (InputMismatchException e) {
				err = true;
				System.out.println("Invalid input, try again!\n");
			}
			s.nextLine();
		} while (err);
		return toReturn;
	}
	
}