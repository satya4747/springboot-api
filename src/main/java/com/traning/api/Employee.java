package com.traning.api;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Employee {
	
	@Id
    @GeneratedValue
	Integer id;
	
	String name;
	
	String age;
	
	String mobileNumber;
	
	Date datetime;
	
	public Employee() {}
	
	public Employee(Integer id, String name, String age, String mobileNumber, Date datetime) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", mobileNumber=" + mobileNumber
				+ ", datetime=" + datetime + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
}
