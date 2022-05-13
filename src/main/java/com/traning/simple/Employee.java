package com.traning.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String name;

	@Autowired //Autowiring by type from bean name 'employee' to bean named 'address'
	private Address address;

	//@Autowired(required = false) // to resolve the conflict
	@Autowired
	private EmpDepartment empDepartmentHR;


	//Autowiring by type from bean name 'employee' via constructor to bean named 'address'
	//	Employee(Address address){
	//		this.address = address;
	//	}

	public String getName() {
		return name;
	}

	public EmpDepartment getEmpDepartment() {
		return empDepartmentHR;
	}

	public void setEmpDepartment(EmpDepartment empDepartment) {
		empDepartmentHR = empDepartment;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	//@Autowired  //Autowiring by type from bean name 'employee' to bean named 'address'
	public void setAddress(Address address) {
		this.address = address;
	}

//	@PostConstruct
//	void init() {
//		System.out.println("created successfully");
//	}
//
//	@PreDestroy
//	void destructor() {
//		System.out.println("destroy successfully");
//	}
}
