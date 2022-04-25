package edu.monmouth.hw6;
import java.awt.print.Book;
import java.util.Comparator;

public class BookPrice implements Comparator<Book> {
	@Override
	public int compare(Book book1, Book book2)
	{
		return (int)(book1.getPrice()-book2.getPrice());

}
}

	
	


