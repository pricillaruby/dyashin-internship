package com.arraysDemo;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Normal Method of creating array
		int[] arr = {10,20,30};
		//forLoop
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//Array created using object
		int[] arr1 = new int[5];
		arr1[0]= 10;
		arr1[1]=20;
		arr1[2]= 30;
		//forEach method - enhanced forLoop
		for(int num:arr1) {
			System.out.println(num);
		}
		//char array
		char[] arr2 = {'a','b','c','5'};
		for(char letters:arr2) {
			System.out.println(arr2);
		}
		//string array
		String [] arr3 = {"apple","mango","bananan","45"};
		for(String fruits:arr3) {
			System.out.println(fruits);
		}
		
		//Array Methods
		//equals
		System.out.println(Arrays.equals(arr, arr1));
		//sort 
		int[] arr4 = {2,1,5,10,6};
		Arrays.sort(arr4);
		//without using for loops, printing array
		System.out.println(Arrays.toString(arr4));
		
		//sorting char array
		char [] arr5 = {'f','a','x','b'};
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5));
		
		char [] arr6 = {'f','a','x','b','+','3','|',':'};
		Arrays.sort(arr6);
		System.out.println(Arrays.toString(arr6));
		
		char [] arr7 = {'f','a','x','b','5','|'};
		Arrays.sort(arr7);
		System.out.println(Arrays.toString(arr7));
	}

}
