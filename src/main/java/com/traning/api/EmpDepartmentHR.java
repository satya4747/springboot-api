package com.traning.api;

import org.springframework.stereotype.Component;

@Component
public class EmpDepartmentHR implements EmpDepartment {

	@Override
	public String getDepartmentName() {
		return "HR";
	}

}
