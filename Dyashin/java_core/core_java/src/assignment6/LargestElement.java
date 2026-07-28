package assignment6;

public class LargestElement {
	public int findLargest(int[] array) {
		int max =0;
		for(int num:array) {
			if(num>max) {
				max = num;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,9,15,10,3};
		LargestElement large = new LargestElement();
		System.out.println("Largest Element of an Array: "+large.findLargest(array));
	}

}
