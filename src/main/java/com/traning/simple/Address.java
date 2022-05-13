package com.traning.simple;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String street;

	public void setStreet(String street) {
		this.street = street;
	}
	public String getStreet() {
		return street;
	}
}
