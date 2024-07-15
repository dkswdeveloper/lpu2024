package com.lpu.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.model.Book;
import com.lpu.model.Issue;
import com.lpu.model.Student;
import com.lpu.repo.BookRepository;
import com.lpu.repo.IssueRepository;
import com.lpu.repo.StudentRepository;

@Service
public class IssueReturnServiceImpl implements IssueReturnService{
	
	@Autowired
	IssueRepository issueRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	BookRepository bookRepository;
	
	@Override
	@Transactional
	public Issue issueBook(Book book, Student student) {
		return null;
	}

	@Override
	@Transactional
	public Issue returnBook(Book book) {
		return null;
	}

	@Override
	public List<Issue> getActiveIssues(int roll) {
		return issueRepository.getActiveIssues(roll);
	}

}
