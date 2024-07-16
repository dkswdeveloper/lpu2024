package com.lpu.service;

public class BookNotFoundExcpetion extends Exception {
	
	int bid;

	public BookNotFoundExcpetion(int bid) {
		super("Book Not Found with id " + bid);
		this.bid = bid;
	}
	

}
