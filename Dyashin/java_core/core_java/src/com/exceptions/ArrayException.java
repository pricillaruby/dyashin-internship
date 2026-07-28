package com.exceptions;

import java.util.Scanner;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = sc.nextInt();
		System.out.println("Enter array elements: ");
		int[] array = new int[size];
		for(int i = 0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		try {
			System.out.println(array[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size is out of bound "+e);
		}
	}

}
