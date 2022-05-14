package com.traning.api.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.traning.api.dao.MyDao;

@Service
@Lazy(value = false)
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyService {
	
	@Autowired
	MyDao dao;
	
	public String getEmployeeName() {
		return dao.getEmployeeName();
	}
	@PostConstruct
	private void init() {
		System.out.println("Bean ready to use");
	}
	@PreDestroy
	private void destroy() {
		System.out.println("bean destroyed");
	}
}