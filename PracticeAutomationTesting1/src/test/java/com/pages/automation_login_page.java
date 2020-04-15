package com.pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class automation_login_page {
	Logger log = Logger.getLogger("devpinoyLogger");
	WebDriver driver;
	By username1 = By.id("username");//id of username is called
	By password1 = By.id("password");//id of password is called
	By Loginbutton = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]");//xpath of loginbutton is called
	

	
	public automation_login_page(WebDriver driver) 
	{
		this.driver =driver;
	}
	//To click on my account
		public void clickMyAccount() {
			driver.findElement(By.linkText("My Account")).click();//my account is clicked by using click operation
		}

	//Enter username
	public void automation_username(String username) {

		driver.findElement(username1).sendKeys("nagallabhargavi129@gmail.com");//username is given in send keys
		log.info("Entered Name in the UserName field ");
	}
	
	//Entering the password
	public void automation_password(String password) {
		driver.findElement(password1).sendKeys("Bhargavinagalla");//password is given in send keys
		log.info("Enterd password in tbe Password field");
	}
	
	//click the login button
	public void automation_loginbtn() {
		driver.findElement(Loginbutton).click();//Login button is clicked by using click 
		log.info("Login Button is Clicked");
	}
	


}
