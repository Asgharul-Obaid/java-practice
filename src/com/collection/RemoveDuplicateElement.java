package com.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println(list);

		Set<Integer> set = new LinkedHashSet<>(list);
		System.out.println(set);
	}
}
