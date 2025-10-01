package assignment2;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		System.out.println("x+=5="+(x+=5));
		System.out.println("x-=3="+(x-=3));
		System.out.println("x*=2="+(x*=2));
		System.out.println("x/=4="+(x/=4));
		System.out.println("x%=2="+(x%=2));
	}

}
