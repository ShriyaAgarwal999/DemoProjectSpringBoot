package com.springDemoHello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	private List<Employee> employee=new ArrayList<>(Arrays.asList(new Employee("Satya","Jaipur","11lpa"),
				new Employee("Shivam","Lucknow","12lpa"),new Employee("Rashi","Pune","10lpa")));
	
	public List<Employee> getAllTopics()
	{
		return employee;
	}
	
	public Employee getTopics(String id)
	{
		return employee.stream().filter(t -> t.getName().equals(id)).findFirst().get();
	}
	
	public void addEmployee(Employee emp)
	{
		employee.add(emp);
	}

	public void updateEmployee(Employee emp, String name) {
		for(int i=0;i<employee.size();i++)
		{
			Employee e=employee.get(i);
			if(e.getName().equals(name))
			{
				employee.set(i,emp);
				return;
			}
		}
		
	}

	public void deleteEmployee(String name) {
		// TODO Auto-generated method stub
		employee.removeIf(t->t.getName().equals(name));
		
	}

}
