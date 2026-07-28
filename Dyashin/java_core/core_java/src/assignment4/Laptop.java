package assignment4;

public class Laptop {
	String brand;
	String processor;
	int price;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop1 = new Laptop();
		laptop1.brand = "Acer";
		laptop1.processor = "Ryzen";
		laptop1.price = 35000;
		
		Laptop laptop2 = new Laptop();
		laptop2.brand = "HP";
		laptop2.processor = "Intel";
		laptop2.price = 45000;
		
		Laptop laptop3 = new Laptop();
		laptop3.brand = "Asus";
		laptop3.processor = "Intel";
		laptop3.price = 25000;
		
		System.out.println("Laptop1: "+laptop1.brand+" , "+"Processor: "+laptop1.processor+" , "+"Price: "+laptop1.price+"\n"+
				"Laptop2: "+laptop2.brand+" , "+"Processor: "+laptop2.processor+" , "+"Price: "+laptop2.price+"\n"+
				"Laptop3: "+laptop3.brand+" , "+"Processor: "+laptop3.processor+" , "+"Price: "+laptop3.price);
	}

}
