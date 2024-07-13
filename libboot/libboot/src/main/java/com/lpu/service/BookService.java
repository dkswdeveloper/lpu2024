package com.lpu.service;

import java.util.List;

import com.lpu.model.Book;

public interface BookService {
	Book add(String title, String author, String publisher);
	Book update(int bid, Book book);
	List<Book> findByAuthor(String author);
	List<Book> find(int start, int number);
	Book find(int bid);
	boolean remove(int bid);
	List<Book> findAll();
	Book save(Book book);

}