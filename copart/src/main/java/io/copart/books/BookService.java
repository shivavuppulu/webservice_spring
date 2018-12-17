package io.copart.books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Service
public class BookService {
	
	
	private List<Book> books= new ArrayList<>( Arrays.asList(
			new Book("java", "java1","java.com", "12", false),
			new Book("html", "html1","html.com", "15", false),
			new Book("spring", "javaspring1","javaspring.com", "22", false),
			new Book("jax", "uhji","springjax.com", "29", false),
			new Book("python", "jupiter","anaconda.com", "32", false)
			));
	
	public List<Book> getAllBooks(String column,String sort) {
		
			if (sort.equals("desc") ) {
				
				if(column.equals("author") ) {
					Collections.sort(books, Book.COMPARE_BY_AUTHOR_DESC);
				}
				
				else if(column.equals("cost") ) {
					Collections.sort(books, Book.COMPARE_BY_COST_DESC);	
				}
				
				else if(column.equals("bookurl") ) {
					Collections.sort(books, Book.COMPARE_BY_BOOKURL_DESC);
				}
				
				else {
					Collections.sort(books, Book.COMPARE_BY_TITLE_DESC);
				}	
			}
			
			else {
				
				if(column.equals("author") ) {
					Collections.sort(books, Book.COMPARE_BY_AUTHOR);
				}
				
				else if(column.equals("cost") ) {
					Collections.sort(books, Book.COMPARE_BY_COST);
				}
				
				else if(column.equals("bookurl") ) {
					Collections.sort(books, Book.COMPARE_BY_BOOKURL);
				}
				
				else {
					Collections.sort(books, Book.COMPARE_BY_TITLE);
				}
			}
//		String json_string = new Gson().toJson(books);
//		return toPrettyFormat(json_string);
//		//Collections.sort(books,Collections.reverseOrder());
		return books;
		}
	
	
	
//	public static String toPrettyFormat(String jsonString) 
//	  {
//	      JsonParser parser = new JsonParser();
//	      JsonObject json = parser.parse(jsonString).getAsJsonObject();
//
//	      Gson gson = new GsonBuilder().setPrettyPrinting().create();
//	      String prettyJson = gson.toJson(json);
//	      
//	      System.out.println(json);
//	      System.out.println(prettyJson);
//	      return prettyJson;
//	  }
	
	public Book getBook(String title){
		
		return books.stream().filter(t -> t.getTitle().equals(title)).findFirst().get();
	}
	
	public void addBook(Book book) {
		
		books.add(book);
	}

}
