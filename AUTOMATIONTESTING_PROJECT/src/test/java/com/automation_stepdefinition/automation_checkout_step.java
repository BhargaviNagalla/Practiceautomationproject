package com.automation_stepdefinition;

import com.automation_pages.automation_checkout_page;
import com.automation_pages.automation_deleteitemincart_page;
import com.automation_pages.automation_seeingstock_addtocart_page;
import com.baseclass.LibraryClass;
import com.seleniumutil.selenium_util;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class automation_checkout_step extends LibraryClass{
	
	
	  selenium_util util;
	  automation_seeingstock_addtocart_page stock;
	  automation_deleteitemincart_page remove;
	  automation_checkout_page checkout;
	  

	  @Given("^launch the automation practice website$")
	  public void launch_the_automation_practice_website() throws Throwable {
		  launchApp();
	  }
	

	@Then("^open cart$")
	public void open_cart() throws Throwable {
		
		checkout = new automation_checkout_page(driver);
		checkout.automation_addproduct();	
	}
	
	
	@Then("^click on proceed$")
	public void click_on_proceed() throws Throwable {
	  checkout = new automation_checkout_page(driver);
	  checkout.automation_proceed();
	}

	@Then("^enter delivery details and payment type$")
	public void enter_delivery_details_and_payment_type() throws Throwable {
		 checkout = new automation_checkout_page(driver);
		  checkout.automation_address("surya", "teja");
	}

	@Then("^place order$")
	public void place_order() throws Throwable {
		
		checkout = new automation_checkout_page(driver);
		  checkout.automation_placeorder();
		  //checkout.automation_placeorder();
	}

	@Then("^it is directed to another page$")
	public void it_is_directed_to_another_page() throws Throwable {
		checkout = new automation_checkout_page(driver);
		checkout.automation_anotherpage();
		util = new selenium_util(driver);
		util.takeSnapShot("C:\\Users\\Hemanth\\Desktop\\AUTOMATIONTESTING_COMBINED_PROJECT\\AUTOMATIONTESTING_COMBINED_PROJECT\\Screenshots\\practice_automation_cart.png");
		driver.quit();
	}

}
