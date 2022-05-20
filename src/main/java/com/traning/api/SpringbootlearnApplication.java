package com.traning.api;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.traning.api.service.MyService;

@SpringBootApplication
public class SpringbootlearnApplication implements CommandLineRunner{

	@Autowired
	private MyService service;
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootlearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(service.findAll());
		
		service.save(new Employee(2,"Aditya","11","9212009313",new Date()));
		service.save(new Employee(3,"Aditya2","11","9212009313",new Date()));
		service.save(new Employee(4,"Aditya3","11","9212009313",new Date()));
		service.save(new Employee(5,"Aditya4","11","9212009313",new Date()));
		
		System.out.println(service.findAll());
		
		Employee emp = service.findByID(2);
		System.out.println(emp);
		emp.setName("Satya Update 1");
		service.update(emp);
		
		service.delete(1);
		
		System.out.println(service.findAll());
		
		
		
		/*
		Employee stu = service.findById(11);
		System.out.println(stu);
		
		stu.setName("Ducat India");
		service.update(stu);
		
		service.save(new Student(16,"Ftech","location",new Date()));
		
		List<Student> findAll = service.findAll();
		System.out.println(findAll);
		
		service.deleteById(12);
 
		System.out.println(service.findAll());
		
		*/
		
		
	}

}

