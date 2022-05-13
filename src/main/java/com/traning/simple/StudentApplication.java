package com.traning.simple;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Student bean = applicationContext.getBean(Student.class);
		System.out.println(bean);
		System.out.println(bean.getName());
		System.out.println(bean.getAge());
		System.out.println(bean.getResult().getMath());
	}

}
