package com.automation_pages;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.excelutility.Excel_data;

public class Login {
	Logger LOG= Logger.getLogger("devpinoyLogger");
	WebDriver driver;
	By username1 = By.id("username");
	By password1 = By.id("password");
	By Loginbutton = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]");
	Excel_data ed = new Excel_data(driver);

	
	public Login(WebDriver driver) 
	{
		this.driver =driver;
	}
	//To click on my account
		public void clickMyAccount() {
			driver.findElement(By.linkText("My Account")).click();
		}

	//Enter username
	public void automation_username(String username) throws IOException {

		driver.findElement(username1).sendKeys(ed.Email());
		LOG.info("Entered Name in the UserName field ");
	}
	
	//Entering the password
	public void automation_password(String password) throws IOException {
		driver.findElement(password1).sendKeys(ed.Password());
		LOG.info("Enterd password in tbe Password field");
	}
	
	//click the login button
	public void automation_loginbtn() {
		driver.findElement(Loginbutton).click();
		LOG.info("Login Button is Clicked");
	}
	
}
