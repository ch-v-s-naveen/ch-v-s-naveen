package com.hibernate.test.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.test.persist.PersistingLoicService;

@RestController
public class EmployeeController {

	@PostMapping("/insertEmployee")
	public String insertEmployye() {
		PersistingLoicService  ds =  new PersistingLoicService();
		ds.dave();
		return null;
		
	}
}
