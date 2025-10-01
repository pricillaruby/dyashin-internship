package com.customException;

import java.util.Scanner;

public class Example {
	public static void checkAge(int age) throws AgeInvalidException{
		if(age<18) {
			throw new AgeInvalidException("Invalid Age");
		}
		System.out.println("Eligible to vote");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = sc.nextInt();
		try {
			checkAge(age);
		}catch(AgeInvalidException e) {
			System.out.println("Caught an Exception: "+e.getMessage());
		}
	}

}
