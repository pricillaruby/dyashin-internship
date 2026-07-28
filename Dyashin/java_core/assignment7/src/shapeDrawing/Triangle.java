package shapeDrawing;

import java.util.Scanner;

public class Triangle extends Shape{
	Scanner scanner = new Scanner(System.in);
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is a Triangle");
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Enter Height: ");
		int height = scanner.nextInt();
		System.out.println("Enter Breadth: ");
		int breadth = scanner.nextInt();
		double areaOfTriangle = 0.5*height*breadth;
		System.out.println("Area of Triangle: "+areaOfTriangle);
	}

}
