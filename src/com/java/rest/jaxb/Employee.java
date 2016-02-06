package com.java.rest.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

	private String employeeID;
	private String name;

	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}