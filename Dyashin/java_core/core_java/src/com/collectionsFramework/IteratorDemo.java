package com.collectionsFramework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//If we remove or change anything in a ArrayList,LinkedList,... inside a
		//for loop ,it shows concurrent exception so we use Iterator
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {  //hasNext()=>check there is an element
			Integer num = iterator.next();
			System.out.println(num);
			if(num.equals(30)) {
				iterator.remove();
			}
		}
		System.out.println(list);
	}

}
