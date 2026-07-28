package assignment2;
import java.util.Scanner;

public class Expression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		
		System.out.println("(x>y)&&(y>z)"+((x>y)&&(y>z)));
		System.out.println("(x==y)||(y==z)"+((x==y)||(y==z)));
		System.out.println("!(x<z)"+(!(x<z)));
	}

}
