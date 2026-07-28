package com.exceptions;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String a = "Hey";
			int value = Integer.parseInt(a);
			System.out.println(value);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
	}

}
