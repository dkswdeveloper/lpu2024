package com.lpu.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpu.model.Student;
import com.lpu.repo.StudentRepository;
//@Compoent , @Service @Repository SAME ANNOTAIONS WITH MINOR DIFFERENCES
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	@Transactional
	public Student add(int roll, String name, String branch, String password) {
		return null;
	}

	@Override
	@Transactional
	public Student update(int roll, Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student login(int roll, String password) {
		return null;
	}

	@Override
	public Student find(int roll) {
		Optional<Student> optStudent = studentRepository.findById(roll);
		if(optStudent.isPresent())
			return optStudent.get();
		else return null;
	}

	@Override
	public boolean remove(int roll) {
		return false;
	}

	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}
}
