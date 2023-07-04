package com.java8;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomPredicateNumbers {
public static void main(String[] args) {
	Supplier<Date> date=() -> new Date(System.currentTimeMillis());
	Predicate<Integer> evenPredicate=n -> n%2==0;
	Function<Integer, Integer> multiply= n -> (n*n*n);
	Consumer<Integer> consumer=n->System.out.println(n);
	List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
    for(int no : numbers) {
    	if (evenPredicate.test(no)) {
			consumer.accept(multiply.apply(no));
		}
    	System.out.println(date.get());
    	
    	numbers.forEach(System.out::println);
    }
   
}
}
