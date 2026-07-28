package com.methodDemo;

import java.util.Scanner;

public class AdvancedCalculator {
	public void advCalculator(int a,int b) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Operator(+,-,*,/,%): ");
		char operator = in.next().charAt(0);
		
		switch(operator) {
		case '+':
			System.out.println("Addition: "+(a+b));
			break;
		case '-':
			System.out.println("Subtraction: "+(a-b));
			break;
		case '*':
			System.out.println("Multiplication: "+(a*b));
			break;
		case '/':
			if(a<b) {
				System.out.println("Division is not possible.It only returns zero.");
			}else {
				System.out.println("Division: "+(a/b));
			}
			break;
		case '%':
			System.out.println("Modulus: "+(a%b));
			break;
		default:
			System.out.println("Please choose a Valid Option");
		}
	}

	public void getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		
		AdvancedCalculator advCalc = new AdvancedCalculator();
		advCalc.advCalculator(a, b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvancedCalculator adCalc = new AdvancedCalculator();
		adCalc.getUserInput();
	}

}
