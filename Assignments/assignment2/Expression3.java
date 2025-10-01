package assignment2;

import java.util.Scanner;

public class Expression3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		System.out.println("(a>b)||(b>c))&&(a!=c)"+(((a>b)||(b>c))&&(a!=c)));
		System.out.println("!((a<b)&&(b<c))"+(!((a<b)&&(b<c))));
	}

}
