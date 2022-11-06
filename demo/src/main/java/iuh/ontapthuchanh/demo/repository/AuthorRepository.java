package iuh.ontapthuchanh.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import iuh.ontapthuchanh.demo.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
