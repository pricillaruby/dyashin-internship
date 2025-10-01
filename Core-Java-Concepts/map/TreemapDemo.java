package com.map;

import java.util.TreeMap;

public class TreemapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> map = new TreeMap<>();
		map.put("Apple",100);
		map.put("Mango",200);
		map.put("Cherry",300);
		map.put("Orange",400);
		map.put("Banana",500);
		System.out.println(map);
		System.out.println(map.get("Orange"));
		System.out.println(map.containsKey("Apple"));
		System.out.println(map.containsValue(300));
	}

}
