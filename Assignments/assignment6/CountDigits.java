package assignment6;

public class CountDigits {
	public int countDigits(int num) {
		int count = 0;
		while(num!=0) {
			int n = num%10;
			num = num/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 43749;
		CountDigits cd = new CountDigits();
		System.out.println("Count of a Digit: "+cd.countDigits(num));
	}

}
