package iuh.ontapthuchanh.demo.service;

import java.util.List;

import iuh.ontapthuchanh.demo.entity.Book;

public interface BookService {

	public List<Book> findAll();
	public Book findById(int maTim);
	public void save(Book book);
	public void delete(int maXoa);
	
}
