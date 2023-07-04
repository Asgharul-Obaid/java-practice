package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElemntWithIterator {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<>();
	a.add(1);
	a.add(2);
	a.add(3);
	
	Iterator<Integer> itr = a.iterator();
	while (itr.hasNext()) {
	   Integer value=itr.next();
	   if(value==2 || value==1) {
		   itr.remove();
	   }
	}
	System.out.println(a);
}
}
