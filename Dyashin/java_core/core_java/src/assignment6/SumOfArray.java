package assignment6;

public class SumOfArray {

	public int sumOfArray(int[] array) {
		int sum = 0;
		for(int num:array) {
			sum+=num;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		SumOfArray arr = new SumOfArray();
		System.out.println("Sum of Array: "+arr.sumOfArray(array));
	}

}
