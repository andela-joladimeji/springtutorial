package com.andela.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		HelloWorldService service = (HelloWorldService) context
				.getBean("helloWorldService"); // cast is ADDED
		// service.setName("Spring 4.1.7 custom");

		System.out.println(service.sayHello());
		service.getEmployees();
		service.getCompanies();
		service.getConfig();

		service.getSalary().calculate();
		service.setSalary((Salary) context.getBean("salary"));
		service.getSalary().calculate();

		service.getAccount().createNewAccount();

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				BankConfig.class);
		BankBranch branch = ctx.getBean(BankBranch.class);

		System.out.println(branch);
	}
}
