package shape;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shape = {
				new Circle(),
				new Square(),
				new Triangle()
		};
		
		for(Shape s:shape) {
			s.area();
		}
	}

}
