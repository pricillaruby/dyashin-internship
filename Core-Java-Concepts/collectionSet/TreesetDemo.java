package com.collectionSet;

import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		System.out.println(set);
		set.removeFirst();
		System.out.println(set);
		System.out.println(set.getFirst());
		set.remove(40);
		System.out.println(set);
	}

}
