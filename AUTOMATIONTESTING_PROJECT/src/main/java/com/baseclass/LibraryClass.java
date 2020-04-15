package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LibraryClass {
	protected WebDriver driver;
	public static Properties prop;
	 
	 Logger LOG = Logger.getLogger(LibraryClass.class.getName());
//To launch
	 public void launchApp() throws IOException {
		FileInputStream fis =new FileInputStream("C:\\\\Users\\\\Hemanth\\\\eclipse-workspace\\\\Project_PracticeAutomation\\\\src\\\\test\\\\resources\\\\config.property\\\\configuration.property");
		prop =new Properties();
		 prop.load(fis);
		 String browser = prop.getProperty("browser");
		
		 //launch Chrome Browser
		 if(browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver","C://Users//Hemanth//Downloads//chromedriver_win32//chromedriver.exe");
			 driver = new ChromeDriver();
			 LOG.info("Chrome is Launched");
			 
			 
		 }
		 //Launch Firefox Broswer
		 else if (browser.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.gecko.driver","C://Users//Hemanth//Downloads//geckodriver-v0.26.0-win64//geckodriver.exe");
			 driver = new FirefoxDriver();
			 LOG.info("FireFox is Launched");
		 }
		 
		// Launch Internet Explorer Brower
		 else if (browser.equalsIgnoreCase("ie")) {
			 System.setProperty("webdriver.IE.driver","C://Users//Hemanth//Downloads//IEDriverServer_x64_3.8.0//IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			 LOG.info("Internet Explorer is Launched");
		 }
		 
		
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("http://practice.automationtesting.in/");
			System.out.println(driver.getTitle());
 
       }
           //To close the application
      public void quit() {
	   driver.close();
  }


}
