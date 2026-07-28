package assignment3;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First number");
		int num1 = in.nextInt();
		System.out.println("Enter Second number");
		int num2 = in.nextInt();
		if(num1>num2) {
			System.out.println("Num1 is greater");
		}else {
			System.out.println("Num2 is greater");
		}
	}

}
