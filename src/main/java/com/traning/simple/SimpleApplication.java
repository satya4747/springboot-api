package com.traning.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@SpringBootApplication
@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class SimpleApplication {

	public static void main(String[] args) {
		//ApplicationContext app = SpringApplication.run(SimpleApplication.class, args);
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SimpleApplication.class);
		Employee bean = app.getBean(Employee.class);
		System.out.println(bean);
		System.out.println(bean.getAddress());
		System.out.println(bean.getEmpDepartment().getDepartmentName());

		Employee bean1 = app.getBean(Employee.class);
		System.out.println(bean1);
		System.out.println(bean1.getAddress());
		System.out.println(bean1.getEmpDepartment());
	}
}
// Autowiring by type from bean name 'employee' via constructor to bean named 'address'