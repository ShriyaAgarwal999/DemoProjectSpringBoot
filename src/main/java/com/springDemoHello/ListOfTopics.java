package com.springDemoHello;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class ListOfTopics {
	
	@Autowired
	private EmployeeService employee;
	
	@RequestMapping("/emp")
	public List<Employee> getAllTopics()
	{
		return employee.getAllTopics();
	}

//	@RequestMapping("emp/{name}")
//	public Employee getTopics(@PathVariable String name)
//	{
//		return employee.getTopics(name);
//	}
	//Use of PathParam
	@GET
	@Path("emp/{name}")
	//@RequestMapping("emp/{name}")
	public Response getTopics(@PathParam("name") String name)
	{

		return Response.status(200).entity("details "+employee.getTopics(name)).build();
	}

	//Use of QueryParam
	@GetMapping("/data")
	public Employee add(@QueryParam("name") String name,
									 @QueryParam("city") String city, @QueryParam("salary") String salary) {
		Employee emp = new Employee();
		emp.setName(name);
		emp.setCity(city);
		emp.setSalary(salary);
		return emp;
	}

	@RequestMapping(method=RequestMethod.POST,value="/emp")
	public void addEmployee(@RequestBody Employee emp)
	{
		employee.addEmployee(emp);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/emp/{name}")
	public void updateEmployee(@RequestBody Employee emp,@PathVariable String name)
	{
		employee.updateEmployee(emp,name);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/emp/{name}")
	public void deleteEmployee(@PathVariable String name)
	{
		employee.deleteEmployee(name);
	}
}
