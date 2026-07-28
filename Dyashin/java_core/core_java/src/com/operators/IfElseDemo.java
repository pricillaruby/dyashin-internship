package com.operators;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter age");
		int age = in.nextInt();
		if(age>=18) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not Eligible to vote");
		}
	}

}
