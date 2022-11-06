package iuh.ontapthuchanh.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iuh.ontapthuchanh.demo.entity.Book;
import iuh.ontapthuchanh.demo.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	private BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	//
	@GetMapping("")
	public List<Book> findBooks(){
		return bookService.findAll();
	}
	//
	@GetMapping("/{id}")
	public Book findById(@PathVariable int id)
	{
		Book a = new Book(0);
		try {
			a = bookService.findById(id);
		} catch (Exception e) {
			System.err.println(e);
		}
		return a;
	}
	//
	@PostMapping("")
	public Book addBook(@RequestBody Book book)
	{
		bookService.save(book);
		
		return book;
	}
	//
	@PutMapping("")
	public Book updateBook(@RequestBody Book book)
	{
		bookService.save(book);
		
		return book;
	}
	//
	@DeleteMapping("/{id}")
	public String deleteBook(@PathVariable int id) {

		Book book = new Book(0);
		try {
			book = bookService.findById(id);
		} catch (Exception e) {
			System.err.println(e);
			return e.toString();
		}

		bookService.delete(id);

		return "Deleted employee with id : " + id;

	}
	
	
}
