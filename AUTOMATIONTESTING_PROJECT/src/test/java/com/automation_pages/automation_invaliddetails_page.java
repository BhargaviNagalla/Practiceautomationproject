package com.automation_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class automation_invaliddetails_page 
{
	WebDriver driver;
	
	public automation_invaliddetails_page(WebDriver driver)
	{
		this.driver=driver;
	}
	//click on Demosite
	public void click_demosite() 
	{
		driver.findElement(By.xpath("//*[@id=\"menu-item-251\"]/a")).click();
	}
	//Fill the demosite register form with invalid details
	public void invaliddetails_register()
	{
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("madhu");//enter firstname
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("majeti");//enter lastname
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("madhu");//enter invalid emailid
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("0123456789");//enter phone number
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();//select gender
		driver.findElement(By.xpath("//*[@id=\"countries\"]")).click();//click on country
		driver.findElement(By.xpath("//option[@value='India']")).click();//and select country
	}
	//click submit button
	public void Submit()
	{
		driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
	}
	
	public void quit() 
	{
		driver.close();
	}
}
