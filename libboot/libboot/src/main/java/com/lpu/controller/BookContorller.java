package com.lpu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.model.Book;
import com.lpu.service.BookNotFoundExcpetion;
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
	public Book getBook(@PathVariable("bid") int bid) throws BookNotFoundExcpetion
	{
		return bookService.find(bid); //it can throw an exception 
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
	@DeleteMapping(value="/books/{bid}")
	public String removeBook(@PathVariable("bid") int bid)
	{
		boolean status = bookService.remove(bid);
		return "Deleted " + bid + ":" + status;
	}
	@PutMapping(value="/books/", consumes = "application/json", 
			produces = "application/json")
	public ResponseEntity updateBook(@RequestBody Book book)
	{
		try
		{
			Book updatedBook = bookService.update(book.getBid(), book);
			return ResponseEntity.status(HttpStatus.OK)
					.body(updatedBook);
		}
		catch(RuntimeException e)
		{
			String message = e.getMessage();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("Some Error : " + message);
		}
		
	}
	@ExceptionHandler
	public ResponseEntity sendErrorMessage(BookNotFoundExcpetion e)
	{
		String message = e.getMessage();
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body("Handler says NO BOOK : " + message);
	}
}
