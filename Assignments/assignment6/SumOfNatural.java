package assignment6;

import java.util.Scanner;

public class SumOfNatural {
	public int sumOfNatural(int n) {
		int sum = 0;
		for(int i = 1; i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Any number(Natural): ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		SumOfNatural sn = new SumOfNatural();
		System.out.println("Sum of Natural Numbers: "+sn.sumOfNatural(n));
	}

}
