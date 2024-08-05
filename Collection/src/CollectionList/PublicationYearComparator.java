package CollectionList;

import java.util.Comparator;

import Model.Book;

public class PublicationYearComparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		if (book1.getPublicationYear() < book2.getPublicationYear())
			return 1;
		if (book1.getPublicationYear() > book2.getPublicationYear())
			return -1;
		return 0;
	}

}
