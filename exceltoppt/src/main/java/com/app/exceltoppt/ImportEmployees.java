package com.app.exceltoppt;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ImportEmployees {

	

	public static void readExcel() throws IOException {

		Map<String, Integer> requiredHeaders = new LinkedHashMap<>();

		DataFormatter formatter = new DataFormatter();
		FileInputStream fis = new FileInputStream(new File("D:\\Employee.xlsx"));
		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		// creating a Sheet object to retrieve the object
		XSSFSheet sheet = wb.getSheetAt(0);

		for (Cell cell : sheet.getRow(0)) {
			requiredHeaders.put(cell.getStringCellValue(), cell.getColumnIndex());
		}

		java.util.List<Employee> employees = new ArrayList<>();
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			Employee employee = new Employee(formatter.formatCellValue(row.getCell(requiredHeaders.get("Name"))),
					Long.parseLong(formatter.formatCellValue(row.getCell(requiredHeaders.get("Id")))),
					formatter.formatCellValue(row.getCell(requiredHeaders.get("Department"))),
					formatter.formatCellValue(row.getCell(requiredHeaders.get("Designation"))),
					Double.parseDouble(formatter.formatCellValue(row.getCell(requiredHeaders.get("Salary")))));
			employees.add(employee);
		}
		CreatePPTXTable.generateTable(requiredHeaders, employees);
	}
}
