package com.lpu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.model.Book;
import com.lpu.service.BookService;

@RestController
public class BookContorller {
	//BookController class is dependent on BookRepository 
	//I want spring to create an object of BookRepository and 
	// inject it here 
	// How will it search the bookRepo
	// 1. ByName
	// 2. ByType
	// 3. Constructor
	// Object created by Spring is called bean 
	
	@Autowired
	BookService bookService;
	
	@GetMapping(value = "/books", produces = "application/json")
	public List<Book> getBooks()
	{
		return bookService.findAll();
	}
	@GetMapping(value = "/books/{bid}", produces = "application/json")
	public Book getBook(@PathVariable("bid") int bid)
	{
		return bookService.find(bid);
	}
	//will get some data, save in DB, send some data
	@PostMapping(value="/books",consumes = "application/json", produces = "application/json")
	@CrossOrigin(origins = {"*", "**/*"} )
	public Book saveBook(@RequestBody Book book)
	{
		Book bk = bookService.save(book);
		System.out.println("book saved :" + bk);
		return bk;
	}
	

}
