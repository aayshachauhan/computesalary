package com.zee.compute.salary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.zee.compute.salary.*")
@EnableJpaRepositories
public class ComputeSalaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputeSalaryApplication.class, args);
	}

}
