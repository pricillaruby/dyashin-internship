package assignment2;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println("(a==b)"+(a==b));
		System.out.println("(a!=b)"+(a!=b));
		System.out.println("(a>b)"+(a>b));
		System.out.println("(a<=b)"+(a<=b));
	}

}
