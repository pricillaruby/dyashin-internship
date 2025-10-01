package com.collectionsFramework;

import java.util.Collections;
import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> number = new Stack<>();
		//add element
		number.push(10);
		number.push(5);
		number.push(80);
		number.push(50);
		number.push(8);
		number.push(20);
		
		System.out.println("List: "+number);
		//Remove element from stack
		System.out.println("Removed element: "+number.pop());
		System.out.println("List: "+number);
		//get top element
		System.out.println("Top element: "+number.peek());
		//sort
		Collections.sort(number);
		System.out.println("List: "+number);
		//reverse
		Collections.reverse(number);
		System.out.println("List: "+number);
		
		ListIterator<Integer> iterate = number.listIterator();
		while(iterate.hasNext()) {
			Integer num = iterate.next();
			System.out.println(num);
			if(num.equals(8)) {
				iterate.remove();
			}
//			if(num.equals(5)) {
//				iterate.add(30);
//			}
			//set is used to allocate element instead of another element
			if(num.equals(10)) {
				iterate.set(24);
			}
		}
		System.out.println(number);
		
		//Do add and set in iterator
	}

}
