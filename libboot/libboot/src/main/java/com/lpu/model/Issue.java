package com.lpu.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Issue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int isid;
	
	@OneToOne //assumption book_bid
	@JoinColumn(name="bid")
	@JsonIgnore //do not convert this to json 
	Book book;
	
//	private int bid;
	@OneToOne
	@JoinColumn(name="roll")
	Student student;
	
	@Column(name="isdate")
	private Date isDate;
	@Column(name="expretdate")
	private Date expRetDate;
	@Column(name="actretdate")
	private Date actRetDate;
	@Column(name="fine")
	private Integer fine  = 0; //it can never be null
	
	public Issue(int isid, Book book, Student student, Date isDate, Date expRetDate, Date actRetDate,
			int fine) {
		super();
		this.isid = isid;
		this.book = book;
		this.student = student;
		this.isDate = isDate;
		this.expRetDate = expRetDate;
		this.actRetDate = actRetDate;
		this.fine = fine;
	}
	public Issue() {
		super();
	}
	public int getIsid() {
		return isid;
	}
	public void setIsid(int isid) {
		this.isid = isid;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Date getIsDate() {
		return isDate;
	}
	public void setIsDate(Date isDate) {
		this.isDate = isDate;
	}
	public Date getExpRetDate() {
		return expRetDate;
	}
	public void setExpRetDate(Date expRetDate) {
		this.expRetDate = expRetDate;
	}
	public Date getActRetDate() {
		return actRetDate;
	}
	public void setActRetDate(Date actRetDate) {
		this.actRetDate = actRetDate;
	}
	public Integer getFine() {
		return fine;
	}
	public void setFine(Integer fine) {
		this.fine = fine;
	}
	@Override
	public String toString() {
		return "Issue [isid=" + isid + ", book=" + book.getTitle() + ", student=" + student.getName() + ", isDate=" + isDate
				+ ", expRetDate=" + expRetDate + ", actRetDate=" + actRetDate + ", fine=" + fine + "]";
	}
	
}
/*
 * Create a class Issue 
 * add onetoone mapping for book and student
 * add onetoone mapping in book class
 * create IssueRepository inteface
 * add custom query to it
 * create IssueReturnService interface
 * Implement it using all the repositories required  
 * call it from student controller
*/