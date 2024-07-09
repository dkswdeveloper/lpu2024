package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
//@Table(name="employees") if name is different
public class Employee {
	@Id
//	@Column(name="employeeid") //if name is different
	private int empid;
	private String name;
	// Automatically add foreign key in employee table with name parking_parkingid
//	@JoinColumn(name="parkingid")
	@OneToOne
	Parking parking;
	
	@ManyToOne
	@JoinColumn(name="depid")
	Department department;
//	Employee			ManyToOne		Department
	
	//Asumption : Employee_project : 2 FK employee_empid , project_projid  
	@ManyToMany 
	List<Project> projects = new ArrayList<>();
	
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public Parking getParking() {
		return parking;
	}
	public void setParking(Parking parking) {
		this.parking = parking;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
	
}
