package Java_code;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
	public static List<Book> findList(){
		
		 List<Book> book = new ArrayList<>(); 
		 book.add(new Book(1,10,"java",40000.0D));
		 book.add(new Book(2,11,"C++",30000.0D));
		 book.add(new Book(3,12,"Python",35000.0D));
		 book.add(new Book(4,13,"ASP.Net",25000.0D));
		 book.add(new Book(5,12,"Project Management",15000.0D));
		 
		
		return book;
	}
}
