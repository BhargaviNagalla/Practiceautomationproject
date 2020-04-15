package com.automation_pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EditShippingAddressPage {
	Logger log = Logger.getLogger("devpinoyLogger");
	WebDriver driver;
	By Myaccount=By.linkText("My Account");//linkText of Myaccount
	By Username=By.id("username");//xpath of username is called
	By Password=By.id("password");//xpath of password is called
	By login=By.xpath("//input[@name='login']");//xpath of login is called
	By Address=By.linkText("Addresses");//linktext of address is called
	By editshipping=By.xpath("//a[@href='http://practice.automationtesting.in/my-account/edit-address/shipping']");//xpath of edit is called
	By shippingfirstname=By.id("shipping_first_name");//xpath of firstname is called
	By shippinglastname=By.id("shipping_last_name");//xpath of lastrname is called
	By shippingcompany=By.id("shipping_company");//xpath of company is called
	By shippingaddress1=By.id("shipping_address_1");//xpath of address1 is called
	By shippingaddress2=By.id("shipping_address_2");//xpath of address2 is called
	By shippingcity=By.id("shipping_city");//xpath of city is called
	By shippingpostcode=By.id("shipping_postcode");//xpath of postcode is called
	By clicksaveaddress=By.name("save_address");//xpath of saveaddress is called
	By Shipping=By.xpath("//div[@class='woocommerce-message']");//xpath of shipping is called
	
	public EditShippingAddressPage(WebDriver driver) 
	{
		this.driver =driver;
	}
	
	//To click on address
	public void clickAddresses() {
		driver.findElement(Address).click();//address is clicked
		log.info("Addresses is clicked ");
	}
	//To edit shipping address
	public void editShipping() {
		driver.findElement(editshipping).click();//edit is clicked
		log.info("editshipping is clicked ");
	}
	//To fill shipping details
	public void fillShippingDetails() {
		driver.findElement(shippingfirstname).clear();
		driver.findElement(shippingfirstname).sendKeys("Bhargavi");//First name is given
		driver.findElement(shippinglastname).clear();
		driver.findElement(shippinglastname).sendKeys("Nagalla");//last name is given
		driver.findElement(shippingcompany).clear();
		driver.findElement(shippingcompany).sendKeys("cts");//company name is given
		driver.findElement(shippingaddress1).clear();
		driver.findElement(shippingaddress1).sendKeys("9-249");//address1 is given
		driver.findElement(shippingaddress2).clear();
		driver.findElement(shippingaddress2).sendKeys("tidal");//address2 is given
		driver.findElement(shippingcity).clear();
		driver.findElement(shippingcity).sendKeys("Hydereabad");//city is given
		driver.findElement(shippingpostcode).clear();
		driver.findElement(shippingpostcode).sendKeys("456213");//postcode is given
		log.info("valid details are filled");
	}
	//To save address
	public void clickSaveAddress() {
		driver.findElement(clicksaveaddress).click();//save address is clicked
		log.info("saveAddresses is clicked ");
	}
	//Assert
	public void AssertShipping() {
		String a = driver.findElement(Shipping).getText();//shipping address text is stored in string
		Assert.assertEquals("Address changed successfully.",a);//both the strings are asserted
		System.out.println("Shipping saved Successfully");//msg is printed
		log.info("Assert shipping is done ");
	}
	//To take screenshot
	public void Screenshot() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);//to get screenshot
		FileUtils.copyFile(source,new File("src\\test\\resources\\screenShot\\ShippingAddress.png"));//screenshot is created
	}
	//To close the browser window
		public void quit() {
			driver.close();//browser is closed
		}
}

		

