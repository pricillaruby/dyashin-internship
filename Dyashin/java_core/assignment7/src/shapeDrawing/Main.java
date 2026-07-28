package shapeDrawing;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle();
		circle.draw();
		circle.calculateArea();
		
		Shape triangle = new Triangle();
		triangle.draw();
		triangle.calculateArea();
		
		Shape rectangle = new Rectangle();
		rectangle.draw();
		rectangle.calculateArea();
	}

}
