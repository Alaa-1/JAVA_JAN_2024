package com.alaa.springintro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

	@GetMapping("")
	public String home() {

		return "Hello";
	}

	@GetMapping("/awesome")
	public String awesome() {

		return "<h1>This is Awesome</h1><hr><p> This is an api test</p>";
	}

	// Query PARAMETER
	@GetMapping("/search")
	// https://www.google.com/search?q=spring+boot
	// http://localhost:8080/search?query=api
	public String searchEngine(@RequestParam(value = "query", required = false) String searchQuery) {

		return "You searched for " + searchQuery;
	}

	// PATH VARIABLE
	@GetMapping("/hello/{name}/{id}")
	public String greeting(@PathVariable("name") String name, @PathVariable("id") int userId) {

		return "Good Morning, Good Afternoon, and Good Night " + name + " Your id is: " + userId;
	}

	@GetMapping("/hello/{name}/{count}/{fruit}")
	public String greeting2(@PathVariable("name") String name,
			@PathVariable("count") int count,
			@PathVariable("fruit") String something) {
		
		if (count >10) {
			return name + " has too many " + something;
		}
		return "you found " + name + " and they have " + count + " " + something;
	}

}
