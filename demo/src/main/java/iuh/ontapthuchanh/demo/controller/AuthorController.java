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

import iuh.ontapthuchanh.demo.entity.Author;
import iuh.ontapthuchanh.demo.service.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {

	private AuthorService authorService;

	@Autowired 
	public AuthorController(AuthorService authorService) {
		this.authorService = authorService;
	}
	//
	@GetMapping("")
	public List<Author> findAuthors(){
		return authorService.findAll();
	}
	//
	@GetMapping("/{id}")
	public Author findById(@PathVariable int id)
	{
		Author a = new Author(null);
		try {
			a = authorService.findById(id);
		} catch (Exception e) {
			System.err.println(e);
		}
		return a;
	}
	//
	@PostMapping("")
	public Author AddAuthor(@RequestBody Author author)
	{
		authorService.save(author);
		
		return author;
	}
	//
	@PutMapping("")
	public Author UpdateAuthor(@RequestBody Author author)
	{
		authorService.save(author);
		
		return author;
	}
	//
	@DeleteMapping("/{id}")
	public String deleteAuthor(@PathVariable int id) {

		Author author = new Author(null);
		try {
			author = authorService.findById(id);
		} catch (Exception e) {
			System.err.println(e);
			return e.toString();
		}

		authorService.delete(id);

		return "Deleted employee with id : " + id;

	}
	
	
}
