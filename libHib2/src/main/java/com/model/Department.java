package com.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int depid;
	private String name;
	private Date establishdate;
	
	// Assumption by Hibernate : in the table , employee there is FK department_depid
	@OneToMany (mappedBy = "department") //in class Employee , attribute name of current class
	List<Employee> employees = new ArrayList<>();
	
	
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getEstablishdate() {
		return establishdate;
	}
	public void setEstablishdate(Date establishdate) {
		this.establishdate = establishdate;
	}
	@Override
	public String toString() {
		return "Department [depid=" + depid + ", name=" + name + ", establishdate=" + establishdate + "]";
	}
	
}
