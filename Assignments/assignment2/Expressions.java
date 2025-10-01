package assignment2;
import java.util.Scanner;

public class Expressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		boolean a = in.nextBoolean();
		boolean b = in.nextBoolean();
		boolean c = in.nextBoolean();
		System.out.println("(a&&b)"+(a&&b));
		System.out.println("(a||c)"+(a||c));
		System.out.println("!(b&&c)"+!(b&&c));
	}

}
