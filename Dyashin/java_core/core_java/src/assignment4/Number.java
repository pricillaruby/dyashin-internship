package assignment4;

public class Number {
	int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number n1 = new Number();
		n1.num = 20;
		Number n2 = new Number();
		n2.num = 5;
		Number n3 = new Number();
		n3.num = 98;
		if(n1.num%2==0) {
			System.out.println("Num1 is even");
		}else {
			System.out.println("Num1 is Odd");
		}
		if(n2.num%2==0) {
			System.out.println("Num2 is even");
		}else {
			System.out.println("Num2 is Odd");
		}
		if(n3.num%2==0) {
			System.out.println("Num3 is even");
		}else {
			System.out.println("Num3 is Odd");
		}
	}

}
