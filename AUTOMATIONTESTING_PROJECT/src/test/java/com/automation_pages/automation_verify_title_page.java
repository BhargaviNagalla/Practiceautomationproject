package com.automation_pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class automation_verify_title_page {
	Logger LOG = Logger.getLogger("devpinoyLogger");
	 WebDriver driver;
	String act_title;


	

	
	public automation_verify_title_page(WebDriver driver) 
	{
		this.driver =driver;
	}

	// Get the actual title
	public void automation_getacttitle() {
		

		 act_title = driver.getTitle();// to get the actual title from the home page
		LOG.info("actual title is taken from the application ");
	}
	
	//compare the actual and expected title
	public void automation_verifytitle() {

		 act_title = driver.getTitle();
		System.out.println(act_title);// to get the actual title from the home page
		if(act_title.equals("Automation Practice Site"))// comparing the actual title with expected title
		{
			System.out.println("TITLE MATCHED");
		}
		else
		{
			System.out.println("not matched");
		}
		
			
		LOG.info(" Title verified");
		
		
	
	
	}

}