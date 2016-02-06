package com.java.rest.jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employee")
public class EmployeeResource {
	Employee employee;
	List<Employee> employeeList;
	
	public EmployeeResource() {
		employeeList=new ArrayList<Employee>();
		setEmployee();
	}
	
	@GET
	@Path("get/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmployee(@PathParam("id")
								String id){
		Employee employee=null;
		Object[] objectArray=employeeList.toArray();
		for(Object employeeObj:objectArray){
			employee=(Employee)employeeObj;
			if(employee.getEmployeeID().equalsIgnoreCase(id))
				break;
		}
		return employee;
	}
	
	public void setEmployee(){
		employee=new Employee();
		employee.setEmployeeID("1234");
		employee.setName("Aakash");
		employeeList.add(employee);
		
		employee=new Employee();
		employee.setEmployeeID("4321");
		employee.setName("Vikas");
		employeeList.add(employee);
	}
	
}