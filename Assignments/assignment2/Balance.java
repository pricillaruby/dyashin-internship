package assignment2;
import java.util.Scanner;

public class Balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		float balance = in.nextFloat();
		
		System.out.println("Add 200:"+(balance+=200));
		System.out.println("Deduct 50 charges:"+(balance-=50));
		System.out.println("Multiply by 2:"+(balance*=2));
	}

}
