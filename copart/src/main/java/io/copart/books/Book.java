package io.copart.books;

import java.util.Comparator;

public class Book {
	
	private String title;
	private String author;
	private String bookurl;
	private String cost;
	private boolean availability;
	
	
	public static Comparator<Book> COMPARE_BY_TITLE = new Comparator<Book>() {
        public int compare(Book one, Book other) {
            return one.title.compareTo(other.title);
            
        }
    };
    
    public static Comparator<Book> COMPARE_BY_TITLE_DESC = new Comparator<Book>() {
        public int compare(Book one, Book other) {
            return (-1)*one.title.compareTo(other.title);
            
        }
    };
    
    public static Comparator<Book> COMPARE_BY_AUTHOR = new Comparator<Book>() {
        public int compare(Book one, Book other) {
            return one.author.compareTo(other.author);
        }
    };
    
    public static Comparator<Book> COMPARE_BY_AUTHOR_DESC = new Comparator<Book>() {
        public int compare(Book one, Book other) {
            return (-1)*one.author.compareTo(other.author);
        }
    };
    
    public static Comparator<Book> COMPARE_BY_BOOKURL = new Comparator<Book>() {
        public int compare(Book one, Book other) {
            return one.bookurl.compareTo(other.bookurl);
        }
    };
    
    public static Comparator<Book> COMPARE_BY_BOOKURL_DESC = new Comparator<Book>() {
        public int compare(Book one, Book other) {
            return (-1)*one.bookurl.compareTo(other.bookurl);
        }
    };
    
    public static Comparator<Book> COMPARE_BY_COST = new Comparator<Book>() {
        public int compare(Book one, Book other) {
            return one.cost.compareTo(other.cost);
        }
    };
	
    public static Comparator<Book> COMPARE_BY_COST_DESC = new Comparator<Book>() {
        public int compare(Book one, Book other) {
            return (-1)*one.cost.compareTo(other.cost);
        }
    };
	
	public Book() {
		
	}
	
	public Book(String title, String author, String bookurl, String cost, boolean availability) {
		super();
		this.title = title;
		this.author = author;
		this.bookurl = bookurl;
		this.cost = cost;
		this.availability = availability;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookurl() {
		return bookurl;
	}
	public void setBookurl(String bookurl) {
		this.bookurl = bookurl;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	

}
