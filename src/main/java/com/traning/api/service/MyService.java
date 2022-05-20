package com.traning.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traning.api.Employee;
import com.traning.api.dao.MyDao;

@Service
public class MyService {
	
	@Autowired
	MyDao dao;
	
	public List<Employee> findAll(){
		return dao.findAll();
	}
	public void save(Employee employee) {
		dao.save(employee);
	}
	public void delete(Integer id) {
		dao.delete(id);
	}
	public Employee findByID(Integer id) {
		return dao.findByID(id);
	}
	public void update(Employee emp) {
		dao.update(emp);
	}
	
	
}