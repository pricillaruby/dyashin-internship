package com.operators;

import java.util.Scanner;

public class IfElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		int marks = sc.nextInt();
		if(marks>=90) {
			System.out.println("A+");
		}else if(marks>=80) {
			System.out.println("A");
		}else if(marks>=70) {
			System.out.println("B+");
		}else if(marks>=60) {
			System.out.println("B");
		}else if(marks>=35) {
			System.out.println("C+");
		}else {
			System.out.println("Fail");
		}
	}

}
