package com.automation_stepdefinition;

import com.automation_pages.automation_seeingstock_addtocart_page;
import com.automation_pages.automation_verify_title_page;
import com.baseclass.LibraryClass;
import com.seleniumutil.selenium_util;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class automation_stockandadd_step extends LibraryClass{

	
	
	  selenium_util util;
	  automation_seeingstock_addtocart_page stock;
	
	@Given("^launch the automation page$")
	public void launch_the_automation_page() throws Throwable {
		launchApp();
	}

	@Then("^open the product$")
	public void open_the_product() throws Throwable {
		stock = new automation_seeingstock_addtocart_page(driver);
		stock.automation_openproduct();
	    
	}

	@Then("^verify whether product is in stock or not$")
	public void verify_whether_product_is_in_stock_or_not() throws Throwable {
		stock = new automation_seeingstock_addtocart_page(driver);
		stock.automation_stockcheck();
	}

	@Then("^add product to the cart$")
	public void add_product_to_the_cart() throws Throwable {
		System.out.println("if stock is available item is added to cart");
		driver.quit();
	}

	

}
