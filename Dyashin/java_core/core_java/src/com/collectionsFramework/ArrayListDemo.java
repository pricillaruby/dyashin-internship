package com.collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dynamic addition of elements
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(15);
		list.add(5);
		list.add(80);
		System.out.println(list);
		//Retrieve
		System.out.println(list.get(2));
		//remove
		list.remove(2);
		System.out.println(list);
		//sort
		Collections.sort(list);
		System.out.println(list);
		//Reverse
		Collections.reverse(list);
		System.out.println(list);
		//shuffle
		Collections.shuffle(list);
		System.out.println(list);
	}
}
