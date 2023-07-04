package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class MapProgram {
public static void main(String[] args) {
	//creating
	HashSet<Integer> Set = new HashSet<Integer>();
	
	//set
	Set.add(1);
	Set.add(2);
	Set.add(3);
	Set.add(1);
	
	//printing element
	System.out.println(Set);
	
	
	System.out.println("size of element:"+ Set.size());
	
	//iterator
	Iterator itr=Set.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	
    //search contain
//	if (Set.contains(1)) {
//		System.out.println("1 is available");
//	}
//	if (!Set.contains(6)) {
//		System.out.println("doesn't contains available");
//	}
//	//delete
//	Set.remove(1);
//	if (!Set.contains(1)) {
//		System.out.println("doesn't contain! we deleted 1");
//	}
}
}
