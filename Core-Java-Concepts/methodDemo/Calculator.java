package com.methodDemo;

public class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public int mod(int a,int b) {
		return a%b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		System.out.println("Addition: "+calc.add(20,10));
		System.out.println("Subtraction: "+calc.sub(20,10));
		System.out.println("Multiplication: "+calc.mul(20,10));
		System.out.println("Division: "+calc.div(20,10));
		System.out.println("Modulus: "+calc.mod(20,10));
		
	}

}
