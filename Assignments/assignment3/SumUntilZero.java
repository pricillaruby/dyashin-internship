package assignment3;

import java.util.Scanner;

public class SumUntilZero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum =0;
		for(int i=1;i>0;i++) {
			System.out.println("Enter the number(if 0 it exits the loop):");
			int num = in.nextInt();
			if(num==0) {
				break;
			}
			sum+=num;
		}
		System.out.println("Sum of a number until user enters until 0:"+sum);
	}

}
