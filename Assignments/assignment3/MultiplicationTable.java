package assignment3;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number for table");
		int num = in.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(i+"x"+num+"="+(i*num));
		}
	}

}
