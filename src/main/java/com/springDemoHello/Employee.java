package com.springDemoHello;

public class Employee {
	
	private String name;
	private String city;
	private String salary;
	public Employee() {
	}
	
	public Employee(String name, String city, String salary) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

}
