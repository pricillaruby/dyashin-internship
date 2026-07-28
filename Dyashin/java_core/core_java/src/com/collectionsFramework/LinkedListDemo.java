package com.collectionsFramework;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<>();
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("banana");
		list.add("guava");
		list.add("grapes");
		list.add("strawberry");
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
