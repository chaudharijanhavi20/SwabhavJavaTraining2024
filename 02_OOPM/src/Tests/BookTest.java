package Tests;
import Models.Book;
import java.util.Scanner;
import Models.Book;

public class BookTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book books[]=new Book[4];
		for(int i=0;i<books.length;i++) {
		System.out.print("Enter Book Id:");
		int bookId = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter book name:");
		String name = sc.nextLine();
		System.out.print("Enter author name:");
		String author = sc.nextLine();
		System.out.print("Enter price:");
		double price = sc.nextDouble();
		System.out.print("Enter publication:");
		String publication = sc.next();
		 books[i] = new Book(bookId, name, author, price, publication);
		}
		Book.sortByPriceDescending(books);
		for(int i=0;i<books.length;i++) {
			System.out.println("BookId : " + books[i].getbookId());
			System.out.println("Book Name : " + books[i].getName());
			System.out.println("Book Author : " + books[i].getAuthor());
			System.out.println("Price of Book is : " + books[i].getPrice());
			System.out.println("Publication of Book : " + books[i].getPublication());
		}
		
	}
}
