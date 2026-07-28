package com.interfaceDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instead of calling Class name we use Interface name
		Shapes square = new Square();
		square.shapeArea();
		Shapes rectangle = new Rectangle();
		rectangle.shapeArea();
		Shapes circle = new Circle();
		circle.shapeArea();
		Shapes triangle = new Triangle();
		triangle.shapeArea();
		Shapes parallelogram = new Parallelogram();
		parallelogram.shapeArea();
	}

}
