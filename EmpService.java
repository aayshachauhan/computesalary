package com.zee.compute.salary.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.compute.salary.entity.EmpCalSalary;
import com.zee.compute.salary.entity.EmpEntity;
import com.zee.compute.salary.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	private EmpRepository empRepository;
	
	@Autowired
	private EmpConfigService empConfigService;
	
	public EmpEntity createUser(EmpEntity empEntity) {
		return empRepository.save(empEntity);
	}

	public List<EmpEntity> getEmployee() {
		   List<EmpEntity> empEntity = empRepository.findAll();

			return empEntity;
	}
	
	 public EmpCalSalary createEmployee(EmpEntity employee) {
		   
	        EmpEntity empEntity=empRepository.findByEmail(employee.getEmp_email());
	        Integer value = Integer.parseInt(empConfigService.getData("sal_config"));
	        employee.setEmp_salary(Integer.parseInt(employee.getEmp_experience())*value);
	        EmpCalSalary empCalSalary = new EmpCalSalary();
	        empCalSalary.setName(employee.getEmp_name());
	        empCalSalary.setSalary(employee.getEmp_salary());
			
	        if(empEntity!=null)
	        {
	        	employee.setEmp_id(empEntity.getEmp_id());
	            empRepository.save(employee);

	        }
	        else
	        {
	           empRepository.save(employee);

	        }
	        
	            return empCalSalary;
	       
	 
	    }
		
}
