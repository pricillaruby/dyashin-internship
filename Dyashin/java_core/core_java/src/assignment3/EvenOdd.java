package assignment3;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = in.nextInt();
		if(num%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
	}

}
