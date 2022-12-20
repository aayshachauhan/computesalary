package com.zee.compute.salary.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zee.compute.salary.entity.EmpCalSalary;
import com.zee.compute.salary.entity.EmpConfig;
import com.zee.compute.salary.entity.EmpEntity;
import com.zee.compute.salary.service.EmpConfigService;
import com.zee.compute.salary.service.EmpService;

@RestController
public class EmpController {
	
	private static final String emp_email = null;

	@Autowired
	private EmpService empService;
	
	@Autowired
	private EmpConfigService empconfigservice;

	Logger logger = LoggerFactory.getLogger(EmpController.class);

	
//	@PostMapping("create/employee")
//	 public ResponseEntity<EmpCalSalary> createEmp(@Valid @RequestBody EmpEntity Emp, String email){
//		EmpCalSalary data = empService.createEmployee(Emp);
//        
//		logger.info("Post Api done");
//		
//		return new ResponseEntity<EmpCalSalary>(data,HttpStatus.CREATED);
//
//    }
	
	@PostMapping("create/employee")
	 public ResponseEntity<EmpCalSalary> createEmp(@Valid @RequestBody EmpEntity Emp, String emp_email){
		EmpCalSalary data = empService.createEmployee(Emp);
       
		logger.info("Post Api done");
		
		return new ResponseEntity<EmpCalSalary>(data,HttpStatus.CREATED);

   }
	
	@GetMapping("get/employee")
	public List<EmpEntity> getEmployee() {
		
		logger.info("Get Api done");
		return empService.getEmployee();
	}
	
	@GetMapping("v1/employee")
	public List<EmpConfig> getEmployeeConfig() {
		return empconfigservice.getEmployeeConfig();
	}
	
//  @PostMapping ("create/employee")
//	public ResponseEntity<EmpEntity> createEmployee(@Valid @RequestBody EmpEntity empEntity, HttpServletResponse , String emp_email)
//	{
//		EmpEntity saveEmployee = empService.createUser(empEntity);
//		
//		logger.info("Post Api done");
//
//	return new ResponseEntity<EmpEntity>(saveEmployee, HttpStatus.valueOf(empService.getEmployeeDetails(emp_email)));
//	}
	
//	public ResponseEntity<Map<String,Object>> createEmployee(@Valid @RequestBody EmpEntity empEntity, String emp_email)
//	{
//		Map<String,Object> data = empService.createEmployee(empEntity);
//		
//		logger.info("Post Api done");
//
//		return new ResponseEntity<Map<String,Object>>(data, HttpStatus.CREATED);
//	}	

//	@GetMapping("get/employee/{emp_email}")
//	public Map<String, Object> getEmployeeData(@PathVariable String emp_email)
//	{
//		return empService.getEmployeeDetails(emp_email);
//	}

}
