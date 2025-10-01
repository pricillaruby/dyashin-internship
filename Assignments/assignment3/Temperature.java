package assignment3;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Temperature");
		int temp = in.nextInt();
		if(temp>40) {
			System.out.println("Very Hot");
		}else if(temp>30) {
			System.out.println("Hot");
		}else if(temp>20) {
			System.out.println("Warm");
		}else {
			System.out.println("Cold");
		}
	}
	

}
