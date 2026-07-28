package com.collectionSet;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		System.out.println(set);
		System.out.println(set.remove(30));
		System.out.println(set.size());
		System.out.println(set);
		
	}

}
