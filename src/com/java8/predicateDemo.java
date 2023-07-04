package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class predicateDemo {
	public static void main(String[] args) {
//		Predicate<Integer> evenPredicate=n -> n%2==0;
//		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
//		for(int no:numbers) {
//			if(evenPredicate.test(no)) System.out.println(no);
//		}
		
		Predicate<Integer> evenPredicate=n -> n%2==0;
		Function<Integer, Integer> multiply=n -> n*n;
	    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
	    for(int no:numbers) {
	    	if (evenPredicate.test(no)) {
				System.out.println(multiply.apply(no));
			}
	    }
	}

}
