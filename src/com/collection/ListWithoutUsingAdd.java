package com.collection;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListWithoutUsingAdd {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list);
		
		 
		ListIterator<Integer> iterator = list.listIterator();
		while (iterator.hasPrevious()) {
			
			System.err.println(iterator.previous());
			
			//System.out.println();

			
		}
		
					
		}
		
	}


