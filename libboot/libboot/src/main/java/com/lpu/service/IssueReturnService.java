package com.lpu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lpu.model.Book;
import com.lpu.model.Issue;
import com.lpu.model.Student;


public interface IssueReturnService {
	
	public Issue issueBook(Book book, Student student);
	public Issue returnBook(Book book);
	public List<Issue> getActiveIssues(int roll);

}
