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

public class EditBillingAddressPage {
	Logger log = Logger.getLogger("devpinoyLogger");
	WebDriver driver;
	By Myaccount=By.linkText("My Account");//linktext is called
	By Username=By.id("username");//id of username is called
	By Password=By.id("password");//id of password is called
	By login=By.xpath("//input[@name='login']");//xpath of login is called
	By Address=By.linkText("Addresses");//xpath of address is called 
	By editbilling=By.xpath("//a[@href='http://practice.automationtesting.in/my-account/edit-address/billing']");//xpath of editbilling is called
	By firstname=By.id("billing_first_name");//xpath of firstname
	By lastname=By.id("billing_last_name");//xpath of lastname
	By company=By.id("billing_company");//xpath of company
	By Phone=By.id("billing_phone");//xpath of phonenumber
	By address1=By.id("billing_address_1");//xpath of address1
	By address2=By.id("billing_address_2");//xpath of address2
	By city=By.id("billing_city");  //xpath of billingcity
	By pstcode=By.id("billing_postcode");//xpath of postcode
	By saveaddress=By.xpath("//input[@type='submit']");//xpath of saveaddress
	By billing=By.xpath("//div[@class='woocommerce-message']");//xpath of billing
	public EditBillingAddressPage(WebDriver driver) 
	{
		this.driver =driver;
	}
	
	//To enter login credentials
	public void loginCredentials(String user, String password) {
		driver.findElement(Myaccount).click();//My account is clicked
		driver.findElement(Username).sendKeys(user);//user name is given
		driver.findElement(Password).sendKeys(password);//password is given
		driver.findElement(login).click();//login is clicked
		log.info("login details are filled ");
	}
	//To click on address
	public void clickAddresses() {
		driver.findElement(Address).click();//address is clicked 
		log.info("Addresses is clicked ");
	}
	//To edit billing address
	public void editBilling() {
		driver.findElement(editbilling).click();//edit is clicked
		log.info("edit is clicked ");
	}
	//To fill billing details
	public void fillDetails() {
		
		driver.findElement(firstname).clear();
		driver.findElement(firstname).sendKeys("Bhargavi");//first name is given
		driver.findElement(lastname).clear();
		driver.findElement(lastname).sendKeys("Nagalla");//Last name is given
		driver.findElement(company).clear();
		driver.findElement(company).sendKeys("cts");//company name is given
		driver.findElement(Phone).clear();
		driver.findElement(Phone).sendKeys("1223678912");//phone number is given
		driver.findElement(address1).clear();
		driver.findElement(address1).sendKeys("2-300");//address1 is given
		driver.findElement(address2).clear();
		driver.findElement(address2).sendKeys("kumar naga");//address2 is given
		driver.findElement(city).clear();
		driver.findElement(city).sendKeys("Hyderabad");//cityname is given
		driver.findElement(pstcode).clear();
		driver.findElement(pstcode).sendKeys("456789");//postcode is given
		log.info("valid details are filled");
		
	}
	//To save address
	public void clickSaveAddresses() {
		driver.findElement(saveaddress).click();//save address is clicked
		log.info("saveAddresses is clicked ");
	}
	//Assert
	public void AssertBilling() {
		String a = driver.findElement(billing).getText();//billing text is stored in string
		Assert.assertEquals("Address changed successfully.",a);//asserted when navigated to next page
		System.out.println("Billing saved Successfully");//msg is printed
	}
	//To take screenshot
	public void Screenshot() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;//take screen shot
		File source=ts.getScreenshotAs(OutputType.FILE);//get screenshot
		FileUtils.copyFile(source,new File("src\\test\\resources\\screenShot\\Billingaddress.png"));//screenshot is created
	}
	//To close the browser window
		public void quit() {
			driver.close();//close the browser
		}
	
}


