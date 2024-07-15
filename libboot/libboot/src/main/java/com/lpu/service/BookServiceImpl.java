package com.lpu.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.model.Book;
import com.lpu.repo.BookRepository;
// 3 methods of creating a bean : 1. Component/Service/Repository, 
// 2. Configuration 3. xml 
@Service
public class BookServiceImpl implements BookService{
//	entityManager.getTransaction().begin();
//	entityManager.getTransaction().commit();
	@Autowired
	BookRepository bookRepository; 
	//spring data jpa will create an object
	//that allows us to map book table with book entity class and uses
	// jpa (hibernate) for mapping
	
	@Override
	@Transactional
	public Book add(String title, String author, String publisher) {
		// spring will start transaciton
		Book b = new Book(0, title, author, publisher);
		bookRepository.save(b);
		// spring will commit transaction 
		return b;
	}

	@Override
	public Book update(int bid, Book book) {
		return null;
	}

	@Override
	public List<Book> findByAuthor(String author) {
		return null;
	}

	@Override
	public List<Book> find(int start, int number) {
		return null;
	}

	@Override
	public Book find(int bid) {
		Optional<Book> opt = bookRepository.findById(bid);
		if(opt.isPresent()) return opt.get();
		else return null;
	}

	@Override
	@Transactional
	public boolean remove(int bid) {
		try
		{
		bookRepository.deleteById(bid);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book save(Book book) {
		return this.add(book.getTitle(),book.getAuthor(),book.getPublisher());
	}

}
