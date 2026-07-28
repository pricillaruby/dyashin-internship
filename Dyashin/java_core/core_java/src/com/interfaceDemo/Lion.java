package com.interfaceDemo;

public class Lion implements Animal{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion = new Lion();
		lion.typeOfAnimal();
	}

	@Override
	public void typeOfAnimal() {
		// TODO Auto-generated method stub
		System.out.println("Carnivores");
	}

}
