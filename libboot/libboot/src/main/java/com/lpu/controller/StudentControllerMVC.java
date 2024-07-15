package com.lpu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lpu.model.Student;
import com.lpu.service.StudentService;

// @RestController // this will send data only in the resonse, 
@Controller // it will accept request, generate model and send to view
public class StudentControllerMVC {
	@Autowired
	StudentService studentService;
	@GetMapping(value = "/mvc/students")
	public String getStudent(@RequestParam("roll") int roll, ModelMap model)
	{	//get a model from service and pass it on to the view (jsp)
		Student student = studentService.find(roll);
		//how to give it to jsp
		// request.setAttribute("student", student);
		//request.getRequestDispatcher("/student-show.jsp").forward(req,res)
		model.put("student", student);
		return "/student-show.jsp"; // name of view to be returned
	}

}
