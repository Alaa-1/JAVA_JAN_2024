package com.alaa.spring1tomany.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.alaa.spring1tomany.models.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

	// READ ALL
	List<Publisher> findAll();
}
