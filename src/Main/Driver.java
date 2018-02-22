package Main;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int choice;
		double circleRadius, squareLength, triangleSide1, triangleSide2, triangleSide3;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Shape: \n" +
						   "1) Circle\n" +
						   "2) Square\n" +
						   "3) Triangle");
		
		choice = Integer.parseInt(input.nextLine());
		
		switch(choice) {
			case 1:
				System.out.println("Radius of circle: ");
				circleRadius = Integer.parseInt(input.nextLine());
				Shape circle = new Circle(circleRadius);
				
				break;
				
			case 2:
				System.out.println("Side length of square: ");
				squareLength = Integer.parseInt(input.nextLine());
				Shape square = new Square(squareLength);
				
				break;
			
			case 3:
				System.out.println("First triangle side length: ");
				triangleSide1 = Integer.parseInt(input.nextLine());
				System.out.println("Second triangle side length: ");
				triangleSide2 = Integer.parseInt(input.nextLine());
				System.out.println("Third triangle side length: ");
				triangleSide3 = Integer.parseInt(input.nextLine());
				
				Shape triangle = new Triangle(triangleSide1, triangleSide2, triangleSide3);
				
				break;
		}
	}
	
}