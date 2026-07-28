package assignment3;

import java.util.Scanner;

public class ArithmeticOperation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter operator(+,-,*,/)");
		char op = in.next().charAt(0);
		System.out.println("Enter First Number");
		int a = in.nextInt();
		System.out.println("Enter Second Number");
		int b = in.nextInt();
		switch(op) {
		case '+':
			System.out.println("Addition:"+(a+b));
			break;
		case '-':
			System.out.println("Subtraction:"+(a-b));
			break;
		case '*':
			System.out.println("Multiplication:"+(a*b));
			break;
		case '/':
			System.out.println("Division:"+(a/b));
			break;
		default:
			System.out.println("Enter Valid Operator");
		}
	}
}
