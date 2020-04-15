package com.automation_pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Videoplay {            // All locators are declared           
	WebDriver driver;
	By Demo = By.xpath("//a[text()='Demo Site']");
	By Video = By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[7]");
	By youtube = By.xpath("/html/body/header/nav/div/div[2]/ul/li[7]/ul/li[1]");
	By Play = By.xpath("/html/body/section/div[1]/div/div/iframe");

	public Videoplay(WebDriver driver) {    // Constructor to call the declared methods from this broswer
		this.driver = driver;
	}
	    public void demosite() {
	    	driver.findElement(Demo).click();
	    	
	    }

	public void vplay() throws InterruptedException // Method to play the sample video in demosite 
                                                                                                      
	{    
	        
 
		Actions act = new Actions(driver);
		WebElement we = driver.findElement(Video);
		WebElement we1 = driver.findElement(youtube);
		act.moveToElement(we);
		act.moveToElement(we1).click().build().perform();
		driver.findElement(Play).click();


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