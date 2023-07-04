package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class TreeSet {
public static void main(String[] args) {
	String str="shabbu";
	LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
	for(int i = 0; i < str.length(); i++) {
		if (!linkedHashSet.add(str.charAt(i))) {
			linkedHashSet.add(str.charAt(i));
		}
	}
	System.out.println(linkedHashSet);
}
}
