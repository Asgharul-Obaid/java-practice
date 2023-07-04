package com.basicjava.copy;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayDemoProgram {
	public static void main(String[] args) {
	CopyOnWriteArrayList<String> li=new CopyOnWriteArrayList<>();
	li.add("Obaid");
	li.add("Chaudhary");
	li.add("Balaipur");
	CopyOnWriteArrayList<String> l=new CopyOnWriteArrayList<>(li);
	Iterator<String> itr = l.iterator();
	l.add("Uchahra");
	while(itr.hasNext()) {
	System.out.println(itr.next());
	
	
}
	System.out.println(l);
	}
}