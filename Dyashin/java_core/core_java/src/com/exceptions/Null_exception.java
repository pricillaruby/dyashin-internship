package com.exceptions;

public class Null_exception {
	public static void main(String args[]) {
		try {
			String a = null;
			System.out.println(a.length());
		}catch(NullPointerException e) {
			System.out.println(e);
		}
	}

}
