package assignment3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int num = in.nextInt();
		int fact = 1;
		for(int i =1;i<=num;i++) {
			fact*=i;
		}
		System.out.println(fact);
	}

}
