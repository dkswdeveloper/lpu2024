package com.lpu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.model.Book;
import com.lpu.service.BookService;

// @RestController // this will send data only in the resonse, 
@Controller // it will accept request, generate model and send to view
public class BookControllerMVC {
	@Autowired
	BookService bookService;
	@GetMapping(value = "/mvc/books")
	public String getBook(@RequestParam("bid") int bid, ModelMap model)
	{	//get a model from service and pass it on to the view (jsp)
		Book book = bookService.find(bid);
		//how to give it to jsp
		// request.setAttribute("book", book);
		//request.getRequestDispatcher("/book-show.jsp").forward(req,res)
		model.put("book", book);
		return "/book-show.jsp"; // name of view to be returned
	}

}
