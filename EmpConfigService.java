package com.zee.compute.salary.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.compute.salary.entity.EmpConfig;
import com.zee.compute.salary.repository.EmpConfigRepo;

@Service
public class EmpConfigService {

	  @Autowired
	    private EmpConfigRepo empconfigrepo;

		public List<EmpConfig> getEmployeeConfig() {
			List<EmpConfig> empConfig = empconfigrepo.findAll();
			return empConfig;
	  }

		public String getData(String name) {

		List<EmpConfig> list =empconfigrepo.findByName(name);

		return list.get(0).getValue();
		}
	    
	    
}