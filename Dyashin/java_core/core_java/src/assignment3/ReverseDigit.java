package assignment3;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int num = in.nextInt();
		while(num!=0) {
			int n = num%10;
			System.out.print(n);
			num = num/10;
		}
	}

}
