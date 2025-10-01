package com.map;

import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Cricket");
		map.put(2, "Football");
		map.put(3, "Hockey");
		map.put(4, "Basketball");
		map.put(5, "Badminton");
		map.put(6, "Tennis");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get(3));
		map.remove(3);
		System.out.println(map);
		System.out.println(map.size());
	}

}
