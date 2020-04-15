package com.automation_pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class automation_acc_login_page {
	
	Logger LOG = Logger.getLogger("devpinoyLogger");
	WebDriver driver;
	By username1 = By.id("username");//username field in login
	By password1 = By.id("password");// password field in login
	By Loginbutton = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]");// login button in login
	

	
	public automation_acc_login_page(WebDriver driver) 
	{
		this.driver =driver;
	}
	//To click on my account
		public void clickMyAccount() {
			driver.findElement(By.linkText("My Account")).click();//to open login page my accaount is clicked
		}

	//Enter username
	public void automation_username(String username) {

		driver.findElement(username1).sendKeys("nagallabhargavi129@gmail.com");// username will be given in the login field
		LOG.info("Entered Name in the UserName field ");
	}
	
	//Entering the password
	public void automation_password(String password) {
		driver.findElement(password1).sendKeys("Bhargavinagalla");// password is given in login field
		LOG.info("Enterd password in tbe Password field");
	}
	
	//click the login button
	public void automation_loginbtn() {
		driver.findElement(Loginbutton).click();// login button is clicked in login page
		LOG.info("Login Button is Clicked");
	}
	


}
