package com.traning.api;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class EmpDepartmentAdmin implements EmpDepartment {

	//@Override
	public String getDepartmentName() {
		return "Admin";
	}

}
