package CollectionList;

import java.util.Comparator;
import Model.Book;

public class BookComparator {
	public static class TitleComparator implements Comparator<Book> {

		@Override
		public int compare(Book book1, Book book2) {

			return book1.getTitle().compareTo(book2.getTitle());
		}

	}

	public static class AuthorComparator implements Comparator<Book> {

		@Override
		public int compare(Book book1, Book book2) {

			return book1.getAuthor().compareTo(book2.getAuthor());
		}

	}

	public static class PriceComparator implements Comparator<Book> {

		public int compare(Book book1, Book book2) {
			if (book1.getPrice() > book2.getPrice())
				return 1;
			if (book1.getPrice() < book2.getPrice())
				return -1;
			return 0;
		}

	}

	public static class PublicationYearComparator implements Comparator<Book> {

		@Override
		public int compare(Book book1, Book book2) {
			if (book1.getPublicationYear() < book2.getPublicationYear())
				return 1;
			if (book1.getPublicationYear() > book2.getPublicationYear())
				return -1;
			return 0;
		}

	}

}
