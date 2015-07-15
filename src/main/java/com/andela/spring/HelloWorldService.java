package com.andela.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class HelloWorldService {
	private String name;
	private List employees;
	private Set companies;
	private Map config;
	private Salary salary;

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public Map getConfig() {
		System.out.println("Get Config => " + config);
		return config;
	}

	public void setConfig(Map config) {
		this.config = config;
	}

	public Set getCompanies() {
		System.out.println("Get Companies => " + companies);
		return companies;
	}

	public void setCompanies(Set companies) {
		this.companies = companies;
	}

	public void setEmployees(List list) {
		this.employees = list;
	}

	public List getEmployees() {
		System.out.println("List Elements => " + employees);
		return employees;
	}

	private BankAccount account;

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void init() {
		System.out.println("Creating a new HelloWorldService bean");
	}

	public String sayHello() {
		return "This is a Spring Servce => " + name;
	}
}
