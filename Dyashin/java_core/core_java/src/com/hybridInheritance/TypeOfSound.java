package com.hybridInheritance;

public class TypeOfSound implements Cat,Dog{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Animal: Cat sound and Dog sound");
	}

	@Override
	public void dogSound() {
		// TODO Auto-generated method stub
		System.out.println("Dog barks");
	}

	@Override
	public void catSound() {
		// TODO Auto-generated method stub
		System.out.println("Cat says meow");
	}



}
