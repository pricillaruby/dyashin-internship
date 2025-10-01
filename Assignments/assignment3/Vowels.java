package assignment3;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Letter");
		char l = in.next().charAt(0);
		if((l=='a')||(l=='e')||(l=='i')||(l=='o')||(l=='u')) {
			System.out.println("It is a Vowel");
		}
	}

}
