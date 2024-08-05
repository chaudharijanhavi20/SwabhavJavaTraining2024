package Models;


public class Product {
	 private String name;
	  private double price;

	  public Product(String name, double price) {
	    this.name = name;
	    this.price = price;
	  }

	  public String getName() {
	    return name;
	  }

	  public double getPrice() {
	    return price;
	  }

	  public class Review {

	    private String author;
	    private String rating;
	    private String comment;

	    public Review(String author, String rating, String comment) {
	      this.author = author;
	      this.rating = rating;
	      this.comment = comment;
	    }

	    public String getAuthor() {
	      return author;
	    }

	    public String getRating() {
	      return rating;
	    }

	    public String getComment() {
	      return comment;
	    }
	  }
	}

