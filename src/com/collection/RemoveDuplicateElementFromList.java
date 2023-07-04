package com.collection;

import java.util.ArrayList;

public class RemoveDuplicateElementFromList {
	public static void main(String[] args) {
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(2);
		System.out.println(arrayList);

		if (arrayList.contains(1)) {
			System.out.println(arrayList.remove(1));
		}
		if (arrayList.contains(2)) {
			System.out.println(arrayList.remove(2));
		}
		System.out.println(arrayList);
	}
}
