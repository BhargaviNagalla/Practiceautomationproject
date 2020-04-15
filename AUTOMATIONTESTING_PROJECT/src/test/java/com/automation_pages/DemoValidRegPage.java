package com.automation_pages;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoValidRegPage {
	Logger log = Logger.getLogger("devpinoyLogger");
	WebDriver driver;
	By FirstName=By.xpath("//input[@placeholder='First Name']");       //xpath of Firstname is called
	By LastName=By.xpath("//input[@placeholder='Last Name']");         //xpath of Lastname is called
	By address=By.xpath("//textarea[@ng-model='Adress']");             //xpath of address is called
	By Email=By.xpath("//input[@ng-model='EmailAdress']");             //xpath of Email is called
	By Gender=By.xpath("//input[@value='FeMale']");                    //xpath of gender is called
	By phone=By.xpath("//input[@ng-model='Phone']");                   //xpath of phone is called
	By checkbox1=By.id("checkbox1");                                   //xpath of checkbox1 is called
	By checkbox3=By.id("checkbox3");                                    //xpath of checkbox3 is called
	By language=By.xpath("//div[@style='min-height:30px;max-width:200px']");
	By English=By.linkText("English");                                  //linktext of language is called
	By Skills=By.id("Skills");                                           //Id of skill is called
	By text=By.xpath("//select[@type='text']");                           
	By country=By.xpath("//option[@value='India']");                      //xpath country is called
	By select=By.xpath("//span[@class='select2-selection select2-selection--single']");
	By searchtext=By.xpath("//input[@type='search']");                     //xpath of searchtext is called
	By countrytext=By.xpath("//input[@type='search']");                     //xpath of countrytext is called
	By year=By.id("yearbox");                                               //id of year is called
	By Month=By.xpath("//select[@placeholder='Month']");                     //xpath of month is called
	By day=By.id("daybox");                                                  //id of day is called
	By Firstpassword=By.id("firstpassword");                                 //xpath of Firstpassword is called
	By secondpassword=By.id("secondpassword");                                //xpath of secondpassword is called
	By uploadingElement=By.xpath("//input[@type='file']");                        //xpath of uploadingelement is called
	//By ClickSubmit=By.xpath("//button[@value='sign up']");
	By ClickSubmit=By.xpath("//*[@id=\"submitbtn\"]");                         //xpath Clicksubmit is called
	By validreg=By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]/b");       //xpath of validreg is called
	By Demosite=By.linkText("Demo Site");                                        //xpath of demosite is called
	public DemoValidRegPage(WebDriver driver) 
	{
		this.driver =driver;
	}
	
		//To click on demosite
	public void ClickDemosite() {
		driver.findElement(Demosite).click();
	
	}
	//To fill valid details
	public void fillValiddetails() throws Exception {
		driver.findElement(FirstName).sendKeys("Bhargavi");  //firstname is  given
		driver.findElement(LastName).sendKeys("Nagalla");    //lastname is given
		driver.findElement(address).sendKeys("vadlamudi,guntur");//address is given
		driver.findElement(Email).sendKeys("bhargavinagalla15@gmail.com");//valid emailid is entered
		List<WebElement> rb = driver.findElements(Gender);//Gender is selected
		((WebElement) rb.get(0)).click();
		driver.findElement(phone).sendKeys("9010708135");//phone number is given
		driver.findElement(checkbox1).click(); //checkbox 1 is selected
		driver.findElement(checkbox3).click();//checkbox 3 is selected
		
		WebElement we1 = driver.findElement(Skills);//Skills is selected
		Select se1= new Select(we1);
		se1.selectByVisibleText("C");       
		driver.findElement(text).click();//click on the country text
		driver.findElement(country).click();//country is selected
		
		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span")).click();
		 driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("India");//India is selected
		 
		 driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);//country is entered
		 
		 
		  driver.findElement(select).click();
		  driver.findElement(searchtext).click();
		  driver.findElement(countrytext).sendKeys("India");//click on India
		  Actions act = new Actions(driver); 
		  Thread.sleep(30);
		  act.sendKeys(Keys.ENTER);
		WebElement we6 = driver.findElement(year);
		Select se6= new Select(we6);
		se6.selectByVisibleText("1994");//year is selected
		
		WebElement we4 = driver.findElement(Month);
		Select se4 = new Select(we4);
		se4.selectByVisibleText("September");//month is selected
		WebElement we5 = driver.findElement(day);
		Select se5 = new Select(we5);
		se5.selectByVisibleText("30");//day is selected
		driver.findElement(Firstpassword).sendKeys("Chinni@12"); //password is set
		driver.findElement(secondpassword).sendKeys("Chinni@12");//password is confirmed
		WebElement uploadElement = driver.findElement(uploadingElement);//to upload photo
		uploadElement.sendKeys("C:\\Users\\User\\Pictures\\Screenshots\\Screenshot (1).png");//photo is uploaded
		log.info("valid details are filled ");

	}
	//To click on submit
	public void clickSubmit() {
		driver.findElement(ClickSubmit).click();//Submit button is clicked
		log.info("submit button is clicked");
	}
	//Assert
	public void AssertValidreg() {
		String b = driver.findElement(validreg).getText();//valid registration text stored in string
		System.out.println(b);        //string b is printed
		System.out.println("submitted Successfully");//msg is printed
		log.info("assertion is done ");
	}
	//To take screenshot
	public void Screenshot() throws Exception {
		TakesScreenshot ts= (TakesScreenshot)driver;//screen shot is taken
		File source=ts.getScreenshotAs(OutputType.FILE);//get screenshot 
		FileUtils.copyFile(source,new File("src\\test\\resources\\screenShot\\DemovalidReg.png"));
		log.info("screenshot is taken");
	}
	//To close the browser window
		public void quit() {
			driver.close();//driver is closed
		}
	
}


