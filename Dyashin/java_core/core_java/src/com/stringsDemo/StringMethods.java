package com.stringsDemo;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Mango";
		//String created using object
		String str1 = new String("Mango");
		
		System.out.println(str.equals(str1));
		System.err.println(str==str1);
		/*It will return false because str is a String and 
		   str1 is an object
		str will be stored in string constant pool and 
		object stored in memory*/
			System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.contains("o"));
		System.out.println(str.substring(1, 3));
		System.out.println(str.replace("M", "m"));
	}

}
