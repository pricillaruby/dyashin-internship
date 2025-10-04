package assignment6;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Year to check: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(((year % 4 == 0)&&(year %100!=0))||(year % 400 == 0)) {
			System.out.println("It's a Leap Year");
		}else {
			System.out.println("Not a Leap Year");
		}
	}

}
