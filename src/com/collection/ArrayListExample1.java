package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.set(3, "Aamir khan"));
		System.out.println(list);
		System.out.println(list.remove(4));
		System.out.println(list.contains("Aamir khan"));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		Collections.sort(list);
		System.out.println(list);
		/*
		 * list.forEach(itr -> System.out.println(itr));
		 * list.forEach(System.out::println);
		 */
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
			
		}
	}
}
