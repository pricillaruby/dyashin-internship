package com.classDemo;

public class ConstructorDemo {
	int x;
	//parameterized Constructor
	//without public also constructor is created
	public ConstructorDemo(int y){
		x =  y;
	}
	//Non-Parameterized Constructor
	public ConstructorDemo() {
		x=5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo(10);
		ConstructorDemo cd1 = new ConstructorDemo();
		System.out.println(cd.x+","+cd1.x);
	}

}
