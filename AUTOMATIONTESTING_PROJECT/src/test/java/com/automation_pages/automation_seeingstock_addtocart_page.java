package com.automation_pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class automation_seeingstock_addtocart_page {
	Logger LOG = Logger.getLogger("devpinoyLogger");
	 WebDriver driver;
	By clickshop = By.xpath("//*[@id=\"menu-item-40\"]/a");// To open the shop
	By productclick = By.xpath("//*[@id=\"content\"]/ul/li[2]/a[1]/h3"); // To Open the product
	By addtocart = By.xpath("//*[@id=\"product-170\"]/div[2]/form/button");//To add the product
	

	
	public automation_seeingstock_addtocart_page(WebDriver driver) 
	{
		this.driver =driver;
	}

	//open product
	public void automation_openproduct() {
		driver.findElement(clickshop).click();// Shop is opened 

		driver.findElement(productclick).click();// To open the cart
		LOG.info("product is opened ");
	}
	
	//verify whether stock is available or not
	public void automation_stockcheck() {
		String act_stock = driver.findElement(By.xpath("//*[@id=\"product-170\"]/div[2]/p")).getText();//To get the stock details form the product page
		String exp_stock = "out of stock";// given the expected stock details
		if(act_stock.equalsIgnoreCase(exp_stock)) //comparing the expected and actual stock details
		{
			System.out.println("stock is not available");
		}
		else {
			System.out.println("stock is  available");
			driver.findElement(addtocart).click();// if stock is available then item will be added to cart
		}
		LOG.info("product is in stock");
	}
	

}
