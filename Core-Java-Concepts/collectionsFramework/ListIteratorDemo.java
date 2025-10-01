package com.collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		ListIterator<Integer> number = list.listIterator();
		System.out.println("Forward Direction");
		while(number.hasNext()) {
			Integer num = number.next();
			System.out.println(num);
		}
		System.out.println();
		System.out.println("Backward Direction");
		while(number.hasPrevious()) {
			Integer num = number.previous();
			System.out.println(num);
		}
		
		//LinkedList - ListIterator
		List<String> foods = new LinkedList<>();
		foods.add("Pizza");
		foods.add("Burger");
		foods.add("Fries");
		foods.add("Chicken");
		
		ListIterator<String> iterator = foods.listIterator();
		System.out.println("Forward Direction");
		while(iterator.hasNext()) {
			String food = iterator.next();
			System.out.println(food);
		}
		System.out.println();
		System.out.println("Backward Direction");
		while(iterator.hasPrevious()) {
			String food = iterator.previous();
			System.out.println(food);
		}
		
	}
}
