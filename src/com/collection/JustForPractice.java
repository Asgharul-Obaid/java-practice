package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class JustForPractice {
public static void main(String[] args) {
	ArrayList<Object> list = new ArrayList<>();
	list.add(101);
	list.add(102);
	
	for(Object obj:list) {
		list.remove(0);
		list.add(105);
		System.out.println(list);
}
	
}
}
