package com.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationProgram {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("This");
		list.add("is");
		list.add("basic");
		System.out.println(list);
		CopyOnWriteArrayList<String> li = new CopyOnWriteArrayList<>(list);
		Iterator<String> itr = li.iterator();
		list.add("program");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(list);
	}
}
