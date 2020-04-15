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

public class UpdatePassword {
	Logger log = Logger.getLogger("devpinoyLogger");
	WebDriver driver;
	By Myaccount=By.linkText("My Account");//linktext of myaccount
	By Username=By.id("username"); //id of username
	By Password=By.id("password");//id of password
	By login=By.xpath("//input[@name='login']");//xpath of login
	By accountfirstname=By.id("account_first_name");//id of firstname
	By accountlastname=By.id("account_last_name");//id of lastname
	By passwordcurrent=By.id("password_current");//id of currentpassword
	By password1=By.id("password_1"); //id of password1
	By password2=By.id("password_2");//id of password2
	By accountdetails=By.linkText("Account Details");//linktext of accountdetails
	By saveaccountdetails=By.name("save_account_details");//xpath of saveaccount details

	public UpdatePassword(WebDriver driver) 
	{
		this.driver=driver;
	}
	//To check account details
	public void clickAccountDetails() {
		driver.findElement(accountdetails).click();//click on account
		log.info("Addresses is clicked ");
	}
	//To fill change password
	public void fillChangePassword() {
		driver.findElement(accountfirstname).clear();
		driver.findElement(accountfirstname).sendKeys("Bhargavi");//First name is given
		driver.findElement(accountlastname).clear();
		driver.findElement(accountlastname).sendKeys("Nagalla");//Last name is given
		driver.findElement(passwordcurrent).sendKeys("Bhargavinagalla");//current password is given
		driver.findElement(password1).sendKeys("Vyshnavinagalla");//updated password is given
		driver.findElement(password1).click();//click on updated password
		driver.findElement(password2).sendKeys("Vyshnavinagalla");//confirm updated password
		log.info("details are updated");
		
	}
	//To save changes
	public void clickSaveChanges() {
		driver.findElement(saveaccountdetails).click();//save changes is clicked
		System.out.println("password changed successfully");//password changed successfully is printed
		log.info("saveAddresses is clicked ");
	}
	
	//To take screenshot
	public void Screenshot() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);// to get screenshot
		FileUtils.copyFile(source,new File("src\\test\\resources\\screenShot\\PasswordUpdated.png"));//screenshot is taken

	}
	//To close the browser window
		public void quit() {
			driver.close();//browser is closed
		}
}
