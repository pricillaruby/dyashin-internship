package com.operators;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//post increment
		int x = 3;
		int y = x++;
		
		System.out.println(y);
		System.out.println(x);
		
		//post increment
		y = x--;
		System.out.println(y);
		
		//pre increment
		y = --x;
		System.out.println(y);
		
	}

}
