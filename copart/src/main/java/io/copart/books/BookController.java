package io.copart.books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(
			value = "/books",
			method = RequestMethod.GET)
	@ResponseBody
	public List<Book> getAllBooks(@RequestParam(value="column", required=false) String column, 
									@RequestParam(value="sort", required=false) String sort) {
		if(sort==null) sort = "asc";
		if(column==null) column = "title";
		return bookService.getAllBooks(column,sort);
	}
	
	@RequestMapping("/books/title={title}")
	public Book getBook(@PathVariable String title) {
		
		return bookService.getBook(title);
	}
	
	@RequestMapping(
			value = "/books",
			method = RequestMethod.POST)
	public void addBook(@RequestBody Book book) {
		
		bookService.addBook(book);
	}

}
