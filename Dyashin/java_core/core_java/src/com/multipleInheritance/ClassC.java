package com.multipleInheritance;

public class ClassC implements ClassA,ClassB{

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("Class C inherits B");
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("Class C inherits A");
	}

}
