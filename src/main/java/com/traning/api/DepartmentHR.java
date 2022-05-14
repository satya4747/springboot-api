package com.traning.api;

import org.springframework.stereotype.Component;

@Component()
public class DepartmentHR implements Department {

	@Override
	public String getName() {
		return "HR";
	}

}
