package Tests;

import Models.Product;

public class ProductMain {
	public static void main(String[] args) {
		Product book = new Product("The Pillars of the Earth", 2220);

		Product.Review review = book.new Review("Janhavi", "5 stars", "Thrilling, suspenseful, descriptive word art.");
	    System.out.println("Product: " + book.getName());
	    System.out.println("Review by " + review.getAuthor() + ": " + review.getRating());
	    System.out.println(review.getComment());
	  }
	}

