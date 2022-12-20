package com.zee.compute.salary.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zee.compute.salary.entity.EmpConfig;

@Repository
public interface EmpConfigRepo extends JpaRepository<EmpConfig, Integer> {

	List<EmpConfig> findByName(String name);

//	@Query(nativeQuery = true, value = "select * from emp_config where name =:name")
	//List<EmpConfig> findbyname(String name);


}