package iuh.ontapthuchanh.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import iuh.ontapthuchanh.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
