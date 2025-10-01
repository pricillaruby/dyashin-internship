package com.exceptions;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Dividend:");
		int a = sc.nextInt();
		System.out.println("Enter Divisor:");
		int b = sc.nextInt();
		try {
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("Any number cannot be divisible by zero "+e);
		}finally {
			System.out.println("Whatever block is executed , finally block will always executed");
		}
		
		
		
	}

}
