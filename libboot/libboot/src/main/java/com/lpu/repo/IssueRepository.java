package com.lpu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lpu.model.Issue;

@Repository
public interface IssueRepository extends  JpaRepository<Issue,Integer>{
	
	// in HQL (like object oriented sql )
	// native queries : direct sql : that will run only on mysql
//	@Query(value = "from Issue isu where isu.roll = :roll and isu.actretdate is null")
	@Query(value = "select * from issue where roll = :roll and actretdate is null", 
	nativeQuery = true)
	List<Issue> getActiveIssues(int roll); //not automatic 
	//spring data jpa can not implement it 
	// find, findAll, save, remove, findById : inbuilt by spring data jpa
	// any new function : give me query , create EntityManager, 
	// run the query , get the result set , convert to list 

}
