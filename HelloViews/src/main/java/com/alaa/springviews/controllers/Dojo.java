package com.alaa.springviews.controllers;

public class Dojo {

	// MEMBER VARIBALE
	private String name;

	// zero-args constructor
	public Dojo() {}
	
	// overloading constructor
	public Dojo(String name) {
		this.name = name;
	}
	
	// GETTERS & SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
