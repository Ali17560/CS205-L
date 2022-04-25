
package edu.monmouth.hw6;
import java.awt.print.Book;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class HW6 {
	public static void main(String[]bookName)throws FileNotFoundException, NumberFormatException, BookException{
		Scanner fileReader = new Scanner (new File(bookName[0]));
		TreeSet<Book> bookTreeS= new TreeSet<>();
		while (fileReader.hasNextLine())
		{
			String bookInformation[] = fileReader.nextLine().split(",");
			BookTypes bookType = null;
			switch(bookInformation[1])
			{
			case "SOFTBACK":
				bookType = BookTypes.SOFTBACK;
				break;
			case "HARDBACK":
				bookType = BookTypes.HARDBACK;
				break;
			case "ELECTRONIC":
				bookType = BookTypes.ELECTRONIC;
				break;
			}
			bookTreeS.add(new Book(Integer.parseInt(bookData[2]), Double.parseDouble(bookData[3]), bookData[0], bookType));
		}
				
			Iterator<Book> iterator = bookTreeS.iterator();
			System.out.print("Tree Set: ");
			while (iterator.hasNext())
				System.out.print(iterator.next());
			TreeSet<Book> priceTreeSet = new TreeSet<>(new BookPrice());
			priceTreeSet.addAll(bookTreeS);
			iterator = priceTreeSet.descendingIterator();
			System.out.print(" Book Price Tree set: ");
			while( iterator.hasNext())
				System.out.print(iterator.next());
				
			
		}
	}


