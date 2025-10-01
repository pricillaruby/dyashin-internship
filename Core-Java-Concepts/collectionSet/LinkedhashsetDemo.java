package com.collectionSet;

import java.util.LinkedHashSet;

public class LinkedhashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> set= new LinkedHashSet<>();
		set.add(2);
		set.add(3);
		set.add(5);
		set.add(6);
		set.add(10);
		System.out.println(set);
		set.addFirst(1);
		System.out.println(set);
		set.addLast(11);
		System.out.println(set);
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
	}

}
