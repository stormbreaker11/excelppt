package com.app.exceltoppt;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ExceltopptApplication implements ApplicationRunner {
	
	private static List<Employee> asList = Arrays.asList( new Employee("Rahul", 1001, "Engineer", "QA", 12000.00),
			new Employee("Kiran", 1002, "Engineer", "Java", 14000.00),
			new Employee("Trisha", 1003, "Administration", "Accountant", 11200.00),
			new Employee("Manoj", 1003, "Engineer", "Java", 2000.00),
			new Employee("Rakesh Sharma", 1004, "Adminstration", "Manager", 2000.00)
			);
	
	public static void main(String[] args) {
		SpringApplication.run(ExceltopptApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		ExportEmployees.createWorkBook(asList);
		ImportEmployees.readExcel();
	}

}
