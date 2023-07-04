package com.collection;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> m=new HashMap<>();
		//HashMap m=new HashMap(); //non generic
		m.put(101, "Obaid");
		m.put(102, "David");
		m.put(103, "John");
		m.put(104, "Cena");
		m.put(105, "Mary");
		System.out.println(m);
		
//		System.out.println(m.get(105));
//		System.out.println(m.remove(103)); //remove pair from hashmap
//		System.out.println(m);
//		
//		System.out.println(m.containsKey(101));//true
//		System.out.println(m.isEmpty());//false
//		
//		System.out.println(m.keySet());//returns all the keys as set
//		System.out.println(m.containsKey(101));
//		
//		System.out.println(m.values());//returns all values as collection
//		
//		System.out.println(m.entrySet());//returns all the entries as set
//		
		for(int i :m.keySet()) {
			System.out.println(i);
		}
	}

}
