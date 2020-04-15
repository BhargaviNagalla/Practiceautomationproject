package com.automation_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class automation_dynamicdata_page 
{
	WebDriver driver;
	
	public automation_dynamicdata_page(WebDriver driver)
	{
		this.driver=driver;
	}
	//Click on demosite
	public void demosite()
	{
		driver.findElement(By.linkText("Demo Site")).click();
	}
	//click More and Dynamic Data option
	public void dynamicdata_attributes()
	{
		Actions act=new Actions(driver);
		WebElement more=driver.findElement(By.linkText("More"));//click on More
		WebElement dd=driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[9]/ul/li[2]/a"));//click on dynamic data 
		act.moveToElement(more);
		act.moveToElement(dd).click().build().perform();
	}
	//click Get Dynamic Data button
	public void dynamicdata()
	{
		driver.findElement(By.xpath("//*[@id=\"save\"]")).click();
	}
	public void quit() 
	{
		driver.close();
	}

}
