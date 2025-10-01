package assignment3;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int num = in.nextInt();
		int sum=0;
		while(num!=0) {
			int n = num%10;
			sum+=n;
			num = num/10;
		}
		System.out.println(sum);
	}

}
