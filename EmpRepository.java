package com.zee.compute.salary.repository;

import com.zee.compute.salary.entity.EmpEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<EmpEntity, Integer> {

	@Query(nativeQuery = true, value = "update emp_table set emp_salary=:emp_salary where emp_email =:emp_email")
	EmpEntity salaryUpdate(String emp_email, int emp_salary);
	
	@Query(nativeQuery = true, value = "Select * from emp_table where emp_email =:emp_email")
	EmpEntity findByEmail(String emp_email);
	

}
