package com.classDemo;

public class WithStaticClass {
	int x=5;
	public static class InnerClass{
		int y=3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithStaticClass ws = new WithStaticClass();
		InnerClass in = new InnerClass();
		System.out.println(ws.x+in.y);
	}

}
