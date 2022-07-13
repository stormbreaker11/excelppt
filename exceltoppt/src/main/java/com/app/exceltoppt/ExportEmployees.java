package com.app.exceltoppt;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExportEmployees {

	
	private static List<Employee> asList = Arrays.asList( new Employee("Rahul", 1001, "Engineer", "QA", 12000.00),
			new Employee("Kiran", 1002, "Engineer", "Java", 14000.00),
			new Employee("Trisha", 1003, "Administration", "Accountant", 11200.00),
			new Employee("Trisha", 1003, "Engineer", "Java", 2000.00),
			new Employee("Rakesh Sharma", 1004, "Adminstration", "Manager", 2000.00)
			);
	
	public static void main(String[] args) {
		 createWorkBook(asList);
		 }
	public static void createWorkBook(List<Employee> asList2) {
		try {
			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("Employee List");// creating a blank sheet
			writeHeaderLine(sheet);
			createList(asList, workbook, sheet);
			FileOutputStream out = new FileOutputStream(new File("D://Employee.xlsx")); // file name with path
			workbook.write(out);
			out.close();
			System.out.println("Employees excel created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createList(List<Employee> asList2, XSSFWorkbook workbook, XSSFSheet sheet) {
		
		int rowCount=1;
		for (Iterator iterator = asList2.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			
			Row row=sheet.createRow(rowCount++);
			int columnCount=0;
			
			Cell cell= row.createCell(columnCount++);
			cell.setCellValue(employee.getId());
			
			cell= row.createCell(columnCount++);
			cell.setCellValue(employee.getName());
			
			cell= row.createCell(columnCount++);
			cell.setCellValue(employee.getDesignation());
			
			cell= row.createCell(columnCount++);
			cell.setCellValue(employee.getDepartment());
			
			cell= row.createCell(columnCount++);
			cell.setCellValue(employee.getSalary());
			
		}
	}
	private static void writeHeaderLine(XSSFSheet sheet) {
		   
	        Row headerRow = sheet.createRow(0);
	 
	        Cell headerCell = headerRow.createCell(0);
	        headerCell.setCellValue("Id");
	 
	        headerCell = headerRow.createCell(1);
	        headerCell.setCellValue("Name");
	 
	        headerCell = headerRow.createCell(2);
	        headerCell.setCellValue("Designation");
	 
	        headerCell = headerRow.createCell(3);
	        headerCell.setCellValue("Department");
	 
	        headerCell = headerRow.createCell(4);
	        headerCell.setCellValue("Salary");
	    }
	 
	}
	

	
