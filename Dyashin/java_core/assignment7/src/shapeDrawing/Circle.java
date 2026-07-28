package shapeDrawing;

import java.util.Scanner;

public class Circle extends Shape{
	Scanner scanner = new Scanner(System.in);
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is a Circle");
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Enter Radius: ");
		double radius = scanner.nextDouble();
		double areaOfCircle = 3.14*radius*radius;
		System.out.println("Area of Circle: "+areaOfCircle);
	}

}
