package com.classDemo;

public class StaticVariableDemo {
	//static variable
	static int x=5;
	public static class InnerClass{
		static int y=3;   //If you are using static for varaible inside static innerclass
						// Access using Class Name
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x+InnerClass.y);
	}

}
