package com.automation_pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class automation_checkout_page {
	
	Logger LOG = Logger.getLogger("devpinoyLogger");
	 WebDriver driver;
	 By clickshop = By.linkText("Shop");//Button to click the shop
	 By addtocart = By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[5]/a[2]");//Button to add product to the basket 
	 By opencart = By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[5]/a[3]");// Button to open or view the cart
	 By proceed = By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a");//Button to proceed to for the checkout
	 By placeorder = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form[3]/div[2]/div/div/input[1]");//Button to proceed to for the checkout
	

	
	public automation_checkout_page(WebDriver driver) 
	{
		this.driver =driver;
	}
	// add product to cart
		public void automation_addproduct() {
			driver.findElement(clickshop).click();//To open the shop
	        driver.findElement(addtocart).click();//To add item to cart
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        driver.findElement(opencart).click();//to open the cart
			LOG.info("product is added to cart");
		}
		

	// click proceed to checkout
	public void automation_proceed() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.findElement(proceed).click();
		LOG.info(" The cart is proceeded for checkout");
	}
	
	//Enter the address and payment mode
	public void automation_address(String fname, String lname ) {
		driver.findElement(By.xpath("//input[@id='billing_first_name']")).sendKeys(fname);// Firstname  for checkout details
		driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys(lname);// lastname for checkout details
		driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys("kjsdhDH@gmail.com");//Giving Email address for checkout details
		driver.findElement(By.xpath("//*[@id=\"billing_phone\"]")).sendKeys("685487486");//Giving mobile number for checkout details
		driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("ksdjayewb oiwefg");//Giving  address details for checkout details
		driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("guntur");//Giving town for checkout details
		driver.findElement(By.xpath("//*[@id=\"select2-chosen-2\"]")).click();//selecting state for checkout details
		driver.findElement(By.xpath("//*[@id=\"s2id_autogen2_search\"]")).sendKeys("andhra pradesh");//selecting state for checkout details
		driver.findElement(By.xpath("//*[@id=\"select2-results-2\"]/li[1]")).click();//selecting country for checkout details
		driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("52207");//Entering pincode for checkout details
		LOG.info("Enterd details in address field");
	}
	
	// place the order
	public void automation_placeorder() {
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/form[3]/div[2]/div/div/input[1]")).click();//To place the order
		LOG.info("Login Button is Clicked");
	}

	// to check whether another page is opened or not
		public void automation_anotherpage() {
			String act_nextpage =  driver.findElement(By.xpath("//*[@id=\"page-35\"]/div/div[1]/p[1]")).getText();//To get the order title of nextpage
			String exp_nextpage ="Thank you. Your order has been received.";//Given the expected title
			if(act_nextpage.equalsIgnoreCase(exp_nextpage))//matching the nextpage order details
				System.out.println("directed to another page or order succesfully placed");
			LOG.info("order placed successfully");
		}
		public void quit() throws Exception
		{
			Thread.sleep(2000);
			driver.close();
		}
}