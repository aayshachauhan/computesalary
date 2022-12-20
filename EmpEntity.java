package com.zee.compute.salary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.boot.context.properties.bind.Name;
import org.springframework.validation.annotation.Validated;

import com.sun.istack.NotNull;

@Entity
@Table(name="emp_table")
public class EmpEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	
	@Column(name = "emp_name", nullable = false)
	@NotBlank
	@Size(min=3,  message = "Please enter more than 2 characters")
	@Pattern(regexp ="[a-zA-Z]+", message = "Please enter only alphabets")
	private String emp_name;

	@NotBlank
	@Size(min=10,max=10,  message = "Please enter valid Phone number")
	@Column(name = "emp_phone")
	private String emp_phone;
	
	@NotBlank
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", message = "Please enter valid Email ID ")
	@Column(name = "emp_email",unique=true)
	private String emp_email;
	
	@NotBlank
	@Pattern(regexp = "^[0-9]{0,2}$" , message = "Please enter number between 0 to 2 digit")
	@Column(name = "emp_experience")
	private String emp_experience;
	
	private int emp_salary;

	public EmpEntity() {
		
	}
	
	public EmpEntity(String emp_name, String emp_phone, String emp_email, String emp_experience, int emp_salary) {
		super();
		this.emp_name = emp_name;
		this.emp_phone = emp_phone;
		this.emp_email = emp_email;
		this.emp_experience = emp_experience;
		this.emp_salary = emp_salary;

	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public String getEmp_phone() {
		return emp_phone;
	}


	public void setEmp_phone(String emp_phone) {
		this.emp_phone = emp_phone;
	}


	public String getEmp_email() {
		return emp_email;
	}


	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}


	public String getEmp_experience() {
		return emp_experience;
	}


	public void setEmp_experience(String emp_experience) {
		this.emp_experience = emp_experience;
	}

	public int getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}

	
	
	



}
