package com.sravan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sravan.jpa.repository.IEmployeeDaoRepository;
import com.sravan.model.Employee;
import com.sravan.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private IEmployeeDaoRepository dao;

	/*
	 * @Override public Employee saveEmployee(Employee emp) {
	 * 
	 * return dao.save(emp); }
	 * 
	 * @Override public Employee updateEmployee(Employee emp) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public void deleteEmployee(Integer id) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 * 
	 * @Override public Employee getOneEmployeeById(Integer id) { // TODO
	 * Auto-generated method stub return null; }
	 * 
	 * @Override public List<Employee> getAllEmployees() { // TODO Auto-generated
	 * method stub return null; }
	 */
}
