package com.automation_pages;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class automation_filedownload_page 
{
	WebDriver driver;
	
	public automation_filedownload_page(WebDriver driver)
	{
		this.driver=driver;
	}
	//click on Demosite
	public void demosite()
	{
		driver.findElement(By.linkText("Demo Site")).click();
	}
	//Click on More and Filedownload option
	public void filedownload_attributes()
	{
		Actions act=new Actions(driver);
		WebElement more=driver.findElement(By.linkText("More"));//click on more
		WebElement fd=driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[9]/ul/li[3]/a"));//click on Filedownload
		act.moveToElement(more);
		act.moveToElement(fd).click().build().perform();
	}
	public void filedownload()
	{
		//Enter the data in the text box
		driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("Hi, I am Madhu");
		//click on generate file button
		driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
		//click on download
		driver.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();
		//Search file in downloads and if file exists then print
		File f=new File("C:\\Users\\Hemanth\\Desktop\\AUTOMATIONTESTING_COMBINED_PROJECT\\AUTOMATIONTESTING_COMBINED_PROJECT\\Screenshots");
		boolean b=f.exists();
		if(b) 
			System.out.println("file exists");
	}
	public void quit()
	{
		driver.close();
	}
}
