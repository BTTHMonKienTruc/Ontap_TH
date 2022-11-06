package iuh.ontapthuchanh.demo.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iuh.ontapthuchanh.demo.entity.Book;
import iuh.ontapthuchanh.demo.repository.BookRepository;
import iuh.ontapthuchanh.demo.service.BookService;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book findById(int maTim) {
		// TODO Auto-generated method stub

		Optional<Book> result = bookRepository.findById(maTim);
		Book a = null;
		if (result.isPresent()) {
			a = result.get();
		} else {
			throw new RuntimeException("khong tim thay ma - " + maTim);
		}
		return a;
	}

	@Override
	public void save(Book book) {
		bookRepository.save(book);
	}

	@Override
	public void delete(int maXoa) {
		bookRepository.deleteById(maXoa);
	}

}
