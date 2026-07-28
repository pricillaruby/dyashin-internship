package assignment4;

public class Rectangle {
	int length;
	int breadth;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		rectangle.length=50;
		rectangle.breadth =20;
		int  area = rectangle.length * rectangle.breadth;
		System.out.println("Area of Rectangle: "+area);
	}

}
