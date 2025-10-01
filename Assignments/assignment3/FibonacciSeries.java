package assignment3;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = in.nextInt();
		int f1=0;
		int f2=1;
		for(int i = 0;i<=num;i++) {
			int f3 = f1+f2;
			f1=f2;
			f2=f3;
			System.out.println("Fibonnaci:"+f3);
		}
		
	}

}
