package assignment5;

public class Outer {
	static int x=10;
	public static class Middle{
		int y = 20;
		public class Inner{
			int z = 30;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
		Middle mid = new Middle();
		System.out.println(mid.y);
		
		Middle.Inner in = mid.new Inner();
		System.out.println(in.z);
	}

}
