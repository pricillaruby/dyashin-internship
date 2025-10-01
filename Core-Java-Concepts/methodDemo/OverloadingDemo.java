package com.methodDemo;

public class OverloadingDemo {
	//Method OverLoading - same method name but different parameter
	public int add(int a ,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo od = new OverloadingDemo();
		System.out.println(od.add(10, 20));
		System.out.println(od.add(10,20,30));
		System.out.println(od.add(10.0, 20.0));
	}

}
