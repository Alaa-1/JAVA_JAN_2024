package com.alaa.springlogin.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.alaa.springlogin.models.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

	// READ ALL
	List<Publisher> findAll();
}
