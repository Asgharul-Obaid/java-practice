package com.collection;

import java.util.ArrayList;
import java.util.List;

public class LL {
public static void main(String[] args) {
	List<Integer> arrayList = new ArrayList<>();
	arrayList.add(1);
	arrayList.add(2);
	for(Integer i:arrayList) {
		System.out.println(i);
	}
	
	//ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList);
	List<Integer> arrayList2 = new ArrayList<>();
	arrayList2.addAll(arrayList);	
	//System.out.println(arrayList2);
	arrayList2.add(3);
	System.out.println(arrayList2);
	for(Integer i:arrayList2) {
		System.out.println(i);
	}
	
}
}
