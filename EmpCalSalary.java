package com.zee.compute.salary.entity;

public class EmpCalSalary {

	private String name;
	
	
	private int salary;

	public EmpCalSalary() {
		
	}
	
	public EmpCalSalary(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
