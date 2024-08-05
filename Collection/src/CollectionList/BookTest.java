package CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import Model.Book;

public class BookTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Book> books = new ArrayList<Book>();
		readBooks(books, scanner);

		System.out.println("\nAfter sorting price wise :");
		Collections.sort(books, new PriceComparator());
		printBooks(books);
		
		System.out.println("\nAfter sorting Author wise :");
		Collections.sort(books, new AuthorComparator());
		printBooks(books);
		
		System.out.println("\nAfter sorting Title wise :");
		Collections.sort(books, new TitleComparator());
		printBooks(books);

		System.out.println("\nAfter sorting in descending order publication year wise :");
		Collections.sort(books, new PublicationYearComparator());
		printBooks(books);


		Collections.sort(books,
				new AuthorComparator().thenComparing(new TitleComparator()).thenComparing(new PriceComparator()));
		System.out.println("\nSorted by Author -> Title -> Price:");
		printBooks(books);

		Collections.sort(books, new PublicationYearComparator().thenComparing(new PriceComparator())
				.thenComparing(new AuthorComparator()));
		System.out.println("\nSorted by Publication Year (Desc) -> Price -> Author:");
		printBooks(books);
	}

	private static void readBooks(List<Book> books, Scanner scanner) {
		for (int i = 0; i < 3; i++) {
			System.out.println("\nEnter details for Book " + (i + 1));
			System.out.print("Title : ");
			String title = scanner.next();
			scanner.nextLine();
			System.out.print("Author : ");
			String author = scanner.nextLine();
			System.out.print("Price : ");
			double price = scanner.nextDouble();
			System.out.print("publication year : ");
			int publicationYear = scanner.nextInt();

			books.add(new Book(title, author, price, publicationYear));
		}
	}

	private static void printBooks(List<Book> books) {
		for (Book book : books) {
			System.out.println(book);
		}

	}
}
