package com.alaa.springlogin.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.alaa.springlogin.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	// Find ALL BOOKS
	List<Book> findAll();
}
