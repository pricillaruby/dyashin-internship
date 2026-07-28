package assignment5;

public class Laptop {
	String brand="HP";
	public static class Processor{
		String processorType="Intel";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop lap = new Laptop();
		System.out.println(lap.brand);
		
		Processor process = new Processor();
		System.out.println(process.processorType);
	}

}
