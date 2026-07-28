package shapeDrawing;

import java.util.Scanner;

public class Rectangle extends Shape{
	Scanner scanner = new Scanner(System.in);
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is a Rectangle");
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Enter Length: ");
		int length = scanner.nextInt();
		System.out.println("Enter Breadth: ");
		int breadth = scanner.nextInt();
		double areaOfRectangle = length*breadth;
		System.out.println("Area of Rectangle: "+areaOfRectangle);
	}

}
