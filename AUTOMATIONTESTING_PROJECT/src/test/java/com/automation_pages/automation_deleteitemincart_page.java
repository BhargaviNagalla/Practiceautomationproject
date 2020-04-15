package com.automation_pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class automation_deleteitemincart_page {
	Logger LOG = Logger.getLogger("devpinoyLogger");
	 WebDriver driver;
	By shop = By.linkText("Shop");// To click shop button
	By addtobasket = By.xpath("//*[@id=\"content\"]/ul/li[3]/a[2]"); //Button to click add to basket
	By opencart = By.xpath("//*[@id=\"content\"]/ul/li[3]/a[3]"); // Button to open the cart
	By remove= By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[1]/a"); // Button to remove
	
	public automation_deleteitemincart_page(WebDriver driver) 
	{
		this.driver =driver;
	}
	// add to  cart
		public void automation_addtocart()  {
			
			driver.findElement(shop).click();// Shop button is clicked
			driver.findElement(addtobasket).click();// To add item to the basket
			LOG.info(" addded to  the cart ");	
		}

	// open cart
	public void automation_cartopen() {
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(opencart).click();// To open the cart
	
		LOG.info(" opened the cart ");
	}
	
	// delete item from the cart
	public void automation_removeitem() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(remove).click(); // To remove the item or product from cart
		LOG.info("product is deleted form the cart");
	}
	public void quit() throws Exception
	{
		Thread.sleep(2000);
		driver.close();
	}
}

