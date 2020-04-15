package com.automation_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class automation_register_page 
{
	WebDriver driver;
	
	public automation_register_page(WebDriver driver)
	{
		this.driver=driver;
	}
	//click on My account
	public void automation_registerpage()
	{
		driver.findElement(By.linkText("My Account")).click();
	}
	//Enter the emailid
	public void automation_email(String emailid) 
	{
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[1]/input")).sendKeys("madhu@gmail.com");
	}
	//Enter the password
	public void automation_password(String password)
	{
		driver.findElement(By.id("reg_password")).sendKeys("madhu@123");
	}
	//Click register button
	public void click_registerbtn()
	{
		driver.findElement(By.name("register")).click();
	}
	public void quit() 
	{
		driver.close();
	}
}
