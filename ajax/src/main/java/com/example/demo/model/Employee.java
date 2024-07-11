package com.example.demo.model;

public class Employee {

	private int empid;
	private String name, email, phone;
	
	public Employee(int empid, String name, String email, String phone) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public Employee() {
		super();
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
}
