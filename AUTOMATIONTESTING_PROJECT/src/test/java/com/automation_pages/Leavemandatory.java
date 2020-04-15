package com.automation_pages;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Leavemandatory { // All the locators that are used in this class are declared
	WebDriver driver;
	By Demosite = By.xpath("//*[@id=\"menu-item-251\"]/a");
	By Address = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
	By Hobbies_cric = By.xpath("//*[@id=\"checkbox1\"]");
	By Hobbies_Mov = By.xpath("//*[@id=\"checkbox2\"]");
	By Year = By.xpath("//*[@id=\"yearbox\"]");
	By YearPick = By.xpath("//*[@id=\"yearbox\"]/option[84]");
	By Month = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
	By MonthPick = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[4]");
	By Date = By.xpath("//*[@id=\"daybox\"]");
	By DatePick = By.xpath("//*[@id=\"daybox\"]/option[3]");
	By space = By.xpath("//*[@id=\"section\"]/div/div");
	By Skills = By.xpath("//*[@id=\"Skills\"]");
	By SkillsPick = By.xpath("//*[@id=\"Skills\"]/option[8]");
	By CountryName = By.xpath("//*[@id=\"countries\"]/option[106]");
	By Password = By.xpath("//*[@id=\"firstpassword\"]");
	By Confirmpassword = By.xpath("//*[@id=\"secondpassword\"]");
	By Submit = By.xpath("//*[@id=\"submitbtn\"]");

	public Leavemandatory(WebDriver driver) { // Constructor to call the declared methods from the stepdefinition
		this.driver = driver;
	}

	public void demo() { // Method to click the demosite tab
		driver.findElement(Demosite).click();
	}

	public void Attributes() throws InterruptedException { // Method to fill all the fields except mandatory fields
		driver.findElement(Address).sendKeys("4-4-25,Sivalayam Street,chaitanya street,Kurnool-518401");
		driver.findElement(Hobbies_cric).click();
		driver.findElement(Hobbies_Mov).click();
		driver.findElement(space).click();
		driver.findElement(Skills).click();
		driver.findElement(SkillsPick).click();
		driver.findElement(CountryName).click();
		driver.findElement(Year).click();
		driver.findElement(YearPick).click();
		driver.findElement(Month).click();
		driver.findElement(MonthPick).click();
		driver.findElement(Date).click();
		driver.findElement(DatePick).click();
		driver.findElement(Password).sendKeys("hemanth@123");
		driver.findElement(Confirmpassword).sendKeys("hemanth@123");

		Thread.sleep(3000);
	}

	public void submit() throws InterruptedException // Method to click on submit
	{
		driver.findElement(Submit).click();
		Thread.sleep(4000);
	}

	public void screenshot(String path) throws IOException { // Method to take a screenshot
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(path));
	}

	public void quit() { // Method to close the browser
		driver.close();
	}
}
