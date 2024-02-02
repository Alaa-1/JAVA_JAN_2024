package com.alaa.spring1tomany.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.alaa.spring1tomany.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	// Find ALL BOOKS
	List<Book> findAll();
}
