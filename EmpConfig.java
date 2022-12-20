package com.zee.compute.salary.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_config")
public class EmpConfig {	
	
	@Id
	private int id;
	
	private String name;
	
	private String value;

	public EmpConfig() {
		
	}
	public EmpConfig(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}



}