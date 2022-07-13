package com.app.exceltoppt;

import java.io.Serializable;

public class Employee implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private long id;
	private String department;
	private String designation;
	private double salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Employee(String name, long id, String department, String designation, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", department=" + department + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
	public Employee() {
	}
}
