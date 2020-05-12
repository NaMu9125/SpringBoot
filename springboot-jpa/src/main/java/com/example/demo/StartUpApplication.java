package com.example.demo;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;

@Order(1)
@Component
public class StartUpApplication implements ApplicationRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmployeeRepository repository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Optional<EmployeeEntity> emp = repository.findById(2L);
		logger.info("Employee id 2 -> {}", emp.get());
	}
}
