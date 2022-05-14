package com.traning.api.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
@Lazy(value = false)
public class MyDao {
	
	@Value("${company.name}")
	private String empName;
	
	public String getEmployeeName() {
		return empName;
	}
	@PostConstruct
	private void init() {
		System.out.println("Bean ready to use Dao");
	}
	@PreDestroy
	private void destroy() {
		System.out.println("bean destroyed Dao");
	}
		
}
