package com.automation_pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {
	WebDriver driver; // All the locators are given
	By Demosite = By.xpath("//*[@id=\"menu-item-251\"]/a");// Button to click on demosite
	By Switch = By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a");// Button for switch in demosite
	By alerts = By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a");// to click alerts
	By button = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button"); //button in demosite to operate
	
	public Alerts(WebDriver driver) { // Constructor is used to call the methods from the stepdefinitions
		this.driver = driver;
	}
	public void demosite() {
		driver.findElement(Demosite).click();//demosite page will be opened
		
	}

	public void alertoperation() { // Method to run the alert scenario
		
		Actions act = new Actions(driver);
		WebElement we = driver.findElement(Switch);
		act.moveToElement(we);
		WebElement we1 = driver.findElement(alerts);
		act.moveToElement(we1).click().build().perform();
	}

	public void gettext() throws InterruptedException // Method to print the alert message
	{
		driver.findElement(button).click();
		Alert aler = driver.switchTo().alert();
	     String msg = aler.getText();
		 System.out.println(msg);
		Thread.sleep(8000);
	}

	public void quit() throws InterruptedException { // Method to close the browser
		////Thread.sleep(3000);
		driver.close();
	}

}