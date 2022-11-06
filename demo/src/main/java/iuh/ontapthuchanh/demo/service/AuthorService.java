package iuh.ontapthuchanh.demo.service;

import java.util.List;

import iuh.ontapthuchanh.demo.entity.Author;

public interface AuthorService {

	public List<Author> findAll();
	public Author findById(int maTim);
	public void save(Author author);
	public void delete(int maXoa);
	
}
