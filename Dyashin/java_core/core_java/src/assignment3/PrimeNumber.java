package assignment3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int num = in.nextInt();
		int i =2;
		int count=0;
		while(i<num) {
			if(num%i==0) {
				count++;
			}
			i++;
		}
		if(count==0) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not a Prime number");
		}
	}

}
