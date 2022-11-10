package com.app.exceltoppt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExceltopptApplication{

	private static List<Employee> asList =new ArrayList<>(Arrays.asList(new Employee("Rahul", 1001, "Engineer", "QA", 12000.00),
			new Employee("Kiran", 1002, "Engineer", "Java", 14000.00),
			new Employee("Trisha", 1003, "Administration", "Accountant", 11200.00),
			new Employee("Manoj", 1003, "Engineer", "Java", 2000.00),
			new Employee("Rakesh Sharma", 1004, "Adminstration", "Manager", 2000.00)));
	
	private static List<Employee> asList1 =new ArrayList<>(Arrays.asList(new Employee("Rahul", 1001, "Engineer", "QA", 12000.00),
			new Employee("Kiran", 1002, "Engineer", "Java", 14000.00),
			new Employee("Trisha", 1003, "Administration", "Accountant", 11200.00),
			new Employee("Manoj", 1003, "Engineer", "Java", 2000.00),
			new Employee("Rakesh Sharma", 1004, "Adminstration", "Manager", 2000.00),
	new Employee("Rakesh Sharma", 1005, "Adminstration", "Manager", 2000.00)));

	
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		SpringApplication.run(ExceltopptApplication.class, args);
		
		/*
		 * List<Long> collect =
		 * asList.stream().map(Employee::getId).collect(Collectors.toList());
		 * 
		 * asList1.removeIf(e-> collect.contains(e.getId()));
		 * 
		 */
	
		for (Iterator iterator = asList1.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if(asList.contains(employee)) {
				iterator.remove();
			}
		}
		
			System.out.println(asList1);
	}

	/*
	 * @Override public void run(ApplicationArguments args) throws Exception {
	 * ExportEmployees.createWorkBook(asList); ImportEmployees.readExcel(); }
	 */
	
	
	
	
	
	
}
