package com.sravan.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sravan.jpa.repository.IEmployeeDaoRepository;
import com.sravan.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private IEmployeeDaoRepository service;

	@PostMapping(value = "/save")
	public ResponseEntity<Employee> saveEmployee(@ModelAttribute @Valid Employee employee, BindingResult result) {
		if (result.hasErrors()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST
					);
		}
		service.save(employee);
		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
	}

}
