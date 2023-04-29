package com.spring.listpack;

import java.util.List;

public class Employee {
	private int empId;
	private String name;
	private String address;
	private List<Project> projects;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name, String address, List<Project> projects) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.projects = projects;
	}

}
