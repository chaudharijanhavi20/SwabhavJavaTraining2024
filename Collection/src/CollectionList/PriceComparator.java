package CollectionList;

import java.util.Comparator;

import Model.Book;

public class PriceComparator implements Comparator<Book> {

	public int compare(Book book1, Book book2) {
		if (book1.getPrice() > book2.getPrice())
			return 1;
		if (book1.getPrice() < book2.getPrice())
			return -1;
		return 0;
	}

}
