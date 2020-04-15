package com.excelutility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Excel_data {
	WebDriver driver;

	public Excel_data(WebDriver driver) {
		this.driver = driver;
	}

	public String Email() throws IOException {

		FileInputStream fil = new FileInputStream(new File("C:\\Users\\Hemanth\\Downloads\\auto_logindetails.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int count = sheet.getLastRowNum();
		System.out.println(count);

		XSSFRow row = sheet.getRow(count);
		XSSFCell cell = row.getCell(0);
		String un = cell.getStringCellValue();
		return un;
	}

	public String Password() throws IOException {

		FileInputStream fil = new FileInputStream(new File("C:\\Users\\Hemanth\\Downloads\\auto_logindetails.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fil);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int count = sheet.getLastRowNum();
		System.out.println(count);

		XSSFRow row = sheet.getRow(count);
		XSSFCell cell = row.getCell(1);
		String pwd = cell.getStringCellValue();

		return pwd;

	}
}