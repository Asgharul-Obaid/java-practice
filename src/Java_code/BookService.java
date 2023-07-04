package Java_code;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
public static void main(String[] args) {
	
	List<Book> books = BookMain.findList();
	Collections.sort(books,(a,b)->a.getName().compareTo(a.getName()));
	books.forEach(System.out::println);
	System.out.println("++++++++++++++++++++++++");
	List<Book> salarySorted = books.stream().sorted(Comparator.comparingDouble(Book::getSalary)).collect(Collectors.toList());
	salarySorted.forEach(System.out::println);
}	
}
