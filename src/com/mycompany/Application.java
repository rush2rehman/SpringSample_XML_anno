package com.mycompany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService cs = ac.getBean("customerService", CustomerService.class);
		System.out.println(cs.findAll().get(0).getFirstName());

	}

}
