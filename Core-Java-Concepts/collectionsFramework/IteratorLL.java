package com.collectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> things = new LinkedList<>();
		things.add("Pen");
		things.add("Pencil");
		things.add("Note");
		things.add("Paper");
		things.add("Pen");
		
		Iterator<String> iter = things.iterator();
		while(iter.hasNext()) {
			String thing = iter.next();
			System.out.println(thing);
			if(thing.equals("Pen")) {
				iter.remove();
			}
		}
		
		System.out.println(things);
	}

}
