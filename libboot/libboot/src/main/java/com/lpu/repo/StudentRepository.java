package com.lpu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lpu.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
